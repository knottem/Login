package com.example.login.Users;

public abstract class SuperUsers {

    private final String userName;
    private final String password;
    private boolean active;
    Integer[] settings = {0,0,0,0,0,0,0};

    public SuperUsers(String userName, String password, boolean active) {
        this.userName = userName;
        this.password = password;
        this.active = active;
    }


    public String getUserName() {
        return userName;
    }

    public void setActive() {
        active = true;
    }

    public void disableActive(){
        active = false;
    }

    public boolean getActive(){
        return active;
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
