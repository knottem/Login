package com.example.login.Controllers;

import com.example.login.Main;
import com.example.login.Users.Admins;
import com.example.login.Users.SuperUsers;
import com.example.login.Users.Users;
import com.example.login.dataBase;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginSceneController {



    public Button buttonScene;
    public TextField userName;
    public PasswordField password;
    public Label loginText;

    dataBase dataBase = new dataBase();


    public void loginAttempt() {

        String user = userName.getText();
        String pass = password.getText();


        for (int i = 0; i < dataBase.admins.size(); i++) {
            if(Objects.equals(dataBase.admins.get(i).getUserName(), user)){
                if(Objects.equals(dataBase.admins.get(i).getPassword(), pass)){
                    changeScene(dataBase.admins.get(i));
                }
                else{
                    loginText.setText("Wrong password for user: " + dataBase.admins.get(i).getUserName());
                }
            }
        }
        for (int i = 0; i < dataBase.users.size(); i++) {
            if(Objects.equals(dataBase.users.get(i).getUserName(), user)){
                if(Objects.equals(dataBase.users.get(i).getPassword(), pass)){
                    changeScene(dataBase.users.get(i));
                }
                else{
                    loginText.setText("Wrong password for user: " + dataBase.users.get(i).getUserName());
                }
            }
            else {
                loginText.setText("There's no user called: " + user);
            }
        }


    }
    public String getName(){
        return userName.getText();
    }


    public void changeScene(SuperUsers superUsers) {

        if(superUsers.getClass() == Admins.class) {
            changeSceneMethod("admin");
        } else if (superUsers.getClass() == Users.class) {
            changeSceneMethod("user");
        }
    }

    private void changeSceneMethod(String sceneName) {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource(sceneName + ".fxml"));
            Stage stage = (Stage) buttonScene.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }


}