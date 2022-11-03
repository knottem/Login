package com.example.login;

import com.example.login.Users.SuperUsers;
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
                    loginText.setText("Wrong password for user: " + dataBase.admins.get(i).userName);
                }
            }
        }
        for (int i = 0; i < dataBase.users.size(); i++) {
            if(Objects.equals(dataBase.users.get(i).getUserName(), user)){
                if(Objects.equals(dataBase.users.get(i).getPassword(), pass)){
                    changeScene(dataBase.users.get(i));
                }
                else{
                    loginText.setText("Wrong password for user: " + dataBase.users.get(i).userName);
                }
            }
        }


    }
    public String getName(){
        return userName.getText();
    }


    public void changeScene(SuperUsers superUsers) {
        if(superUsers.getUserGroup() == 0) {
            changeSceneMethod("admin");
        } else if (superUsers.getUserGroup() == 1) {
            changeSceneMethod("user");
        }
    }

    private void changeSceneMethod(String sceneName) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(sceneName + ".fxml"));
            Stage stage = (Stage) buttonScene.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }


}