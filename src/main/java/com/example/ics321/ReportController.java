package com.example.ics321;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ReportController implements Initializable {
        @FXML
        private ComboBox<String> dropDownCategories;

        @FXML
        private ComboBox<String> dropDownStatus;
         @FXML
         private TextField LocationField;
        @FXML
        private Button btn_generate;



    @FXML
    public void setCategoriesItem (ActionEvent e){
        dropDownCategories.setItems(FXCollections.observableArrayList("Regular", "Fragile", "Liquid", "Chemical"));
    }
    @FXML
    public void setStatusItem (ActionEvent e){
        dropDownStatus.setItems(FXCollections.observableArrayList("Delay","Delivered","Damaged","Lost","Ready","In transit", ""));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dropDownCategories.setItems(FXCollections.observableArrayList("Regular", "Fragile", "Liquid", "Chemical"));
        dropDownStatus.setItems(FXCollections.observableArrayList("Delay","Delivered","Damaged","Lost","Ready","In transit", "All"));

    }
}
