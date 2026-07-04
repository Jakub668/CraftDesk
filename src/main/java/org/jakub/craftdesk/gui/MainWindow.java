package org.jakub.craftdesk.gui;

import javax.swing.*;
import org.jakub.craftdesk.config.ConfigManager;
import org.jakub.craftdesk.theme.ThemeManager;

public class MainWindow {
    private ConfigManager configManager;
    private ThemeManager themeManager;

    JFrame frame;
    public MainWindow(ConfigManager configManager , ThemeManager themeManager) {
        this.configManager = configManager;
        this.themeManager = themeManager;

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/icon.png"));

        frame = new JFrame();

        frame.setTitle("CraftDesk");
        frame.setSize(1200, 700);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(icon.getImage());

        frame.setLocationRelativeTo(null);

        frame.setResizable(false);

        frame.setLayout(null);

        ContentPanel contentPanel = new ContentPanel(configManager , themeManager);
        frame.add(contentPanel);

        SideBarPanel sideBarPanel = new SideBarPanel(contentPanel , themeManager);
        frame.add(sideBarPanel);

        ConfigManager config = new ConfigManager();
        config.load();

        frame.setVisible(true);

    }

}