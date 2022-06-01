package com.group.project;

import com.google.gson.annotations.SerializedName;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UsersDB implements Serializable {

    // Variables
    static private UsersDB usersDB = null;
    @SerializedName("users")
    private List<UserModel> myUsers = new ArrayList<>();

    static private File filePath = null;

    // Get the file path
    public static File getFilePath() {
        return filePath;
    }

    // Get all users
    public static List<UserModel> getAllUsers() {
        return UsersDB.getInstance().myUsers;
    }

    // Get user database instance
    static public UsersDB getInstance() {
        if (usersDB == null) {
            usersDB = new UsersDB();
        }
        return usersDB;
    }

    // Set the file path
    public static void setFilePath(File f) {
        filePath = f;
    }

    // Add user to database
    public void addUser(UserModel u) {
        myUsers.add(u);
    }

    // Set the user database instance
    public static void setInstance(UsersDB usr) {
        if (usr != null) {
            usersDB = usr;
        }
    }

    // Check if user exists in the database
    public static Boolean checkUserExists(String userEmail) {

        for (UserModel usr : UsersDB.getInstance().myUsers) {
            if (usr.getEmail().equals(userEmail)) {
                return true;
            }
        }
        return false;
    }

    // Send existing user from the database
    public static UserModel sendExistUser(String userEmail) {
        for (UserModel usr : UsersDB.getInstance().myUsers) {
            if (usr.getEmail().equals(userEmail)) {
                return usr;
            }
        }
        return null;
    }

    // Reset password of user in the database using access code
    public static UserModel resetPassword(UserModel u) {
        SaveData ss = new SaveData();
        for (UserModel usr : ss.loadUsersFromFile().getAllUsers()) {

            if (usr.getEmail().equals(u.getEmail())) {

                if (usr.getAccessCode().equals(u.getAccessCode())) {
                    return usr;
                }
            }
        }

        return null;
    }

    public static void resetUserPassword(UserModel u, String newPassword) {
        SaveData ss = new SaveData();
        for (UserModel usr : ss.loadUsersFromFile().getAllUsers()) {

            if (usr.getEmail().equals(u.getEmail())) {
                usr.setPassword(newPassword);
            }
        }
    }

    // Validate user using email and password
    public static Boolean validateUser(UserModel u) {
        SaveData ss = new SaveData();
        for (UserModel usr : ss.loadUsersFromFile().getAllUsers()) {
            if (usr.getEmail().equals(u.getEmail())) {
                if (usr.getPassword().equals(u.getPassword())) {
                    return true;
                }
            }
        }
        return false;
    }
}
