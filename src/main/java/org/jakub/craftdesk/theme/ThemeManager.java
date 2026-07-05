package org.jakub.craftdesk.theme;

import org.jakub.craftdesk.config.ConfigManager;
import org.jakub.craftdesk.gui.LanguageManager;

import java.awt.*;
import java.io.*;

public class ThemeManager {
    private ConfigManager configManager;
    private LanguageManager languageManager;
    private Color backgroundColor;
    private Color textColor;
    private Color sidebarColor;
    private Color primaryColor;
    private Color secondaryTextColor;
    private Color activeButtonColor;
    private Color buttonColor;

    private void dark() {
        this.backgroundColor = new Color(45,45,45);
        this.textColor = Color.WHITE;
        this.sidebarColor = new Color(35, 35, 35);
        this.primaryColor = new Color(1, 105, 187);
        this.secondaryTextColor = Color.LIGHT_GRAY;
        this.activeButtonColor = new Color(1,105,187);
        this.buttonColor = new Color(60,60,60);
        System.out.println(languageManager.get("theme.dark"));
    }
    private void light() {
        this.backgroundColor = new Color(245,245,245);
        this.textColor = new Color(30,30,30);
        this.sidebarColor = new Color(230,230,230);
        this.primaryColor = new Color(0,120,215);
        this.secondaryTextColor = new Color(90,90,90);
        this.activeButtonColor = new Color(0,120,215);
        this.buttonColor = new Color(215,215,215);
        System.out.println(languageManager.get("theme.light"));
    }
    private  void minecraft() {
        this.backgroundColor = new Color(107,142,35);
        this.textColor = new Color(255,248,220);
        this.sidebarColor = new Color(92,64,51);
        this.primaryColor = new Color(76,175,80);
        this.secondaryTextColor = new Color(220,220,220);
        this.activeButtonColor = new Color(76,175,80);
        this.buttonColor = new Color(120,85,60);
        System.out.println(languageManager.get("theme.minecraft"));
    }

    public void loadTheme(ConfigManager configManager , LanguageManager languageManager) {
        this.configManager = configManager;
        this.languageManager = languageManager;
        String theme = configManager.getTheme();
        if (theme.equals("dark")) {
            dark();
        }
        else if (theme.equals("light")) {
            light();
        }
        else if (theme.equals("minecraft")) {
            minecraft();
        }else {
            dark();
            System.out.println(languageManager.get("theme.error"));
        }
    }
    public ThemeManager(ConfigManager configManager , LanguageManager languageManager) {
        this.configManager = configManager;
        this.languageManager = languageManager;
        loadTheme(configManager, languageManager);

    }

    public void reload() {
        loadTheme(configManager, languageManager);
        System.out.println(languageManager.get("theme.reload"));
    }

    public Color getBackgroundColor() {
        return this.backgroundColor;
    }

    public Color getSidebarColor() {
        return this.sidebarColor;
    }

    public Color getPrimaryColor() {
        return this.primaryColor;
    }

    public Color getActiveButtonColor() {
        return this.activeButtonColor;
    }

    public Color getTextColor() {
        return this.textColor;
    }

    public Color getButtonColor() {
        return this.buttonColor;
    }

    public Color getSecondaryTextColor() {
        return this.secondaryTextColor;
    }
}
