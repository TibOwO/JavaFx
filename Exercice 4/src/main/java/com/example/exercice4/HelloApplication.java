package com.example.exercice4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    int nbVert = 0;
    int nbBleu = 0;
    int nbRouge = 0;

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));


        Pane fenetrePrincipale = new Pane();
        VBox Vbox = new VBox();
        BorderPane root = new BorderPane();
        Label label = new Label("Aucune couleure choisie");
        label.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        BorderPane.setAlignment(label, Pos.CENTER);

        Pane couleur = new Pane();
        couleur.setPrefSize(400, 200);

        HBox espaceButton = new HBox();
        espaceButton.setAlignment(Pos.CENTER);

        Button vert = new Button("Vert");
        Button rouge = new Button("Rouge");
        Button bleu = new Button("Bleu");

        vert.setOnAction(event -> {
            ++nbVert;
            label.setText("Vous avez choisis la couleure Vert " + nbVert + " fois. Bien joué !");
            couleur.setStyle("-fx-background-color: #529d45");
        });

        rouge.setOnAction(event -> {
            ++nbRouge;
            label.setText("Vous avez choisis la couleure Rouge " + nbRouge + " fois. Bien joué !");
            couleur.setStyle("-fx-background-color: red");
        });

        bleu.setOnAction(event -> {
            ++nbBleu;
            label.setText("Vous avez choisis la couleure Bleue " + nbBleu + " fois. Bien joué !");
            couleur.setStyle("-fx-background-color: #34bdb1");
        });

        espaceButton.getChildren().addAll(vert, rouge, bleu);
        root.setCenter(couleur);
        root.setTop(label);
        root.setBottom(espaceButton);



        // Ajout du conteneur à la scene
        Scene scene = new Scene(root);
        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.setTitle("WEWEWE");
        // Affichage de la fenêtre
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}