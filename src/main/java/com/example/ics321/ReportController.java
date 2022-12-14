package com.example.ics321;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class ReportController implements Initializable {
    @FXML
    private TextField LocationField;

    @FXML
    private Button btn_generate;

    @FXML
    private TableColumn<Packages, Integer> col_CID;

    @FXML
    private TableColumn<Packages, String> col_Destination;

    @FXML
    private TableColumn<Packages, Integer> col_PID;

    @FXML
    private TableColumn<Packages, Float> col_cost;

    @FXML
    private TableColumn<Packages, Date> col_deliveryDate;

    @FXML
    private TableColumn<Packages, String> col_insuranceAmount;

    @FXML
    private TableColumn<Packages, String> col_status;

    @FXML
    private TableColumn<Packages, String> col_type;

    @FXML
        private ComboBox<String> dropDownCategories;

        @FXML
        private ComboBox<String> dropDownStatus;




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
