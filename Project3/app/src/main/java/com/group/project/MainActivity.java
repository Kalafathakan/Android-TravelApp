package com.group.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createFilePath();
    }

    // Creates path for where to store users
    public void createFilePath() {
        UsersDB.setFilePath(this.getFilesDir());
        Log.d("file name", this.getFilesDir().toString());
    }

    // Start button clicked
    public void startButtonClicked(View view) {

        // Load users and results database
        Intent intent;
        SaveData saveDataInstance = new SaveData();
        UsersDB usersDB = UsersDB.getInstance();
        ResultsDB resultsDB = ResultsDB.getInstance();

        usersDB = saveDataInstance.loadUsersFromFile();
        resultsDB = saveDataInstance.loadResultsFromFile();

        UsersDB.setInstance(usersDB);
        ResultsDB.setInstance(resultsDB);

        ResultModel result = new ResultModel();

        String sharedSaveName = "saveUserName";
        SharedPreferences mPreferences = getSharedPreferences(sharedSaveName, MODE_PRIVATE);

        // Show login page if user is not logged in, otherwise go to main menu page
        if (mPreferences.getString("user_name", "").length() == 0) {
            intent = new Intent(this, LogInPageActivity.class);
        } else {
            intent = new Intent(this, MenuActivity.class);
        }
        intent.putExtra("Result", result);
        startActivity(intent);
    }

}