package com.example.login.Users;

public abstract class SuperUsers {

    private final String userName;
    private final String password;
    Integer[] settings = {0,0,0,0,0,0,0};

    public SuperUsers(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Integer[] getSettings(){
        return settings;
    }

    public void setSettings(Integer[] settings) {
        this.settings = settings;
    }
}
