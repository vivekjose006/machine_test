package com.fiver.machinetest.model;

/**
 * Created by Vivek Jose on 24-06-2022.
 * <p>
 * project-MachineTest
 * <p>
 * vivekjoseofficial@gmail.com
 */
public class Login {
    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Login(String userID, String password) {
        UserID = userID;
        Password = password;
    }

    String UserID;
    String Password;
}
