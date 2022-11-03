package com.example.login;

import com.example.login.Users.Admins;
import com.example.login.Users.Users;

import java.util.ArrayList;

public class dataBase {

    ArrayList<Users> users = new ArrayList<>();
    ArrayList<Admins> admins = new ArrayList<>();

    public dataBase(){
        users.add(new Users("george", "123123",1));
        admins.add(new Admins("admin", "aikaik", 0));

    }
}
