package com.example.login;

import com.example.login.Users.Admins;
import com.example.login.Users.Users;

import java.util.ArrayList;

public class dataBase {

    public ArrayList<Users> users = new ArrayList<>();
    public ArrayList<Admins> admins = new ArrayList<>();

    public dataBase(){

        admins.add(new Admins("admin", "a"));

        users.add(new Users("george", "123123"));
        users.add(new Users("Daniel", "1233"));
        users.add(new Users("Peter", "12313323"));
        users.add(new Users("Erik", "1233"));
    }
}
