/**
 *
 */
package com.borngroup.ssl.core.interceptors;

import de.hybris.platform.servicelayer.i18n.I18NService;
import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;

import com.borngroup.ssl.core.model.SslProductSteppedMultiBuyDiscountPromotionModel;

/**
 * @author shilpaverma
 *
 */
public class SslProductSteppedMultiBuyDiscountPromotionInitDefaultInterceptor implements
        InitDefaultsInterceptor<SslProductSteppedMultiBuyDiscountPromotionModel> {

    @Resource(name = "coreMessageSource")
    private MessageSource coreMessageSource;

    @Resource(name = "i18nService")
    private I18NService i18nService;

    /*
     * (non-Javadoc)
     *
     * @see de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor#onInitDefaults(java.lang.Object,
     * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
     */
    @Override
    public void onInitDefaults(final SslProductSteppedMultiBuyDiscountPromotionModel paramMODEL,
            final InterceptorContext paramInterceptorContext) throws InterceptorException {
        paramMODEL
                .setMessageCouldHaveFired(coreMessageSource.getMessage(
                        "type.sslproductsteppedmultibuydiscountpromotion.messageCouldHaveFired.defaultvalue", null,
                        i18nService.getCurrentLocale()));
        paramMODEL.setMessageFired(coreMessageSource.getMessage(
                "type.sslproductsteppedmultibuydiscountpromotion.messageFired.defaultvalue", null, i18nService.getCurrentLocale()));
    }

}
