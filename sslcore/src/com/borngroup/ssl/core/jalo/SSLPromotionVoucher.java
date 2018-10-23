/**
 *
 */
package com.borngroup.ssl.core.jalo;

import de.hybris.platform.jalo.ExtensibleItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.price.Discount;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.DiscountValue;
import de.hybris.platform.util.localization.Localization;
import de.hybris.platform.voucher.jalo.PromotionVoucher;
import de.hybris.platform.voucher.jalo.Voucher;
import de.hybris.platform.voucher.jalo.VoucherManager;
import de.hybris.platform.voucher.jalo.util.VoucherValue;

import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

/**
 * @author NagarroDev
 *
 */
public class SSLPromotionVoucher extends PromotionVoucher {

    private static final Logger LOG = Logger.getLogger(SSLPromotionVoucher.class);

    @Override
    protected Item createItem(final SessionContext ctx, final ComposedType type, final Item.ItemAttributeMap allAttributes)
            throws JaloBusinessException {
        String voucherCode = (String) allAttributes.get("voucherCode");
        String code = (String) allAttributes.get("code");
        if (StringUtils.isNotBlank(code)) {
            code = code.toUpperCase();
            allAttributes.put("code", code);
        }
        if (StringUtils.isNotBlank(voucherCode)) {
            voucherCode = voucherCode.toUpperCase();
            allAttributes.put("voucherCode", voucherCode);
            final Voucher voucher = VoucherManager.getInstance(getSession()).getVoucher(voucherCode);
            if (voucher != null) {
                throw new JaloInvalidParameterException(MessageFormat.format(
                        Localization.getLocalizedString("type.promotionvoucher.error.vouchercode.not.unique"), new Object[] { voucherCode,
                                voucher.getName() }), 0);
            }
        }
        return super.createItem(ctx, type, allAttributes);
    }

    @Override
    public VoucherValue getVoucherValue(final AbstractOrder anOrder) {
        final Iterator discounts = anOrder.getDiscounts().iterator();
        boolean found = false;
        boolean applyFreeShipping = false;
        String voucherCode = StringUtils.EMPTY;
        while ((discounts.hasNext()) && (!(found))) {
            final Discount discount = (Discount) discounts.next();
            if (!(discount instanceof Voucher)) {
                continue;
            }
            final Voucher voucher = (Voucher) discount;
            if ((!(voucher.isApplicable(anOrder))) || (!(voucher.isFreeShippingAsPrimitive()))) {
                voucherCode = voucher.getCode();
                continue;
            }
            if (voucher.equals(this)) {
                applyFreeShipping = true;
            }
            found = true;

        }

        if (LOG.isDebugEnabled()) {
            LOG.debug("Processed voucher: [" + getCode() + "] " + getName());
            LOG.debug("Free shipping is: " + isFreeShippingAsPrimitive());
            LOG.debug("Free shipping will apply: " + applyFreeShipping);
        }

        VoucherValue applicableValue = getApplicableValue(anOrder);
        Object totalDiscounts = ((ExtensibleItem) anOrder).getProperty("totalDiscounts");

        double voucherValue = 0.0;
        if (anOrder.getGlobalDiscountValues() != null) {
            final List<DiscountValue> discountValues = anOrder.getGlobalDiscountValues();
            for (final DiscountValue discountValue : discountValues) {
                if (discountValue.getCode() != null && discountValue.getCode().equals(voucherCode)) {
                    voucherValue = discountValue.getValue();
                }
            }
        }
        totalDiscounts = (Double) totalDiscounts - voucherValue;
        final Double totalDiscountsDouble = null != totalDiscounts ? ((Double) totalDiscounts) : Double.valueOf(0.0D);
        applicableValue = new VoucherValue(applicableValue.getValue() - totalDiscountsDouble.doubleValue(), anOrder.getCurrency());

        final Currency resultCurrency;
        double resultValue;
        if (isAbsolute().booleanValue()) {
            resultValue = Math.min(applicableValue.getCurrency().convertAndRound(getCurrency(), applicableValue.getValue()), getValue()
                    .doubleValue());
            resultCurrency = getCurrency();
        } else {
            resultValue = applicableValue.getValue() * getValue().doubleValue() / 100.0D;
            resultCurrency = applicableValue.getCurrency();
        }
        if ((isFreeShippingAsPrimitive()) && (applyFreeShipping)) {
            resultValue += anOrder.getCurrency().convertAndRound(resultCurrency, anOrder.getDeliveryCosts());
        }
        return new VoucherValue(resultValue, resultCurrency);
    }

    @Override
    public void setVoucherCode(final SessionContext ctx, String param) {
        if (StringUtils.isNotBlank(param)) {
            param = param.toUpperCase();
            final Voucher voucher = VoucherManager.getInstance(getSession()).getVoucher(param);
            if ((voucher != null) && (voucher != this)) {
                throw new JaloInvalidParameterException(MessageFormat.format(
                        Localization.getLocalizedString("type.promotionvoucher.error.vouchercode.not.unique"), new Object[] { param,
                                voucher.getName() }), 0);
            }
        }
        super.setVoucherCode(ctx, param);
    }

    @Override
    public boolean checkVoucherCode(final String aVoucherCode) {
        return aVoucherCode.equalsIgnoreCase(getVoucherCode());
    }
}
