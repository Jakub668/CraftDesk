package org.jakub.craftdesk.gui;

import javax.swing.*;
import org.jakub.craftdesk.config.ConfigManager;

public class MainWindow {
    private ConfigManager configManager;

    JFrame frame;
    public MainWindow(ConfigManager configManager) {
        this.configManager = configManager;

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/icon.png"));

        frame = new JFrame();

        frame.setTitle("CraftDesk");
        frame.setSize(1200, 700);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(icon.getImage());

        frame.setLocationRelativeTo(null);

        frame.setResizable(false);

        frame.setLayout(null);

        ContentPanel contentPanel = new ContentPanel(configManager);
        frame.add(contentPanel);

        SideBarPanel sideBarPanel = new SideBarPanel(contentPanel);
        frame.add(sideBarPanel);

        ConfigManager config = new ConfigManager();
        config.load();

        frame.setVisible(true);

    }

}