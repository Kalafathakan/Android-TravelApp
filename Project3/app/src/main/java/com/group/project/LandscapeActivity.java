package com.group.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LandscapeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landscape);
    }

    // Beach button clicked
    public void beachButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, BudgetActivity.class);

        // Add beach to result
        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        result.setLandscape("Beach");

        // Pass beach to next activity
        intent.putExtra("Result", result);

        // Start the first activity page
        startActivity(intent);
    }

    // Urban button clicked
    public void urbanButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, BudgetActivity.class);

        // Add urban to result
        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        result.setLandscape("Urban");

        // Pass urban to next activity
        intent.putExtra("Result", result);

        // Start the first activity page
        startActivity(intent);
    }

    // Rural button clicked
    public void ruralButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, BudgetActivity.class);

        // Add rural to result
        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        result.setLandscape("Rural");

        // Pass rural to next activity
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