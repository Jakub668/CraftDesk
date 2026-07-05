package org.jakub.craftdesk;

import org.jakub.craftdesk.config.ConfigManager;
import org.jakub.craftdesk.gui.LanguageManager;
import org.jakub.craftdesk.gui.MainWindow;
import org.jakub.craftdesk.theme.ThemeManager;

public class Main {

    public static void main(String[] args) {
        ConfigManager configManager = new ConfigManager();
        configManager.load();
        LanguageManager languageManager = new LanguageManager(configManager);
        ThemeManager themeManager = new ThemeManager(configManager , languageManager);

        new MainWindow(configManager , themeManager, languageManager);

    }

}