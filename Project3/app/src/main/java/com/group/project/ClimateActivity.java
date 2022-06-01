package com.group.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ClimateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climate);
    }

    // Hot button clicked
    public void hotButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, PhobiaActivity.class);

        // Add hot to result
        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        result.setClimate("Hot");

        // Pass hot to next activity
        intent.putExtra("Result", result);

        // Start the next question activity page
        startActivity(intent);
    }

    // Warm button clicked
    public void warmButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, PhobiaActivity.class);

        // Add warm to result
        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        result.setClimate("Warm");

        // Pass warm to next activity
        intent.putExtra("Result", result);

        // Start the next question activity page
        startActivity(intent);
    }

    // Cold button clicked
    public void coldButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, PhobiaActivity.class);

        // Add cold to result
        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        result.setClimate("Cold");

        // Pass cold to next activity
        intent.putExtra("Result", result);

        // Start the next question activity page
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