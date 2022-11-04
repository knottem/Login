package com.example.login.Users;

public class Users extends SuperUsers{

    private final int id;
    private static int nextId = 0;

    public Users(String userName, String password) {
        super(userName, password);
        id = nextId;
        nextId++;
    }
    public int getId() {
        return id;
    }


}
