package com.example.login;

import com.example.login.Users.Admins;
import com.example.login.Users.SuperUsers;
import com.example.login.Users.Users;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginMethods {

    dataBase dataBase = new dataBase();

    private void changeScene(SuperUsers superUsers, Button button) {

        if(superUsers.getClass() == Admins.class) {
            changeSceneMethod("admin", button);
        } else if (superUsers.getClass() == Users.class) {
            changeSceneMethod("user", button);
        }
    }

    private void changeSceneMethod(String sceneName, Button buttonScene) {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource(sceneName + ".fxml"));
            Stage stage = (Stage) buttonScene.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }


    public void loginAttempt(String user, String pass, Label loginText, Button button){

        for (int i = 0; i < dataBase.admins.size(); i++) {
            if(Objects.equals(dataBase.admins.get(i).getUserName(), user)){
                if(Objects.equals(dataBase.admins.get(i).getPassword(), pass)){
                    changeScene(dataBase.admins.get(i), button);
                }
                else{
                    loginText.setText("Wrong password for user: " + dataBase.admins.get(i).getUserName());
                }
            }
        }
        for (int i = 0; i < dataBase.users.size(); i++) {
            if(Objects.equals(dataBase.users.get(i).getUserName(), user)){
                if(Objects.equals(dataBase.users.get(i).getPassword(), pass)){
                    changeScene(dataBase.users.get(i), button);
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
}