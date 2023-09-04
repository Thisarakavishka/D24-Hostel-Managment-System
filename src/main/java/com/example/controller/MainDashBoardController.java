package com.example.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainDashBoardController {

    @FXML
    public JFXButton btnUsers;

    @FXML
    private AnchorPane root;

    @FXML
    private JFXButton btnDashBoard;

    @FXML
    private JFXButton btnStudent;

    @FXML
    private JFXButton btnRoom;

    @FXML
    private JFXButton btnLogout;

    @FXML
    private AnchorPane changeRoot;

    @FXML
    void btnDashBoardOnAction(ActionEvent event) {

    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) {

    }

    @FXML
    void btnRoomOnAction(ActionEvent event) throws IOException {
        changeRoot.getChildren().clear();
        changeRoot.getChildren().add(FXMLLoader.load(getClass().getResource("/view/RoomForm.fxml")));
    }

    @FXML
    void btnStudentOnAction(ActionEvent event) throws IOException {
        changeRoot.getChildren().clear();
        changeRoot.getChildren().add(FXMLLoader.load(getClass().getResource("/view/StudentForm.fxml")));
    }

    @FXML
    void btnUsersOnAction(ActionEvent event) throws IOException {
        changeRoot.getChildren().clear();
        changeRoot.getChildren().add(FXMLLoader.load(getClass().getResource("/view/UserForm.fxml")));
    }
}
