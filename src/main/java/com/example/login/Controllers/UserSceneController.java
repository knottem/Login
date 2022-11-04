package com.example.login.Controllers;

import com.example.login.Tools.Tools;
import com.example.login.Tools.dataBase;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class UserSceneController extends Tools implements Initializable {



    public Label userLabel1;
    public Button button1;
    public Label userLabel3;
    public Label userLabel2;

    private String userName,password;
    private Integer[] settings;


    public void getAllInfo() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (int i = 0; i < dataBase.users.size(); i++) {
            if (dataBase.users.get(i).getActive()) {
                userName = dataBase.users.get(i).getUserName();
                password = dataBase.users.get(i).getPassword();
                settings = dataBase.users.get(i).getSettings();
            }
        }
        userLabel1.setText("Välkommen till programmet " + userName);
        userLabel2.setText("Ditt lösenord är " + password);
        userLabel3.setText("Dina settings är" + Arrays.toString(settings));
    }
}
