package org.jakub.craftdesk.gui;

import org.jakub.craftdesk.config.ConfigManager;
import org.jakub.craftdesk.theme.ThemeManager;

import javax.swing.*;
import java.awt.*;

public class ContentPanel extends JPanel {

    private ConfigManager configManager;
    private ThemeManager themeManager;
    private LanguageManager languageManager;
    private CardLayout cardLayout = new CardLayout();

    private DashboardPanel dashboardPanel;
    private WorldsPanel worldsPanel;
    private ModsPanel modsPanel;
    private ServersPanel serversPanel;
    private SettingsPanel settingsPanel;

    public ContentPanel(ConfigManager configManager , ThemeManager themeManager , LanguageManager languageManager) {

        this.configManager = configManager;
        this.themeManager = themeManager;
        this.languageManager = languageManager;

        setLayout(cardLayout);
        setBounds(250, 0, 950, 700);

        dashboardPanel = new DashboardPanel(configManager , themeManager , languageManager);
        worldsPanel = new WorldsPanel();
        modsPanel = new ModsPanel();
        serversPanel = new ServersPanel();
        settingsPanel = new SettingsPanel();

        add(dashboardPanel, "Dashboard");
        add(worldsPanel, "Worlds");
        add(modsPanel, "Mods");
        add(serversPanel, "Servers");
        add(settingsPanel, "Settings");
    }

    public void showWorlds() { cardLayout.show(this, "Worlds"); }

    public void showDashboard() {
        cardLayout.show(this, "Dashboard");
    }

    public void showMods()  {
        cardLayout.show(this, "Mods");
    }
    public void showServers()  { cardLayout.show(this, "Servers"); }
    public void showSettings()  {
        cardLayout.show(this, "Settings");
    }
}