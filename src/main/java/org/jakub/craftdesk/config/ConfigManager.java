package org.jakub.craftdesk.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ConfigManager {
    private static final Logger logger = Logger.getLogger(ConfigManager.class.getName());
    private static final String DIR_NAME = ".craftdesk";
    private static final String FILE_NAME = "config.json";

    private final File configFile;

    // Username field
    private String username = "";

    public ConfigManager() {
        String home = System.getProperty("user.home");
        File dir = new File(home, DIR_NAME);

        if (!dir.exists()) {
            boolean created = dir.mkdirs();
            if (created) {
                logger.info("Created directory: " + DIR_NAME);
            } else {
                logger.warning("Failed to create directory: " + DIR_NAME);
            }
        }

        configFile = new File(dir, FILE_NAME);
    }

    // Initialize logger configuration
    public void initLogger() {
        try {
            File logFile = new File(System.getProperty("user.home") + "/" + DIR_NAME, "craftdesk.log");
            FileHandler fileHandler = new FileHandler(logFile.getAbsolutePath(), true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.info("Logging system initialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Check if config.json exists
    public boolean configFileExists() {
        return configFile.exists();
    }

    // Load configuration from JSON
    public void load() {
        if (!configFile.exists()) {
            save(); // Create default config if it doesn't exist
            return;
        }

        try (FileReader reader = new FileReader(configFile)) {
            Gson gson = new Gson();
            ConfigData data = gson.fromJson(reader, ConfigData.class);
            if (data != null) {
                this.username = data.username;
            }
            logger.info("Configuration loaded successfully.");
        } catch (IOException e) {
            logger.warning("Error loading configuration: " + e.getMessage());
        }
    }

    // Save configuration to JSON
    public void save() {
        ConfigData data = new ConfigData();
        data.username = this.username;

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(configFile)) {
            gson.toJson(data, writer);
            logger.info("Configuration saved successfully.");
        } catch (IOException e) {
            logger.warning("Error saving configuration: " + e.getMessage());
        }
    }

    // Getters and Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    // Helper inner class for JSON mapping via Gson
    private static class ConfigData {
        String username = "";
    }
}