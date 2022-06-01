package com.group.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class SendResetActivity extends AppCompatActivity {

    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_reset_code);
        email = findViewById(R.id.textViewEmail);
    }

    // When submit button is clicked, sends email to user
    public void submitClicked(View view) {
        String userEmail = email.getText().toString();
        sendMail(userEmail);
    }

    // Sends email to reset password using Java mail API
    private void sendMail(String mail) {
        //String mail = "guray1955@gmail.com";
        if (UsersDB.checkUserExists(mail)) {

            UserModel userModel = UsersDB.sendExistUser(mail);
            String message = getSaltString();
            userModel.setAccessCode(message);
            String subject = "Reset my Password";

            JavaMailAPI javaMailAPI = new JavaMailAPI(this, mail, subject, message);
            javaMailAPI.execute();

        } else {
            Toast.makeText(getApplicationContext(),
                    "Email does not exist!",
                    Toast.LENGTH_SHORT);
        }

    }

    // Generates random characters for an access code to reset password
    protected String getSaltString() {
        String saltChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 5) { // length of the random string.
            int index = (int) (rnd.nextFloat() * saltChars.length());
            salt.append(saltChars.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    // Go to submit access code page after clicked
    public void accessCodeClicked(View view) {
        Intent intent = new Intent(this, SendAccessActivity.class);
        startActivity(intent);
    }
}
