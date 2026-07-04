package org.jakub.craftdesk.gui;

import org.jakub.craftdesk.config.ConfigManager;
import org.jakub.craftdesk.theme.ThemeManager;

import javax.swing.*;
import java.awt.*;

public class DashboardPanel extends JPanel {
    private ConfigManager configManager;
    private ThemeManager themeManager;

    public DashboardPanel(ConfigManager configManager , ThemeManager themeManager) {
        this.configManager = configManager;
        this.themeManager = themeManager;
        setLayout(null);
        setBackground(themeManager.getBackgroundColor());
        setBounds(250, 0, 950, 700);
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/icon.png"));
        Image image = icon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        JLabel iconLabel = new JLabel(new ImageIcon(image));
        iconLabel.setBounds(380, 6, 120, 120);
        add(iconLabel);

        JLabel title = new JLabel(LanguageManager.get("dashboard.title"));
        title.setFont(new Font("Roboto", Font.BOLD, 40));
        title.setForeground(themeManager.getPrimaryColor());
        title.setBounds(350, 120, 250, 100);
        add(title);

        JLabel welcome = new JLabel(LanguageManager.get("dashboard.welcome") + " " + configManager.getUsername() + "!");
        welcome.setFont(new Font("Roboto", Font.BOLD, 30));
        welcome.setForeground(themeManager.getPrimaryColor());
        welcome.setBounds(360, 200, 250, 100);
        add(welcome);

        JLabel text = new JLabel(LanguageManager.get("dashboard.description"));
        text.setFont(new Font("Roboto", Font.BOLD, 20));
        text.setForeground(themeManager.getPrimaryColor());
        text.setBounds(250, 300, 400, 100);
        add(text);

        JPanel worlds = new JPanel();
        JPanel mods = new JPanel();
        JPanel servers = new JPanel();
        worlds.setLayout(null);
        mods.setLayout(null);
        servers.setLayout(null);
        worlds.setBorder(BorderFactory.createLineBorder(themeManager.getPrimaryColor(), 5));
        mods.setBorder(BorderFactory.createLineBorder(themeManager.getPrimaryColor(), 5));
        servers.setBorder(BorderFactory.createLineBorder(themeManager.getPrimaryColor(), 5));
        worlds.setBackground(Color.WHITE);
        mods.setBackground(Color.WHITE);
        servers.setBackground(Color.WHITE);
        worlds.setBounds(375, 400, 200, 200);
        mods.setBounds(125, 400, 200, 200);
        servers.setBounds(625, 400, 200, 200);
        add(worlds);
        add(mods);
        add(servers);
        JLabel Wtext = new JLabel(LanguageManager.get("dashboard.worlds"));
        JLabel Mtext = new JLabel(LanguageManager.get("dashboard.mods"));
        JLabel Stext = new JLabel(LanguageManager.get("dashboard.servers"));
        Wtext.setFont(new Font("Roboto", Font.BOLD, 20));
        Mtext.setFont(new Font("Roboto", Font.BOLD, 20));
        Stext.setFont(new Font("Roboto", Font.BOLD, 20));
        Wtext.setForeground(Color.BLACK);
        Mtext.setForeground(Color.BLACK);
        Stext.setForeground(Color.BLACK);
        Wtext.setBounds(50, 20, 100, 50);
        Mtext.setBounds(50, 20, 100, 50);
        Stext.setBounds(50, 20, 100, 50);
        worlds.add(Wtext);
        mods.add(Mtext);
        servers.add(Stext);

        JLabel Wamount = new JLabel(LanguageManager.get("dashboard.worlds.count"));
        JLabel Mamount = new JLabel(LanguageManager.get("dashboard.mods.count"));
        JLabel Samount = new JLabel(LanguageManager.get("dashboard.servers.count"));
        Wamount.setFont(new Font("Roboto", Font.BOLD, 20));
        Mamount.setFont(new Font("Roboto", Font.BOLD, 20));
        Samount.setFont(new Font("Roboto", Font.BOLD, 20));
        Wamount.setForeground(Color.BLACK);
        Mamount.setForeground(Color.BLACK);
        Samount.setForeground(Color.BLACK);
        Wamount.setBounds(50, 120, 110, 50);
        Mamount.setBounds(50, 120, 110, 50);
        Samount.setBounds(50, 120, 110, 50);
        worlds.add(Wamount);
        mods.add(Mamount);
        servers.add(Samount);

    }

}