package com.group.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SetNewPasswordActivity extends AppCompatActivity {
    EditText uPassword;
    EditText uCPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_new_password);

        uPassword = findViewById(R.id.eTPassword);
        uCPassword = findViewById(R.id.eTConfirmPassword);
    }


    // Sets a new password in the database
    public void submitPassword(View view) {

        UserModel userModel = (UserModel) getIntent().getSerializableExtra("userInstance");

        String userPassword = uPassword.getText().toString();

        String userCPassword = uCPassword.getText().toString();

        if (userPassword.equals(userCPassword)) {

            UsersDB.resetUserPassword(userModel, userPassword);

            SaveData saveDataInstance = new SaveData();
            UsersDB usersDB = UsersDB.getInstance();
            saveDataInstance.saveUsersToFile(usersDB);

            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else {
            Toast.makeText(this,
                    "Password does not match!",
                    Toast.LENGTH_SHORT).show();
        }


    }
}