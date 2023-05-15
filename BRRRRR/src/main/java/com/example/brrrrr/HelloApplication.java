package com.example.brrrrr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Pane fenetrePrincipale = new Pane();
//creation menu
        SeparatorMenuItem separator = new SeparatorMenuItem();
        SeparatorMenuItem separator1 = new SeparatorMenuItem();
        SeparatorMenuItem separator2 = new SeparatorMenuItem();
        SeparatorMenuItem separator3 = new SeparatorMenuItem();
        SeparatorMenuItem separator4 = new SeparatorMenuItem();

        Menu menu1 = new Menu("File");
        MenuItem neww = new MenuItem("New");
        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        MenuItem close = new MenuItem("Close");
        menu1.getItems().setAll(neww, separator, open, separator1, save, separator2, close);
        Menu menu2 = new Menu("Edit");
        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");
        menu2.getItems().setAll(cut, separator3, copy, separator4, paste);
        Menu menu3 = new Menu("Help");
        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);
        menuBar.setPrefWidth(4000);




        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(200, 0, 0,250));

        Label userName = new Label("Name:");
        grid.add(userName, 0, 1);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label email = new Label("Email:");
        grid.add(email, 0, 2);
        TextField emailTextField = new TextField();
        grid.add(emailTextField, 1, 2);

        Label password = new Label("Password:");
        grid.add(password, 0, 3);
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 3);

        Button cancel = new Button("Cancel");
        HBox hbCancel = new HBox(10);
        hbCancel.setAlignment(Pos.BOTTOM_LEFT);
        hbCancel.getChildren().add(cancel);
        grid.add(hbCancel, 1, 4);


        Button submit = new Button("Submit");
        HBox hbSubmit = new HBox(10);
        hbSubmit.setAlignment(Pos.BOTTOM_RIGHT);
        hbSubmit.getChildren().add(submit);
        grid.add(hbSubmit, 1, 4);





        GridPane gridbtn = new GridPane();
        gridbtn.setAlignment(Pos.CENTER_LEFT);
        gridbtn.setHgap(10);
        gridbtn.setVgap(10);
        gridbtn.setPrefSize(800,600);
        //grid.setPadding(new Insets());

        Label labelButton = new Label("Boutons:");
        gridbtn.add(labelButton, 0, 0);

        Button button1 = new Button("button1");
        HBox hbbutton1 = new HBox(10);
        hbbutton1.setAlignment(Pos.BOTTOM_LEFT);
        hbbutton1.getChildren().add(button1);
        gridbtn.add(hbbutton1, 0, 1);

        Button button2 = new Button("button2");
        HBox hbbutton2 = new HBox(10);
        hbbutton2.setAlignment(Pos.BOTTOM_LEFT);
        hbbutton2.getChildren().add(button2);
        gridbtn.add(hbbutton2, 0, 2);

        Button button3 = new Button("button3");
        HBox hbbutton3 = new HBox(10);
        hbbutton3.setAlignment(Pos.BOTTOM_LEFT);
        hbbutton3.getChildren().add(button3);
        gridbtn.add(hbbutton3, 0, 3);

// Ajout des contrôleurs au conteneur principal
        fenetrePrincipale.getChildren().addAll(
                menuBar,
                grid,
                gridbtn
        );
// Ajout du conteneur à la scene
        Scene scene = new Scene(fenetrePrincipale);
// Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("WEWEWE");

// Affichage de la fenêtre
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}