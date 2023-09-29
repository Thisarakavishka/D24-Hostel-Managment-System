package com.example.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginFormController implements Initializable {
    @FXML
    public AnchorPane root;

    @FXML
    private JFXTextField txtUserName;

    @FXML
    private JFXPasswordField txtPassword;

    @FXML
    private JFXButton btnLogin;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtUserName.requestFocus();
    }

    @FXML
    void btnLoginOnAction(ActionEvent event) {
        System.out.println("login button clicked");
        Stage stage = (Stage) root.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/com/example/view/DashBoardForm.fxml"))));
            stage.centerOnScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void txtPasswordOnAction(KeyEvent keyEvent) {
        if (!txtPassword.getText().isEmpty() && (keyEvent.getCode() == KeyCode.ENTER)) {
            btnLogin.fire();
        } else if (txtPassword.getText().isEmpty() && (keyEvent.getCode() == KeyCode.BACK_SPACE || keyEvent.getCode() == KeyCode.UP)) {
            txtUserName.requestFocus();
        }
    }

    @FXML
    void txtUserNameOnAction(KeyEvent keyEvent) {
        if (!txtUserName.getText().isEmpty() && (keyEvent.getCode() == KeyCode.ENTER || keyEvent.getCode() == KeyCode.DOWN)) {
            txtPassword.requestFocus();
        }
    }
}
