module com.example.ics321 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ics321 to javafx.fxml;
    exports com.example.ics321;
}