package com.group.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void startOver(View view) {
        //Create intent
        Intent intent = new Intent(this, ClimateActivity.class);

        // Add result
        ResultModel result = new ResultModel();

        // Pass result to next activity
        intent.putExtra("Result", result);

        // Start the next question activity page
        startActivity(intent);

    }

    public void seeHistory(View view) {

        //Create intent
        Intent intent = new Intent(this, HistoryActivity.class);

        // Add result
        ResultModel result = (ResultModel) getIntent().getSerializableExtra("Result");

        // Pass result to next activity
        intent.putExtra("Result", result);

        intent.putExtra("seeHistory", true);

        // Start the next question activity page
        startActivity(intent);

    }

}