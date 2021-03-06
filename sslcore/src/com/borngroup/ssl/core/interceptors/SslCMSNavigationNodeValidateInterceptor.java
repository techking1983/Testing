package com.borngroup.ssl.core.interceptors;

import de.hybris.platform.cms2.model.navigation.CMSNavigationNodeModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import org.apache.commons.lang.StringUtils;

import com.borngroup.ssl.core.exceptions.DefaultInterceptorException;

/**
 * @author Nagarro
 *
 */
public class SslCMSNavigationNodeValidateInterceptor implements ValidateInterceptor<CMSNavigationNodeModel> {

    private static final String CHARACTER_LIMIT_ERROR = "Character limit is 15";

    @Override
    public void onValidate(final CMSNavigationNodeModel model, final InterceptorContext arg1) throws InterceptorException {
        if (StringUtils.length(model.getTagValue()) > 15) {
            throw new DefaultInterceptorException(CHARACTER_LIMIT_ERROR);
        }
    }


}
