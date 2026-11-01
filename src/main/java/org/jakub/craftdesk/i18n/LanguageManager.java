package org.jakub.craftdesk.i18n;

import org.jakub.craftdesk.config.ConfigManager;
import java.util.ResourceBundle;

public class LanguageManager {
    private ConfigManager configManager;
    private ResourceBundle bundle;
    public LanguageManager(ConfigManager configManager) {
        this.configManager = configManager;

    }
    public void reload(ConfigManager configManager) {

    }
    public String get(String key) {
        return this.bundle.getString(key);
    }
}