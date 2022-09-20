package com.projetos.agenda;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tadt
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/TelaPrincipal.fxml"));

        Image image = new Image(getClass().getResourceAsStream("/icons/iconeAplicacao.png"));
        stage.getIcons().add(image);
        Scene scene = new Scene(root);
        scene.getStylesheets().add("styles/Styles.css");

        stage.setTitle("Agenda de Contatos");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

}
