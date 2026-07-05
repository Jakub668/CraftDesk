package org.jakub.craftdesk.gui;

import org.jakub.craftdesk.config.ConfigManager;
import java.util.ResourceBundle;

public class LanguageManager {
    private ConfigManager configManager;
    private ResourceBundle bundle;
    public LanguageManager(ConfigManager configManager) {
        this.configManager = configManager;
        this.bundle = ResourceBundle.getBundle("lang." + configManager.getLanguage());
    }
    public void reload(ConfigManager configManager) {
        this.bundle = ResourceBundle.getBundle("lang." + configManager.getLanguage());
    }
    public String get(String key) {
        return this.bundle.getString(key);
    }
}