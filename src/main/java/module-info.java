module com.example.d24hostelmanagmentsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;


    opens com.example to javafx.fxml;
    exports com.example;
    exports com.example.controller;
    opens com.example.controller to javafx.fxml;
}