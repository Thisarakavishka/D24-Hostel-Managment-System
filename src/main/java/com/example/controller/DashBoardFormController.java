package com.example.controller;

import com.jfoenix.controls.JFXButton;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardFormController implements Initializable {

    @FXML
    private AnchorPane root;

    @FXML
    private Pane changeRoot;

    @FXML
    private JFXButton btnDashBoard;

    @FXML
    private JFXButton btnStudents;

    @FXML
    private JFXButton btnRoom;

    @FXML
    private JFXButton btnKeyMoney;

    @FXML
    private JFXButton btnRegistration;

    @FXML
    private JFXButton btnLogout;

    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(() -> {
            stage = (Stage) root.getScene().getWindow();
        });
    }

    @FXML
    void btnDashBoardOnAction(ActionEvent event) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/com/example/view/DashBoardForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnKeyMoneyOnAction(ActionEvent event) {
        try {
            changeRoot.getChildren().clear();
            changeRoot.getChildren().add(FXMLLoader.load(getClass().getResource("/com/example/view/KeyMoneyForm.fxml")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/com/example/view/LoginForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnRegistrationOnAction(ActionEvent event) {
        try {
            changeRoot.getChildren().clear();
            changeRoot.getChildren().add(FXMLLoader.load(getClass().getResource("/com/example/view/RegistrationForm.fxml")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnRoomOnAction(ActionEvent event) {
        try {
            changeRoot.getChildren().clear();
            changeRoot.getChildren().add(FXMLLoader.load(getClass().getResource("/com/example/view/RoomsFrom.fxml")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnStudentsOnAction(ActionEvent event) {
        try {
            changeRoot.getChildren().clear();
            changeRoot.getChildren().add(FXMLLoader.load(getClass().getResource("/com/example/view/RoomsFrom.fxml")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
