package com.example.login.Controllers;

import com.example.login.Main;
import com.example.login.Users.Admins;
import com.example.login.Users.SuperUsers;
import com.example.login.Users.Users;
import com.example.login.dataBase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class adminSceneController {
    
    public TableView<SuperUsers> adminTable;
    public Font x3,x1;
    public Color x2,x4;
    public MenuItem logout;
    public TableColumn<Admins, String> name, password;
    public TableColumn<Admins, Integer> tableId;
    public Button adminButton,customerButton;

    dataBase dataBase = new dataBase();

    final ObservableList<SuperUsers> data = FXCollections.observableArrayList();

    public void logoutAction() {
        try {
                FXMLLoader loader = new FXMLLoader(Main.class.getResource("loginScene.fxml"));
                Stage stage = (Stage) adminTable.getScene().getWindow();
                Scene scene = new Scene(loader.load());
                stage.setScene(scene);
            } catch (IOException io) {
                io.printStackTrace();
            }
    }

    public void showAdminList() {
        showList(dataBase.users,dataBase.admins,true);
    }

    public void showCustomerList() {
        showList(dataBase.users, dataBase.admins,false);
    }

    private void showList(ArrayList<Users> dataBaseUsers,ArrayList<Admins> dataBaseAdmins, boolean admins ){
        adminTable.getItems().clear();
        data.removeAll();
        if(admins){
            data.addAll(dataBaseAdmins);
        }
        else{
            data.addAll(dataBaseUsers);
        }
        tableId.setCellValueFactory(new PropertyValueFactory<>("id"));
        name.setCellValueFactory(new PropertyValueFactory<>("userName"));
        password.setCellValueFactory(new PropertyValueFactory<>("password"));
        adminTable.setItems(data);
    }

}
