package com.example.login.Users;

public abstract class SuperUsers {

    public String userName;
    public String password;

    // 0 = admin, 1 = user
    public int userGroup;

    public SuperUsers(String userName, String password, int userGroup) {
        this.userName = userName;
        this.password = password;
        this.userGroup = userGroup;
    }

    public int getUserGroup() {
        return userGroup;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
