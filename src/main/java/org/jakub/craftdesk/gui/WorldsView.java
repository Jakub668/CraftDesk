package org.jakub.craftdesk.gui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;


public class WorldsView extends VBox {
    public static int worldsInt = 0;
    public WorldsView() {
        getStyleClass().add("views-background");
        Label title = new Label("Worlds");
        title.getStyleClass().add("views-title");
        HBox belt = new HBox(10);
        belt.setPadding(new Insets(10));
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);
        Label subtitle = new Label("Your worlds");
        subtitle.getStyleClass().add("worlds-subtitle");
        HBox searcherBelt = new HBox(10);
        searcherBelt.setPadding(new Insets(10));
        TextField searcher = new TextField();
        searcher.getStyleClass().add("worlds-searcher");
        searcher.setPromptText("Search worlds...");
        searcher.setPrefHeight(50);
        searcher.setMaxWidth(650);
        searcher.setPrefWidth(650);
        Button addWorld = new Button("+ Add World");
        addWorld.getStyleClass().add("add-world");
        addWorld.setPrefHeight(50);
        addWorld.setPrefWidth(200);
        addWorld.setOnAction(e -> {});
        searcherBelt.getChildren().addAll(searcher, addWorld);
        Label worlds = new Label(worldsInt + " worlds");
        worlds.getStyleClass().add("worlds-worlds");
        belt.getChildren().addAll(subtitle, spacer, worlds);

        getChildren().addAll(title, searcherBelt, belt);
        setSpacing(15);
        setPadding(new Insets(25));
    }
}
