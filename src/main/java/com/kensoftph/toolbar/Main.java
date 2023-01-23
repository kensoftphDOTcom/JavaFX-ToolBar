package com.kensoftph.toolbar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("javafx-toolbar.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/

        BorderPane layout = new BorderPane();

        ToolBar toolBar = new ToolBar();
        Button btn1 = new Button("Rectangle");
        Button btn2 = new Button("Circle");
        Button btn3 = new Button("Line");
        Button btn4 = new Button("Arrow");
        Button btn5 = new Button("Oval");

        TextField txt = new TextField();

        toolBar.getItems().addAll(btn1, btn2, btn3, btn4, btn5, txt);
        layout.setTop(toolBar);

        Scene scene = new Scene(layout, 300, 400);
        stage.setScene(scene);
        stage.setTitle("JavaFX Toolbar");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}