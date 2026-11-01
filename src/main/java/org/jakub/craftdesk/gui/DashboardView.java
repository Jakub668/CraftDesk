package org.jakub.craftdesk.gui;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class DashboardView extends VBox {
    public DashboardView() {
        getStyleClass().add("views-background");
        int mCountInt = 0;
        int sCountInt = 0;
        Label title = new Label("Dashboard");
        title.getStyleClass().add("views-title");
        HBox statsRow = new HBox();
        VBox worldsCard = new VBox();
        worldsCard.getStyleClass().add("Cards");
        VBox modsCard = new VBox();
        modsCard.getStyleClass().add("Cards");
        VBox serversCard = new VBox();
        serversCard.getStyleClass().add("Cards");
        Label worlds = new Label("Worlds");
        worlds.getStyleClass().add("dashboard-text");
        Label mods = new Label("Mods");
        mods.getStyleClass().add("dashboard-text");
        Label servers = new Label("Servers");
        servers.getStyleClass().add("dashboard-text");
        Label wCount = new Label(String.valueOf(WorldsView.worldsInt));
        wCount.getStyleClass().add("wCount");
        Label mCount = new Label(String.valueOf(mCountInt));
        mCount.getStyleClass().add("mCount");
        Label sCount = new Label(String.valueOf(sCountInt));
        sCount.getStyleClass().add("sCount");
        Label wDescription = new Label("Saved worlds");
        wDescription.getStyleClass().add("description");
        Label mDescription = new Label("Installed mods");
        mDescription.getStyleClass().add("description");
        Label sDescription = new Label("Saved servers");
        sDescription.getStyleClass().add("description");
        Image worldIcon = new Image(getClass().getResourceAsStream("/images/world.png"));
        ImageView worldImage = new ImageView(worldIcon);
        worldImage.setFitHeight(28);
        worldImage.setFitWidth(28);
        worldImage.setPreserveRatio(true);
        HBox worldsHeader = new HBox(10);
        worldsHeader.getChildren().addAll(worldImage, worlds);
        Image modsIcon = new Image(getClass().getResourceAsStream("/images/mods.png"));
        ImageView modsImage = new ImageView(modsIcon);
        modsImage.setFitHeight(28);
        modsImage.setFitWidth(28);
        modsImage.setPreserveRatio(true);
        HBox modsHeader = new HBox(10);
        modsHeader.getChildren().addAll(modsImage, mods);
        Image serversIcon = new Image(getClass().getResourceAsStream("/images/servers.png"));
        ImageView serversImage = new ImageView(serversIcon);
        serversImage.setFitHeight(28);
        serversImage.setFitWidth(28);
        serversImage.setPreserveRatio(true);
        HBox serversHeader = new HBox(10);
        serversHeader.getChildren().addAll(serversImage, servers);

        getChildren().addAll(title, statsRow);
        setSpacing(15);
        setPadding(new Insets(25));

        statsRow.setSpacing(15);
        statsRow.getChildren().addAll(worldsCard, modsCard, serversCard);

        worldsCard.setSpacing(10);
        worldsCard.setPadding(new Insets(20));
        worldsCard.setPrefHeight(130);
        worldsCard.setPrefWidth(200);
        worldsCard.getChildren().addAll(worldsHeader, wCount, wDescription);
        modsCard.setSpacing(10);
        modsCard.setPadding(new Insets(20));
        modsCard.setPrefHeight(130);
        modsCard.setPrefWidth(200);
        modsCard.getChildren().addAll(modsHeader, mCount, mDescription);
        serversCard.setSpacing(10);
        serversCard.setPadding(new Insets(20));
        serversCard.setPrefHeight(130);
        serversCard.setPrefWidth(200);
        serversCard.getChildren().addAll(serversHeader, sCount, sDescription);
    }
}
