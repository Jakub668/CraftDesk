package org.jakub.craftdesk.gui;

import javax.swing.*;
import java.awt.*;

public class SideBarPanel extends JPanel {
    private static final Color BUTTON = new Color(60, 60, 60);
    private static final Color ACTIVE = new Color(0, 120, 215);
    private static final Color SIDEBAR = new Color(35, 35, 35);

    private void ustawAktywnyPrzycisk(
            JButton aktywny,
            JButton dashboard,
            JButton swiaty,
            JButton mody,
            JButton serwery,
            JButton ustawienia) {

        JButton[] przyciski = {
                dashboard,
                swiaty,
                mody,
                serwery,
                ustawienia
        };

        for (JButton przycisk : przyciski) {
            przycisk.setBackground(BUTTON);
            przycisk.setForeground(Color.LIGHT_GRAY);
        }

        aktywny.setBackground(ACTIVE);
        aktywny.setForeground(Color.WHITE);
    }

    public SideBarPanel(ContentPanel contentPanel) {

        setLayout(null);
        setBackground(SIDEBAR);
        setBounds(0, 0, 250, 700);

        JLabel version = new JLabel("Alpha 0.1");
        version.setFont(new Font("Roboto", Font.BOLD, 15));
        version.setForeground(Color.gray);
        version.setBounds(10, 600, 250, 100);

        JButton dashboard = new JButton();
        JButton swiaty = new JButton();
        JButton mody = new JButton();
        JButton serwery = new JButton();
        JButton ustawienia = new JButton();
        dashboard.setText(LanguageManager.get("sidebar.dashboard"));
        swiaty.setText(LanguageManager.get("sidebar.worlds"));
        mody.setText(LanguageManager.get("sidebar.mods"));
        serwery.setText(LanguageManager.get("sidebar.servers"));
        ustawienia.setText(LanguageManager.get("sidebar.settings"));
        dashboard.setBackground(ACTIVE);
        swiaty.setBackground(BUTTON);
        mody.setBackground(BUTTON);
        serwery.setBackground(BUTTON);
        ustawienia.setBackground(BUTTON);
        dashboard.setForeground(Color.WHITE);
        swiaty.setForeground(Color.LIGHT_GRAY);
        mody.setForeground(Color.LIGHT_GRAY);
        serwery.setForeground(Color.LIGHT_GRAY);
        ustawienia.setForeground(Color.LIGHT_GRAY);
        dashboard.setBounds(30, 20, 190, 80);
        swiaty.setBounds(30, 120, 190, 80);
        mody.setBounds(30, 220, 190, 80);
        serwery.setBounds(30, 320, 190, 80);
        ustawienia.setBounds(30, 420, 190, 80);
        dashboard.setFont(new Font("Segoe UI", Font.BOLD, 18));
        swiaty.setFont(new Font("Segoe UI", Font.BOLD, 18));
        mody.setFont(new Font("Segoe UI", Font.BOLD, 18));
        serwery.setFont(new Font("Segoe UI", Font.BOLD, 18));
        ustawienia.setFont(new Font("Segoe UI", Font.BOLD, 18));
        add(dashboard);
        add(swiaty);
        add(mody);
        add(serwery);
        add(ustawienia);
        add(version);

        dashboard.addActionListener(e -> {
            contentPanel.showDashboard();
            ustawAktywnyPrzycisk(
                    dashboard,
                    dashboard,
                    swiaty,
                    mody,
                    serwery,
                    ustawienia);

        });

        swiaty.addActionListener(e -> {
            contentPanel.showWorlds();
            ustawAktywnyPrzycisk(
                    swiaty,
                    dashboard,
                    swiaty,
                    mody,
                    serwery,
                    ustawienia);

        });

        mody.addActionListener(e -> {
            contentPanel.showMods();
            ustawAktywnyPrzycisk(
                    mody,
                    dashboard,
                    swiaty,
                    mody,
                    serwery,
                    ustawienia);

        });

        serwery.addActionListener(e -> {
            contentPanel.showServers();
            ustawAktywnyPrzycisk(
                    serwery,
                    dashboard,
                    swiaty,
                    mody,
                    serwery,
                    ustawienia);

        });

        ustawienia.addActionListener(e -> {
            contentPanel.showSettings();
            ustawAktywnyPrzycisk(
                    ustawienia,
                    dashboard,
                    swiaty,
                    mody,
                    serwery,
                    ustawienia);

        });

}}