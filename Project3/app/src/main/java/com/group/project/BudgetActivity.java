package com.group.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BudgetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);
    }

    // 1000 - 2000 button clicked
    public void cheapButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, CountryActivity.class);

        // Add budget to result
        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        result.setBudget("Cheap");

        // Pass budget to next activity
        intent.putExtra("Result", result);

        // Start the first activity page
        startActivity(intent);
    }

    // 2000 - 4000 button clicked
    public void midButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, CountryActivity.class);

        // Add budget to result
        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        result.setBudget("Mid");

        // Pass budget to next activity
        intent.putExtra("Result", result);

        // Start the first activity page
        startActivity(intent);
    }

    // 5000+ button clicked
    public void richButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, CountryActivity.class);

        // Add budget to result
        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        result.setBudget("Rich");

        // Pass budget to next activity
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