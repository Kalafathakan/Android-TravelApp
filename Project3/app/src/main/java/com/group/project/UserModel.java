package com.group.project;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class UserModel implements Serializable {

    // Variables
    @SerializedName("userName")
    private String userName;
    @SerializedName("password")
    private String password;
    private String accessCode;
    private String email;

    // Getters and setters
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void setPassword(String p) {
        this.password = p;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String acc) {
        accessCode = acc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        email = e;
    }

}
