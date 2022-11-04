package com.example.login;

import com.example.login.Tools.Tools;
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

public class LoginMethods extends Tools {



    private void changeScene(SuperUsers superUsers, Button button) {

        superUsers.setActive();
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

        for (int i = 0; i < com.example.login.Tools.dataBase.admins.size(); i++) {
            if(Objects.equals(com.example.login.Tools.dataBase.admins.get(i).getUserName(), user)){
                if(Objects.equals(com.example.login.Tools.dataBase.admins.get(i).getPassword(), pass)){
                    changeScene(com.example.login.Tools.dataBase.admins.get(i), button);
                    break;
                }
                else{
                    loginText.setText("Wrong password for user: " + com.example.login.Tools.dataBase.admins.get(i).getUserName());
                }
            }
        }
        for (int i = 0; i < com.example.login.Tools.dataBase.users.size(); i++) {
            if(Objects.equals(com.example.login.Tools.dataBase.users.get(i).getUserName(), user)){
                if(Objects.equals(com.example.login.Tools.dataBase.users.get(i).getPassword(), pass)){
                    changeScene(com.example.login.Tools.dataBase.users.get(i), button);
                    break;
                }
                else{
                    loginText.setText("Wrong password for user: " + com.example.login.Tools.dataBase.users.get(i).getUserName());
                }
            }
            else {
                loginText.setText("There's no user called: " + user);
            }
        }

    }
}
