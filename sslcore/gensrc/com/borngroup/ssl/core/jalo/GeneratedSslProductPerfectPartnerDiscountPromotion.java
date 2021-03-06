/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 22 Oct, 2018 11:46:56 AM                    ---
 * ----------------------------------------------------------------
 */
package com.borngroup.ssl.core.jalo;

import com.borngroup.ssl.core.constants.SslCoreConstants;
import com.borngroup.ssl.core.jalo.PromotionPercentageDiscountRow;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.promotions.jalo.ProductPromotion;
import de.hybris.platform.util.PartOfHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.borngroup.ssl.core.jalo.SslProductPerfectPartnerDiscountPromotion SslProductPerfectPartnerDiscountPromotion}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSslProductPerfectPartnerDiscountPromotion extends ProductPromotion
{
	/** Qualifier of the <code>SslProductPerfectPartnerDiscountPromotion.partnerProducts</code> attribute **/
	public static final String PARTNERPRODUCTS = "partnerProducts";
	/** Qualifier of the <code>SslProductPerfectPartnerDiscountPromotion.partnerProductList</code> attribute **/
	public static final String PARTNERPRODUCTLIST = "partnerProductList";
	/** Qualifier of the <code>SslProductPerfectPartnerDiscountPromotion.partnerPercentageDiscounts</code> attribute **/
	public static final String PARTNERPERCENTAGEDISCOUNTS = "partnerPercentageDiscounts";
	/** Qualifier of the <code>SslProductPerfectPartnerDiscountPromotion.messageFired</code> attribute **/
	public static final String MESSAGEFIRED = "messageFired";
	/** Qualifier of the <code>SslProductPerfectPartnerDiscountPromotion.messageCouldHaveFired</code> attribute **/
	public static final String MESSAGECOULDHAVEFIRED = "messageCouldHaveFired";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ProductPromotion.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PARTNERPRODUCTS, AttributeMode.INITIAL);
		tmp.put(PARTNERPRODUCTLIST, AttributeMode.INITIAL);
		tmp.put(PARTNERPERCENTAGEDISCOUNTS, AttributeMode.INITIAL);
		tmp.put(MESSAGEFIRED, AttributeMode.INITIAL);
		tmp.put(MESSAGECOULDHAVEFIRED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductPerfectPartnerDiscountPromotion.messageCouldHaveFired</code> attribute.
	 * @return the messageCouldHaveFired - The message to show when the promotion could have
	 *                             potentially fire.
	 */
	public String getMessageCouldHaveFired(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSslProductPerfectPartnerDiscountPromotion.getMessageCouldHaveFired requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, MESSAGECOULDHAVEFIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductPerfectPartnerDiscountPromotion.messageCouldHaveFired</code> attribute.
	 * @return the messageCouldHaveFired - The message to show when the promotion could have
	 *                             potentially fire.
	 */
	public String getMessageCouldHaveFired()
	{
		return getMessageCouldHaveFired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductPerfectPartnerDiscountPromotion.messageCouldHaveFired</code> attribute. 
	 * @return the localized messageCouldHaveFired - The message to show when the promotion could have
	 *                             potentially fire.
	 */
	public Map<Language,String> getAllMessageCouldHaveFired(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,MESSAGECOULDHAVEFIRED,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductPerfectPartnerDiscountPromotion.messageCouldHaveFired</code> attribute. 
	 * @return the localized messageCouldHaveFired - The message to show when the promotion could have
	 *                             potentially fire.
	 */
	public Map<Language,String> getAllMessageCouldHaveFired()
	{
		return getAllMessageCouldHaveFired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductPerfectPartnerDiscountPromotion.messageCouldHaveFired</code> attribute. 
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have
	 *                             potentially fire.
	 */
	public void setMessageCouldHaveFired(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSslProductPerfectPartnerDiscountPromotion.setMessageCouldHaveFired requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MESSAGECOULDHAVEFIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductPerfectPartnerDiscountPromotion.messageCouldHaveFired</code> attribute. 
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have
	 *                             potentially fire.
	 */
	public void setMessageCouldHaveFired(final String value)
	{
		setMessageCouldHaveFired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductPerfectPartnerDiscountPromotion.messageCouldHaveFired</code> attribute. 
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have
	 *                             potentially fire.
	 */
	public void setAllMessageCouldHaveFired(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,MESSAGECOULDHAVEFIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductPerfectPartnerDiscountPromotion.messageCouldHaveFired</code> attribute. 
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have
	 *                             potentially fire.
	 */
	public void setAllMessageCouldHaveFired(final Map<Language,String> value)
	{
		setAllMessageCouldHaveFired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductPerfectPartnerDiscountPromotion.messageFired</code> attribute.
	 * @return the messageFired - The message to show when the promotion has fired.
	 */
	public String getMessageFired(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSslProductPerfectPartnerDiscountPromotion.getMessageFired requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, MESSAGEFIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductPerfectPartnerDiscountPromotion.messageFired</code> attribute.
	 * @return the messageFired - The message to show when the promotion has fired.
	 */
	public String getMessageFired()
	{
		return getMessageFired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductPerfectPartnerDiscountPromotion.messageFired</code> attribute. 
	 * @return the localized messageFired - The message to show when the promotion has fired.
	 */
	public Map<Language,String> getAllMessageFired(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,MESSAGEFIRED,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductPerfectPartnerDiscountPromotion.messageFired</code> attribute. 
	 * @return the localized messageFired - The message to show when the promotion has fired.
	 */
	public Map<Language,String> getAllMessageFired()
	{
		return getAllMessageFired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductPerfectPartnerDiscountPromotion.messageFired</code> attribute. 
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setMessageFired(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSslProductPerfectPartnerDiscountPromotion.setMessageFired requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MESSAGEFIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductPerfectPartnerDiscountPromotion.messageFired</code> attribute. 
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setMessageFired(final String value)
	{
		setMessageFired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductPerfectPartnerDiscountPromotion.messageFired</code> attribute. 
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setAllMessageFired(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,MESSAGEFIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductPerfectPartnerDiscountPromotion.messageFired</code> attribute. 
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setAllMessageFired(final Map<Language,String> value)
	{
		setAllMessageFired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductPerfectPartnerDiscountPromotion.partnerPercentageDiscounts</code> attribute.
	 * @return the partnerPercentageDiscounts - Fixed perecntage discount for a partner product in
	 *                             specific currencies.
	 */
	public Collection<PromotionPercentageDiscountRow> getPartnerPercentageDiscounts(final SessionContext ctx)
	{
		Collection<PromotionPercentageDiscountRow> coll = (Collection<PromotionPercentageDiscountRow>)getProperty( ctx, PARTNERPERCENTAGEDISCOUNTS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductPerfectPartnerDiscountPromotion.partnerPercentageDiscounts</code> attribute.
	 * @return the partnerPercentageDiscounts - Fixed perecntage discount for a partner product in
	 *                             specific currencies.
	 */
	public Collection<PromotionPercentageDiscountRow> getPartnerPercentageDiscounts()
	{
		return getPartnerPercentageDiscounts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductPerfectPartnerDiscountPromotion.partnerPercentageDiscounts</code> attribute. 
	 * @param value the partnerPercentageDiscounts - Fixed perecntage discount for a partner product in
	 *                             specific currencies.
	 */
	public void setPartnerPercentageDiscounts(final SessionContext ctx, final Collection<PromotionPercentageDiscountRow> value)
	{
		new PartOfHandler<Collection<PromotionPercentageDiscountRow>>()
		{
			@Override
			protected Collection<PromotionPercentageDiscountRow> doGetValue(final SessionContext ctx)
			{
				return getPartnerPercentageDiscounts( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Collection<PromotionPercentageDiscountRow> _value)
			{
				final Collection<PromotionPercentageDiscountRow> value = _value;
				setProperty(ctx, PARTNERPERCENTAGEDISCOUNTS,value == null || !value.isEmpty() ? value : null );
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductPerfectPartnerDiscountPromotion.partnerPercentageDiscounts</code> attribute. 
	 * @param value the partnerPercentageDiscounts - Fixed perecntage discount for a partner product in
	 *                             specific currencies.
	 */
	public void setPartnerPercentageDiscounts(final Collection<PromotionPercentageDiscountRow> value)
	{
		setPartnerPercentageDiscounts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductPerfectPartnerDiscountPromotion.partnerProductList</code> attribute.
	 * @return the partnerProductList - The collections of products to discount if one of
	 *                             them is in the cart.
	 */
	public List<Product> getPartnerProductList(final SessionContext ctx)
	{
		List<Product> coll = (List<Product>)getProperty( ctx, PARTNERPRODUCTLIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductPerfectPartnerDiscountPromotion.partnerProductList</code> attribute.
	 * @return the partnerProductList - The collections of products to discount if one of
	 *                             them is in the cart.
	 */
	public List<Product> getPartnerProductList()
	{
		return getPartnerProductList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductPerfectPartnerDiscountPromotion.partnerProductList</code> attribute. 
	 * @param value the partnerProductList - The collections of products to discount if one of
	 *                             them is in the cart.
	 */
	public void setPartnerProductList(final SessionContext ctx, final List<Product> value)
	{
		setProperty(ctx, PARTNERPRODUCTLIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductPerfectPartnerDiscountPromotion.partnerProductList</code> attribute. 
	 * @param value the partnerProductList - The collections of products to discount if one of
	 *                             them is in the cart.
	 */
	public void setPartnerProductList(final List<Product> value)
	{
		setPartnerProductList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductPerfectPartnerDiscountPromotion.partnerProducts</code> attribute.
	 * @return the partnerProducts - The collections of products to discount if one of
	 *                             them is in the cart.
	 */
	public Collection<Product> getPartnerProducts(final SessionContext ctx)
	{
		Collection<Product> coll = (Collection<Product>)getProperty( ctx, PARTNERPRODUCTS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductPerfectPartnerDiscountPromotion.partnerProducts</code> attribute.
	 * @return the partnerProducts - The collections of products to discount if one of
	 *                             them is in the cart.
	 */
	public Collection<Product> getPartnerProducts()
	{
		return getPartnerProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductPerfectPartnerDiscountPromotion.partnerProducts</code> attribute. 
	 * @param value the partnerProducts - The collections of products to discount if one of
	 *                             them is in the cart.
	 */
	public void setPartnerProducts(final SessionContext ctx, final Collection<Product> value)
	{
		setProperty(ctx, PARTNERPRODUCTS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductPerfectPartnerDiscountPromotion.partnerProducts</code> attribute. 
	 * @param value the partnerProducts - The collections of products to discount if one of
	 *                             them is in the cart.
	 */
	public void setPartnerProducts(final Collection<Product> value)
	{
		setPartnerProducts( getSession().getSessionContext(), value );
	}
	
}
