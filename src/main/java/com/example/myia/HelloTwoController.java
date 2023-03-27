package com.example.myia;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloTwoController {
    @FXML
    private Label welcomeText;
    @FXML
    protected void onHelloButtonClick() throws IOException {
        System.out.println("This is screen 2");
    }
}