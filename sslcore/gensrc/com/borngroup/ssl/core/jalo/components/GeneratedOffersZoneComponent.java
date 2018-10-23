/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 22 Oct, 2018 11:46:56 AM                    ---
 * ----------------------------------------------------------------
 */
package com.borngroup.ssl.core.jalo.components;

import com.borngroup.ssl.core.constants.SslCoreConstants;
import com.borngroup.ssl.core.jalo.components.OffersZoneCMSComponent;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.borngroup.ssl.core.jalo.components.OffersZoneComponent OffersZoneComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOffersZoneComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>OffersZoneComponent.offersZones</code> attribute **/
	public static final String OFFERSZONES = "offersZones";
	/** Qualifier of the <code>OffersZoneComponent.headline</code> attribute **/
	public static final String HEADLINE = "headline";
	/** Qualifier of the <code>OffersZoneComponent.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(OFFERSZONES, AttributeMode.INITIAL);
		tmp.put(HEADLINE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OffersZoneComponent.description</code> attribute.
	 * @return the description - Description to display for the Component
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedOffersZoneComponent.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OffersZoneComponent.description</code> attribute.
	 * @return the description - Description to display for the Component
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OffersZoneComponent.description</code> attribute. 
	 * @return the localized description - Description to display for the Component
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OffersZoneComponent.description</code> attribute. 
	 * @return the localized description - Description to display for the Component
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OffersZoneComponent.description</code> attribute. 
	 * @param value the description - Description to display for the Component
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedOffersZoneComponent.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OffersZoneComponent.description</code> attribute. 
	 * @param value the description - Description to display for the Component
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OffersZoneComponent.description</code> attribute. 
	 * @param value the description - Description to display for the Component
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OffersZoneComponent.description</code> attribute. 
	 * @param value the description - Description to display for the Component
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OffersZoneComponent.headline</code> attribute.
	 * @return the headline - Heading to display for the Component
	 */
	public String getHeadline(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedOffersZoneComponent.getHeadline requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, HEADLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OffersZoneComponent.headline</code> attribute.
	 * @return the headline - Heading to display for the Component
	 */
	public String getHeadline()
	{
		return getHeadline( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OffersZoneComponent.headline</code> attribute. 
	 * @return the localized headline - Heading to display for the Component
	 */
	public Map<Language,String> getAllHeadline(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,HEADLINE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OffersZoneComponent.headline</code> attribute. 
	 * @return the localized headline - Heading to display for the Component
	 */
	public Map<Language,String> getAllHeadline()
	{
		return getAllHeadline( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OffersZoneComponent.headline</code> attribute. 
	 * @param value the headline - Heading to display for the Component
	 */
	public void setHeadline(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedOffersZoneComponent.setHeadline requires a session language", 0 );
		}
		setLocalizedProperty(ctx, HEADLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OffersZoneComponent.headline</code> attribute. 
	 * @param value the headline - Heading to display for the Component
	 */
	public void setHeadline(final String value)
	{
		setHeadline( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OffersZoneComponent.headline</code> attribute. 
	 * @param value the headline - Heading to display for the Component
	 */
	public void setAllHeadline(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,HEADLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OffersZoneComponent.headline</code> attribute. 
	 * @param value the headline - Heading to display for the Component
	 */
	public void setAllHeadline(final Map<Language,String> value)
	{
		setAllHeadline( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OffersZoneComponent.offersZones</code> attribute.
	 * @return the offersZones - Offer Zones
	 */
	public List<OffersZoneCMSComponent> getOffersZones(final SessionContext ctx)
	{
		List<OffersZoneCMSComponent> coll = (List<OffersZoneCMSComponent>)getProperty( ctx, OFFERSZONES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OffersZoneComponent.offersZones</code> attribute.
	 * @return the offersZones - Offer Zones
	 */
	public List<OffersZoneCMSComponent> getOffersZones()
	{
		return getOffersZones( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OffersZoneComponent.offersZones</code> attribute. 
	 * @param value the offersZones - Offer Zones
	 */
	public void setOffersZones(final SessionContext ctx, final List<OffersZoneCMSComponent> value)
	{
		setProperty(ctx, OFFERSZONES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OffersZoneComponent.offersZones</code> attribute. 
	 * @param value the offersZones - Offer Zones
	 */
	public void setOffersZones(final List<OffersZoneCMSComponent> value)
	{
		setOffersZones( getSession().getSessionContext(), value );
	}
	
}
