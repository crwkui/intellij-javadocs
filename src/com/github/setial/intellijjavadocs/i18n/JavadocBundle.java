package com.github.setial.intellijjavadocs.i18n;

import com.github.setial.intellijjavadocs.configuration.JavaDocConfiguration;
import com.github.setial.intellijjavadocs.template.DocTemplateManager;
import com.intellij.CommonBundle;
import com.intellij.openapi.components.ServiceManager;

import java.util.Locale;
import java.util.ResourceBundle;

public class JavadocBundle {
    private JavaDocConfiguration configuration = ServiceManager.getService(JavaDocConfiguration.class);
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("messages.JavadocBundle",
            new Locale(configuration.getConfiguration().getGeneralSettings().getLocale()), new I18nResources.XmlControl());

    public String getMessage(String key){
        return resourceBundle.getString(key).trim();
    }

    public String getMessage(String key, Object ... params){
        return CommonBundle.message(key, params);
    }
}
