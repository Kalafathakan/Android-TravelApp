package com.group.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PhobiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phobia);
    }

    // Bugs button clicked
    public void bugsButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, LandscapeActivity.class);

        // Add bugs to result
        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        result.setPhobia("Bugs");

        // Pass bugs to next activity
        intent.putExtra("Result", result);

        // Start the first activity page
        startActivity(intent);
    }

    // Crowds button clicked
    public void crowdsButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, LandscapeActivity.class);

        // Add crowds to result
        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        result.setPhobia("Crowds");

        // Pass crowds to next activity
        intent.putExtra("Result", result);

        // Start the first activity page
        startActivity(intent);
    }

    // Wild Animal button clicked
    public void wildAnimalsButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, LandscapeActivity.class);

        // Add wild animals to result
        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        result.setPhobia("Wild Animals");

        // Pass wild animals to next activity
        intent.putExtra("Result", result);

        // Start the first activity page
        startActivity(intent);
    }

    // None of the above button clicked
    public void noneButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, LandscapeActivity.class);

        // Add wild animals to result
        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        result.setPhobia("None");

        // Pass none to next activity
        intent.putExtra("Result", result);

        // Start the first activity page
        startActivity(intent);
    }

    // Back button clicked
    public void backButtonClicked(View view) {
        finish();
    }

    // Start over button clicked
    public void startOverButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, MainActivity.class);

        // Start the first activity page
        startActivity(intent);
    }
}