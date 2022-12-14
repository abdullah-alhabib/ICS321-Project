package com.example.ics321;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import  javafx.scene.control.*;


public class loginController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button cancelButton;
    @FXML
    private Label errorMassege;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private TextField usernameTextField;
public void errormassegeOnAction(ActionEvent e){
        errorMassege.setText("HI");
        if(usernameTextField.getText().isBlank()==false && passwordTextField.getText().isBlank()==false){
            errorMassege.setText("HI");

        }else {
            errorMassege.setText("Please Enter username and password probably");

        }
    }

public void cancelButtonOnAction(ActionEvent e){
    Stage stage = (Stage) cancelButton.getScene().getWindow();
    stage.close();
}
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}