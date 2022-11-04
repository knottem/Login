package com.example.login.Users;

import javafx.beans.property.StringProperty;

public class Admins extends SuperUsers{

    private final int idAdmins;
    private static int nextIdAdmins = 0;

    public Admins(String userName, String password) {
        super(userName, password);
        idAdmins = nextIdAdmins;
        nextIdAdmins++;
    }
    public int getId() {
        return idAdmins;
    }

}
