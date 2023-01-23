package com.kensoftph.toolbar;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ToolBarController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}