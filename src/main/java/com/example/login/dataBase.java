package com.example.login;

import com.example.login.Users.Admins;
import com.example.login.Users.Users;

import java.util.ArrayList;

public class dataBase {

    public ArrayList<Users> users = new ArrayList<>();
    public ArrayList<Admins> admins = new ArrayList<>();

    public dataBase(){
        users.add(new Users("george", "123123"));
        admins.add(new Admins("admin", "aikaik"));

    }
}
