package com.example.login.Controllers;

import com.example.login.Main;
import com.example.login.Users.SuperUsers;
import com.example.login.dataBase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class adminSceneController implements Initializable {
    
    public TableView<SuperUsers> adminTable;
    public Font x3;
    public Color x4;
    public MenuItem logout;
    public TableColumn<SuperUsers, String> name;
    public TableColumn<SuperUsers, String> password;
    public Font x1;
    public Color x2;

    dataBase dataBase = new dataBase();

    final ObservableList<SuperUsers> data = FXCollections.observableArrayList();
    
    private void initialize(){
        data.addAll(dataBase.admins);
        data.addAll(dataBase.users);
        name.setCellValueFactory(new PropertyValueFactory<>("userName"));
        password.setCellValueFactory(new PropertyValueFactory<>("password"));
        adminTable.setItems(data);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initialize();
    }

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
}
