package com.example.login.Users;

public abstract class SuperUsers {

    private final String userName;
    private final String password;

    // 0 = admin, 1 = user
    private final int userGroup;

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
