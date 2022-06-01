package com.group.project;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Environment;
import android.util.Log;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SaveData extends AppCompatActivity {

    // Load users from database
    public UsersDB loadUsersFromFile() {
        ObjectInput in;
        UsersDB instance = null;
        try {
            File file = new File(UsersDB.getFilePath(), "users.data");
            in = new ObjectInputStream(new FileInputStream(file));
            instance = (UsersDB) in.readObject();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }

    // Save users to database
    public void saveUsersToFile(UsersDB instance) {
        ObjectOutput out;
        try {
            File outFile = new File(UsersDB.getFilePath(), "users.data");
            out = new ObjectOutputStream(new FileOutputStream(outFile));
            out.writeObject(instance);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Save the users to a file
    public void saveResultsToFile(ResultsDB instance) {
        ObjectOutput out;
        try {
            File outFile = new File(UsersDB.getFilePath(), "results.data");
            out = new ObjectOutputStream(new FileOutputStream(outFile));
            out.writeObject(instance);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Load results from user database file
    public ResultsDB loadResultsFromFile() {
        ObjectInput in;
        ResultsDB instance = null;
        try {
            File file = new File(UsersDB.getFilePath(), "results.data");
            in = new ObjectInputStream(new FileInputStream(file));
            instance = (ResultsDB) in.readObject();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }

}
