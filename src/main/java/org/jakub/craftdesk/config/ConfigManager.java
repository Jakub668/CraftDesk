package org.jakub.craftdesk.config;

import java.io.*;
import java.util.Properties;
import java.util.ResourceBundle;

public class ConfigManager {

    private String language = "pl_PL";
    private String theme = "dark";
    private String username = "Gracz";

    private final File configFile;
    private final Properties properties = new Properties();

    public ConfigManager() {

        String home = System.getProperty("user.home");

        File dir = new File(home, ".craftdesk");

        if (!dir.exists()) {
            dir.mkdirs();
        }

        configFile = new File(dir, "config.properties");
    }

    public void init() {

        File craftDeskDir = new File(System.getProperty("user.home"), ".craftdesk");

        if (!craftDeskDir.exists()) {
            boolean created = craftDeskDir.mkdirs();

            if (created) {
                System.out.println("Utworzono folder .craftdesk");
            } else {
                System.out.println("Nie udało się utworzyć folderu .craftdesk");
            }
        } else {
            System.out.println("Folder .craftdesk już istnieje");
        }

        if (!configFile.exists()) {
            System.out.println("Brak config.properties – będzie tworzony później");
        }
    }

    private void createDefaultConfig() {

        try {

            properties.setProperty("language", "pl_PL");
            properties.setProperty("theme", "dark");
            properties.setProperty("username", "Gracz");

            FileOutputStream out = new FileOutputStream(configFile);
            properties.store(out, "CraftDesk Config");
            out.close();

            System.out.println("Utworzono domyślny config!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {

        try {

            if (!configFile.exists()) {
                createDefaultConfig();
            }

            FileInputStream in = new FileInputStream(configFile);
            properties.load(in);
            in.close();

            language = properties.getProperty("language", "pl_PL");
            theme = properties.getProperty("theme", "dark");
            username = properties.getProperty("username", "Gracz");

            System.out.println("Config załadowany!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save() {

        try {

            properties.setProperty("language", language);
            properties.setProperty("theme", theme);
            properties.setProperty("username", username);

            FileOutputStream out = new FileOutputStream(configFile);
            properties.store(out, "CraftDesk Config");
            out.close();

            System.out.println("Zapisano config!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}