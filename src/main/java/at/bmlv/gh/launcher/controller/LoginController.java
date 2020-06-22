package at.bmlv.gh.launcher.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField txtUser;

    @FXML
    private PasswordField txtPassword;

    @FXML
    void performLogin(ActionEvent event) {
        String user = txtUser.getText();
        String pass = txtPassword.getText();

        System.out.println("User " + user + " with password '" + pass + "' tried to log in!");
    }
}