package com.example.login.Tools;

import com.example.login.Users.Admins;
import com.example.login.Users.Users;

import java.util.ArrayList;

public class dataBase {

    public static ArrayList<Users> users = new ArrayList<>();
    public static ArrayList<Admins> admins = new ArrayList<>();

    public dataBase(){

        admins.add(new Admins("admin", "a",false));

        users.add(new Users("george", "a",false));
        users.add(new Users("Daniel", "1233",false));
        users.add(new Users("Peter", "12313323",false));
        users.add(new Users("Erik", "1233",false));
    }
}
