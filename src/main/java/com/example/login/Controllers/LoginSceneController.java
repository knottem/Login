package com.example.login.Controllers;

import com.example.login.LoginMethods;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginSceneController {



    public Button buttonScene;
    public TextField userName;
    public PasswordField password;
    public Label loginText;

    LoginMethods loginMethods = new LoginMethods();


    public void loginAttempt() {
        String user = userName.getText();
        String pass = password.getText();

        loginMethods.loginAttempt(user,pass,loginText,buttonScene);

    }

}