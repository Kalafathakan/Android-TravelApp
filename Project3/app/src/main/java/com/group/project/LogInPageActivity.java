package com.group.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LogInPageActivity extends AppCompatActivity {
    private static final int MY_PERMISSIONS_READ_EXTERNAL_STORAGE = 1;
    private static final int MY_PERMISSIONS_WRITE_EXTERNAL_STORAGE = 2;
    EditText loginEmail;
    EditText loginPassword;

    EditText sUserName;
    EditText sPassword;
    EditText sCPassword;
    EditText sEmail;

    SaveData saveDataInstance = new SaveData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_page);

        loginEmail = (EditText) findViewById(R.id.loginEmail);
        loginPassword = (EditText) findViewById(R.id.loginPassword);

        sEmail = (EditText) findViewById(R.id.sEmail);
        sPassword = (EditText) findViewById(R.id.sPassword);
        sCPassword = (EditText) findViewById(R.id.sCPassword);
        sUserName = (EditText) findViewById(R.id.sFullName);
        String sharedSaveName = "saveUserName";
        SharedPreferences mPreferences = getSharedPreferences(sharedSaveName, MODE_PRIVATE);

        checkForAccessFileSystemPermission();
    }

    private void checkForAccessFileSystemPermission() {
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.READ_EXTERNAL_STORAGE) !=
                PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                    MY_PERMISSIONS_READ_EXTERNAL_STORAGE);
        }

        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE) !=
                PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    MY_PERMISSIONS_WRITE_EXTERNAL_STORAGE);
        }
    }


    public void logInClicked(View view) {
        String uEmail = loginEmail.getText().toString();
        String password = loginPassword.getText().toString();
        UserModel u = new UserModel();
        u.setEmail(uEmail);
        u.setPassword(password);

        if (UsersDB.validateUser(u)) {
            //Create intent
            Intent intent = new Intent(this, MenuActivity.class);
            ResultModel result = (ResultModel) getIntent().getSerializableExtra("Result");

            result.setUserName(uEmail);
            intent.putExtra("Result", result);
            intent.putExtra("user_name", uEmail);

            String sharedSaveName = "saveUserName";
            SharedPreferences mPreferences = getSharedPreferences(sharedSaveName, MODE_PRIVATE);
            SharedPreferences.Editor preferencesEditor = mPreferences.edit();
            preferencesEditor.putString("user_name", uEmail);
            preferencesEditor.apply();

            // Start the first activity page
            startActivity(intent);
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Username or password is incorrect!",
                    Toast.LENGTH_SHORT);

            toast.show();
        }

    }

    public void forgotClicked(View view) {
        Intent intent = new Intent(this, SendResetActivity.class);
        startActivity(intent);
    }

    public void signUpClicked(View view) {
        String uEmail = sEmail.getText().toString();
        String uName = sUserName.getText().toString();
        String password = sPassword.getText().toString();
        String cPassword = sCPassword.getText().toString();

        UsersDB usersDB = UsersDB.getInstance();

        // Check if username is already registered and so error if that's the case
        if (usersDB.checkUserExists(uEmail)) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Username is already registered!",
                    Toast.LENGTH_SHORT);

            toast.show();
        }
        else if (uEmail.isEmpty() && uName.isEmpty() && password.isEmpty()){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Please Fill in the boxes",
                    Toast.LENGTH_SHORT);

            toast.show();
        }
        // Otherwise check if the passwords match
        else if (password.equals(cPassword)) {
            UserModel user = new UserModel();

            user.setEmail(uEmail);
            user.setUserName(uName);
            user.setPassword(password);

            UsersDB allUsers = UsersDB.getInstance();
            allUsers.addUser(user);

            saveDataInstance.saveUsersToFile(allUsers);

            //Create intent
            Intent intent = new Intent(this, ClimateActivity.class);
            ResultModel result = new ResultModel();
            result.setUserName(uEmail);
            intent.putExtra("Result", result);
            intent.putExtra("user_name", uEmail);

            String sharedSaveName = "saveUserName";
            SharedPreferences mPreferences = getSharedPreferences(sharedSaveName, MODE_PRIVATE);
            SharedPreferences.Editor preferencesEditor = mPreferences.edit();
            preferencesEditor.putString("user_name", uEmail);
            preferencesEditor.apply();

            // Start the first activity page
            startActivity(intent);
        }
        // If the passwords don't match, show an error
        else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Passwords do not match!",
                    Toast.LENGTH_SHORT);

            toast.show();
        }

    }
}