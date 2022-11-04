package com.example.login.Controllers;

import com.example.login.Tools;
import com.example.login.dataBase;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class UserSceneController extends Tools {



    public Label userLabel1;
    public Button button1;
    public Label userLabel3;
    public Label userLabel2;


    public void getAllInfo() {

        for (int i = 0; i < dataBase.users.size(); i++) {
            if (dataBase.users.get(i).getActive()) {
                userLabel1.setText(dataBase.users.get(i).getUserName());
            }
        }
    }
}
