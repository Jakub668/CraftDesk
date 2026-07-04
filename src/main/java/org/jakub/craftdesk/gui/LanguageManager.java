package org.jakub.craftdesk.gui;

import java.util.ResourceBundle;

public class LanguageManager {

    private static final ResourceBundle bundle =
            ResourceBundle.getBundle("lang.pl_PL");

    public static String get(String key) {
        return bundle.getString(key);
    }
}