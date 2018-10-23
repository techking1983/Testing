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
import de.hybris.platform.promotions.jalo.ProductPromotion;
import de.hybris.platform.util.PartOfHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.borngroup.ssl.core.jalo.SslProductMultiBuyDiscountPromotion SslProductMultiBuyDiscountPromotion}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSslProductMultiBuyDiscountPromotion extends ProductPromotion
{
	/** Qualifier of the <code>SslProductMultiBuyDiscountPromotion.qualifyingCount</code> attribute **/
	public static final String QUALIFYINGCOUNT = "qualifyingCount";
	/** Qualifier of the <code>SslProductMultiBuyDiscountPromotion.bundleDiscounts</code> attribute **/
	public static final String BUNDLEDISCOUNTS = "bundleDiscounts";
	/** Qualifier of the <code>SslProductMultiBuyDiscountPromotion.messageFired</code> attribute **/
	public static final String MESSAGEFIRED = "messageFired";
	/** Qualifier of the <code>SslProductMultiBuyDiscountPromotion.messageCouldHaveFired</code> attribute **/
	public static final String MESSAGECOULDHAVEFIRED = "messageCouldHaveFired";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ProductPromotion.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(QUALIFYINGCOUNT, AttributeMode.INITIAL);
		tmp.put(BUNDLEDISCOUNTS, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>SslProductMultiBuyDiscountPromotion.bundleDiscounts</code> attribute.
	 * @return the bundleDiscounts - Fixed discount percentage for whole multi-buy bundle
	 *                             in specific currencies.
	 */
	public Collection<PromotionPercentageDiscountRow> getBundleDiscounts(final SessionContext ctx)
	{
		Collection<PromotionPercentageDiscountRow> coll = (Collection<PromotionPercentageDiscountRow>)getProperty( ctx, BUNDLEDISCOUNTS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductMultiBuyDiscountPromotion.bundleDiscounts</code> attribute.
	 * @return the bundleDiscounts - Fixed discount percentage for whole multi-buy bundle
	 *                             in specific currencies.
	 */
	public Collection<PromotionPercentageDiscountRow> getBundleDiscounts()
	{
		return getBundleDiscounts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductMultiBuyDiscountPromotion.bundleDiscounts</code> attribute. 
	 * @param value the bundleDiscounts - Fixed discount percentage for whole multi-buy bundle
	 *                             in specific currencies.
	 */
	public void setBundleDiscounts(final SessionContext ctx, final Collection<PromotionPercentageDiscountRow> value)
	{
		new PartOfHandler<Collection<PromotionPercentageDiscountRow>>()
		{
			@Override
			protected Collection<PromotionPercentageDiscountRow> doGetValue(final SessionContext ctx)
			{
				return getBundleDiscounts( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Collection<PromotionPercentageDiscountRow> _value)
			{
				final Collection<PromotionPercentageDiscountRow> value = _value;
				setProperty(ctx, BUNDLEDISCOUNTS,value == null || !value.isEmpty() ? value : null );
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductMultiBuyDiscountPromotion.bundleDiscounts</code> attribute. 
	 * @param value the bundleDiscounts - Fixed discount percentage for whole multi-buy bundle
	 *                             in specific currencies.
	 */
	public void setBundleDiscounts(final Collection<PromotionPercentageDiscountRow> value)
	{
		setBundleDiscounts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductMultiBuyDiscountPromotion.messageCouldHaveFired</code> attribute.
	 * @return the messageCouldHaveFired - The message to show when the promotion could have
	 *                             potentially fire.
	 */
	public String getMessageCouldHaveFired(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSslProductMultiBuyDiscountPromotion.getMessageCouldHaveFired requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, MESSAGECOULDHAVEFIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductMultiBuyDiscountPromotion.messageCouldHaveFired</code> attribute.
	 * @return the messageCouldHaveFired - The message to show when the promotion could have
	 *                             potentially fire.
	 */
	public String getMessageCouldHaveFired()
	{
		return getMessageCouldHaveFired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductMultiBuyDiscountPromotion.messageCouldHaveFired</code> attribute. 
	 * @return the localized messageCouldHaveFired - The message to show when the promotion could have
	 *                             potentially fire.
	 */
	public Map<Language,String> getAllMessageCouldHaveFired(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,MESSAGECOULDHAVEFIRED,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductMultiBuyDiscountPromotion.messageCouldHaveFired</code> attribute. 
	 * @return the localized messageCouldHaveFired - The message to show when the promotion could have
	 *                             potentially fire.
	 */
	public Map<Language,String> getAllMessageCouldHaveFired()
	{
		return getAllMessageCouldHaveFired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductMultiBuyDiscountPromotion.messageCouldHaveFired</code> attribute. 
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have
	 *                             potentially fire.
	 */
	public void setMessageCouldHaveFired(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSslProductMultiBuyDiscountPromotion.setMessageCouldHaveFired requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MESSAGECOULDHAVEFIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductMultiBuyDiscountPromotion.messageCouldHaveFired</code> attribute. 
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have
	 *                             potentially fire.
	 */
	public void setMessageCouldHaveFired(final String value)
	{
		setMessageCouldHaveFired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductMultiBuyDiscountPromotion.messageCouldHaveFired</code> attribute. 
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have
	 *                             potentially fire.
	 */
	public void setAllMessageCouldHaveFired(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,MESSAGECOULDHAVEFIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductMultiBuyDiscountPromotion.messageCouldHaveFired</code> attribute. 
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have
	 *                             potentially fire.
	 */
	public void setAllMessageCouldHaveFired(final Map<Language,String> value)
	{
		setAllMessageCouldHaveFired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductMultiBuyDiscountPromotion.messageFired</code> attribute.
	 * @return the messageFired - The message to show when the promotion has fired.
	 */
	public String getMessageFired(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSslProductMultiBuyDiscountPromotion.getMessageFired requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, MESSAGEFIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductMultiBuyDiscountPromotion.messageFired</code> attribute.
	 * @return the messageFired - The message to show when the promotion has fired.
	 */
	public String getMessageFired()
	{
		return getMessageFired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductMultiBuyDiscountPromotion.messageFired</code> attribute. 
	 * @return the localized messageFired - The message to show when the promotion has fired.
	 */
	public Map<Language,String> getAllMessageFired(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,MESSAGEFIRED,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductMultiBuyDiscountPromotion.messageFired</code> attribute. 
	 * @return the localized messageFired - The message to show when the promotion has fired.
	 */
	public Map<Language,String> getAllMessageFired()
	{
		return getAllMessageFired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductMultiBuyDiscountPromotion.messageFired</code> attribute. 
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setMessageFired(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSslProductMultiBuyDiscountPromotion.setMessageFired requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MESSAGEFIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductMultiBuyDiscountPromotion.messageFired</code> attribute. 
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setMessageFired(final String value)
	{
		setMessageFired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductMultiBuyDiscountPromotion.messageFired</code> attribute. 
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setAllMessageFired(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,MESSAGEFIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductMultiBuyDiscountPromotion.messageFired</code> attribute. 
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setAllMessageFired(final Map<Language,String> value)
	{
		setAllMessageFired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductMultiBuyDiscountPromotion.qualifyingCount</code> attribute.
	 * @return the qualifyingCount - The number of products required to qualify for the
	 *                             promotion.
	 */
	public Integer getQualifyingCount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, QUALIFYINGCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductMultiBuyDiscountPromotion.qualifyingCount</code> attribute.
	 * @return the qualifyingCount - The number of products required to qualify for the
	 *                             promotion.
	 */
	public Integer getQualifyingCount()
	{
		return getQualifyingCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductMultiBuyDiscountPromotion.qualifyingCount</code> attribute. 
	 * @return the qualifyingCount - The number of products required to qualify for the
	 *                             promotion.
	 */
	public int getQualifyingCountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getQualifyingCount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SslProductMultiBuyDiscountPromotion.qualifyingCount</code> attribute. 
	 * @return the qualifyingCount - The number of products required to qualify for the
	 *                             promotion.
	 */
	public int getQualifyingCountAsPrimitive()
	{
		return getQualifyingCountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductMultiBuyDiscountPromotion.qualifyingCount</code> attribute. 
	 * @param value the qualifyingCount - The number of products required to qualify for the
	 *                             promotion.
	 */
	public void setQualifyingCount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, QUALIFYINGCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductMultiBuyDiscountPromotion.qualifyingCount</code> attribute. 
	 * @param value the qualifyingCount - The number of products required to qualify for the
	 *                             promotion.
	 */
	public void setQualifyingCount(final Integer value)
	{
		setQualifyingCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductMultiBuyDiscountPromotion.qualifyingCount</code> attribute. 
	 * @param value the qualifyingCount - The number of products required to qualify for the
	 *                             promotion.
	 */
	public void setQualifyingCount(final SessionContext ctx, final int value)
	{
		setQualifyingCount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SslProductMultiBuyDiscountPromotion.qualifyingCount</code> attribute. 
	 * @param value the qualifyingCount - The number of products required to qualify for the
	 *                             promotion.
	 */
	public void setQualifyingCount(final int value)
	{
		setQualifyingCount( getSession().getSessionContext(), value );
	}
	
}
