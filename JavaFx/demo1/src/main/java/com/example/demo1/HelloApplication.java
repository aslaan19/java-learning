package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import   javafx.scene.layout.Pane;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Button btok = new Button("ok");
        StackPane pane = new StackPane();
        StackPane.getChildren().add(btok);
    }

    public static void main(String[] args) {
        launch();
    }
}