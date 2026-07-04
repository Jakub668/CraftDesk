package org.jakub.craftdesk;

import org.jakub.craftdesk.config.ConfigManager;
import org.jakub.craftdesk.gui.MainWindow;

public class Main {

    public static void main(String[] args) {
        ConfigManager configManager = new ConfigManager();
        configManager.load();

        new MainWindow(configManager);

    }

}