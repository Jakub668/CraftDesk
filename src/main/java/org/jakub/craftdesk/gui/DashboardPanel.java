package org.jakub.craftdesk.gui;

import org.jakub.craftdesk.config.ConfigManager;

import javax.swing.*;
import java.awt.*;

public class DashboardPanel extends JPanel {
    private static final Color TLO = new Color(45,45,45);
    private static final Color BLUE = new Color(1, 105, 187);
    private ConfigManager configManager;

    public DashboardPanel(ConfigManager configManager) {
        this.configManager = configManager;
        setLayout(null);
        setBackground(TLO);
        setBounds(250, 0, 950, 700);
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/icon.png"));
        Image image = icon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        JLabel iconLabel = new JLabel(new ImageIcon(image));
        iconLabel.setBounds(380, 6, 120, 120);
        add(iconLabel);

        JLabel title = new JLabel(LanguageManager.get("dashboard.title"));
        title.setFont(new Font("Roboto", Font.BOLD, 40));
        title.setForeground(BLUE);
        title.setBounds(350, 120, 250, 100);
        add(title);

        JLabel welcome = new JLabel(LanguageManager.get("dashboard.welcome") + " " + configManager.getUsername() + "!");
        welcome.setFont(new Font("Roboto", Font.BOLD, 30));
        welcome.setForeground(BLUE);
        welcome.setBounds(360, 200, 250, 100);
        add(welcome);

        JLabel text = new JLabel(LanguageManager.get("dashboard.description"));
        text.setFont(new Font("Roboto", Font.BOLD, 20));
        text.setForeground(BLUE);
        text.setBounds(250, 300, 400, 100);
        add(text);

        JPanel worlds = new JPanel();
        JPanel mods = new JPanel();
        JPanel servers = new JPanel();
        worlds.setLayout(null);
        mods.setLayout(null);
        servers.setLayout(null);
        worlds.setBorder(BorderFactory.createLineBorder(BLUE, 5));
        mods.setBorder(BorderFactory.createLineBorder(BLUE, 5));
        servers.setBorder(BorderFactory.createLineBorder(BLUE, 5));
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