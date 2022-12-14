package com.example.ics321;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.Date;

public class packagesController {
    @FXML
    private Button btn_add;

    @FXML
    private Button btn_edit;
    @FXML
    private Button btn_remove;
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
    private TableColumn<Packages, Float> col_depth;

    @FXML
    private TableColumn<Packages, Float> col_height;

    @FXML
    private TableColumn<Packages, String> col_insuranceAmount;

    @FXML
    private TableColumn<Packages, String> col_rout;

    @FXML
    private TableColumn<Packages, String> col_status;

    @FXML
    private TableColumn<Packages, String> col_type;

    @FXML
    private TableColumn<Packages, Float> col_weight;

    @FXML
    private TableColumn<Packages, Float> col_width;

    @FXML
    private TextField searchField;

    @FXML
    private Button search_button;

    @FXML
    private TableView<Packages> table_Packages;
}

