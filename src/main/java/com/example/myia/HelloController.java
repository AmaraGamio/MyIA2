package com.example.myia;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    protected void onHelloButtonClick() throws IOException {
        HelloApplication.setRoot("hellotwo-view");
    }
}