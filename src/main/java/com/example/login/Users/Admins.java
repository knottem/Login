package com.example.login.Users;

public class Admins extends SuperUsers{

    private final int id;
    private static int nextId = 0;

    public Admins(String userName, String password) {
        super(userName, password);
        id = nextId;
        nextId++;
    }
    public int getId() {
        return id;
    }

}
