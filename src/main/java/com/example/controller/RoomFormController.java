package com.example.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class RoomFormController {

    @FXML
    private AnchorPane root;

    @FXML
    private JFXButton btnAdd;

    @FXML
    private JFXTextField txtSearch;

    @FXML
    private TableView<?> tableRoom;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colType;

    @FXML
    private TableColumn<?, ?> colKeyMoney;

    @FXML
    private TableColumn<?, ?> colQTY;

    @FXML
    private TableColumn<?, ?> colEdit;

    @FXML
    void btnAddOnAction(ActionEvent event) {

    }

    @FXML
    void txtSearchOnAction(ActionEvent event) {

    }

}
