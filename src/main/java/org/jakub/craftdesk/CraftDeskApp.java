package org.jakub.craftdesk;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import org.jakub.craftdesk.gui.DashboardView;
import javafx.scene.image.ImageView;
import javafx.scene.control.ContentDisplay;
import org.jakub.craftdesk.gui.WorldsView;

public class CraftDeskApp extends Application {
    public static void main( String[] args ) {
        launch(args);
    }

    @Override
        public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/styles/main.css").toExternalForm());
        VBox sidebar = new VBox();
        sidebar.getStyleClass().add("sidebar");
        Button home = new Button("Home");
        Button worlds = new Button("Worlds");
        Button mods = new Button("Mods");
        Button servers = new Button("Servers");
        Button settings = new Button("Settings");
        Insets Inset = new Insets(25, 20, 15, 10);
        Image icon = new Image(getClass().getResourceAsStream("/images/icon.png"));
        Line line = new Line(0, 0, 200, 0);
        line.setStroke(Color.web("#3a3d45"));
        line.setStrokeWidth(1.5);
        Label title = new Label("CraftDesk");
        title.getStyleClass().add("title");
        DashboardView dashboardView = new DashboardView();
        Image homeIcon = new Image(getClass().getResourceAsStream("/images/home.png"));
        ImageView homeImage = new ImageView(homeIcon);
        homeImage.setFitWidth(24);
        homeImage.setFitHeight(24);
        homeImage.setPreserveRatio(true);
        home.setGraphic(homeImage);
        home.setContentDisplay(ContentDisplay.RIGHT);
        home.setGraphicTextGap(10);
        Image worldsIcon = new Image(getClass().getResourceAsStream("/images/world.png"));
        ImageView worldsImage = new ImageView(worldsIcon);
        worldsImage.setFitWidth(24);
        worldsImage.setFitHeight(24);
        worldsImage.setPreserveRatio(true);
        worlds.setGraphic(worldsImage);
        worlds.setContentDisplay(ContentDisplay.RIGHT);
        worlds.setGraphicTextGap(10);
        Image modsIcon = new Image(getClass().getResourceAsStream("/images/mods.png"));
        ImageView modsImage = new ImageView(modsIcon);
        modsImage.setFitWidth(24);
        modsImage.setFitHeight(24);
        modsImage.setPreserveRatio(true);
        mods.setGraphic(modsImage);
        mods.setContentDisplay(ContentDisplay.RIGHT);
        mods.setGraphicTextGap(10);
        Image serversIcon = new Image(getClass().getResourceAsStream("/images/servers.png"));
        ImageView serversImage = new ImageView(serversIcon);
        serversImage.setFitWidth(24);
        serversImage.setFitHeight(24);
        serversImage.setPreserveRatio(true);
        servers.setGraphic(serversImage);
        servers.setContentDisplay(ContentDisplay.RIGHT);
        servers.setGraphicTextGap(10);
        Image settingsIcon = new Image(getClass().getResourceAsStream("/images/settings.png"));
        ImageView settingsImage = new ImageView(settingsIcon);
        settingsImage.setFitWidth(24);
        settingsImage.setFitHeight(24);
        settingsImage.setPreserveRatio(true);
        settings.setGraphic(settingsImage);
        settings.setContentDisplay(ContentDisplay.RIGHT);
        settings.setGraphicTextGap(10);
        WorldsView worldsView = new WorldsView();

        primaryStage.setTitle("CraftDesk");
        primaryStage.getIcons().add(icon);
        primaryStage.setResizable(true);
        primaryStage.setMinWidth(800);
        primaryStage.setMinHeight(500);
        primaryStage.setWidth(1100);
        primaryStage.setHeight(700);
        primaryStage.centerOnScreen();

        root.setLeft(sidebar);
        root.setCenter(dashboardView);
        sidebar.setSpacing(10);
        sidebar.setPadding(Inset);
        sidebar.getChildren().addAll(title, line, home, worlds, mods, servers, settings);

        home.setPrefHeight(50);
        home.setPrefWidth(200);
        home.setOnAction(e -> {
            primaryStage.setTitle("CraftDesk-Dashboard");
            root.setCenter(dashboardView);
        });

        worlds.setPrefHeight(50);
        worlds.setPrefWidth(200);
        worlds.setOnAction(e -> {
            primaryStage.setTitle("CraftDesk-Worlds");
            root.setCenter(worldsView);
        });

        mods.setPrefHeight(50);
        mods.setPrefWidth(200);
        mods.setOnAction(e -> {
            primaryStage.setTitle("CraftDesk-Mods");
        });

        servers.setPrefHeight(50);
        servers.setPrefWidth(200);
        servers.setOnAction(e -> {
            primaryStage.setTitle("CraftDesk-Servers");
        });

        settings.setPrefHeight(50);
        settings.setPrefWidth(200);
        settings.setOnAction(e -> {
            primaryStage.setTitle("CraftDesk-Settings");
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}