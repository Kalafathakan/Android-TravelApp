package com.group.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class CityActivity extends AppCompatActivity {

    private ArrayList<CityModel> cityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        initializeCities();
    }

    private void initializeCities() {
        Quiz quiz = new Quiz();

        // Get result
        ResultModel result = (ResultModel) getIntent().getSerializableExtra("Result");

        // Get buttons
        Button button1 = (Button) findViewById(R.id.buttonCity1);
        Button button2 = (Button) findViewById(R.id.buttonCity2);
        Button button3 = (Button) findViewById(R.id.buttonCity3);

        Button[] buttons = new Button[] {button1, button2, button3};

        // Filter cities
        cityList = quiz.getFinalCities(result);

        // Hide buttons depending on how many results there are
        switch (cityList.size()) {
            case 1:
                button2.setVisibility(View.GONE);
                button3.setVisibility(View.GONE);
                break;
            case 2:
                button3.setVisibility(View.GONE);
                break;
        }

        // Display the city names in the buttons
        for (int i = 0; i < cityList.size(); i++) {
            buttons[i].setText(cityList.get(i).getName());
        }
    }

    public void firstCityButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, ResultActivity.class);

        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        result.setCityName(cityList.get(0).getName());
        result.setDescription(cityList.get(0).getDescription());
        result.setImage(cityList.get(0).getImage());
        result.setUrl(cityList.get(0).getUrl());
        result.setLatitude(cityList.get(0).getLatitude());
        result.setLongitude(cityList.get(0).getLongitude());

        String sharedSaveName = "saveUserName";
        SharedPreferences mPreferences = getSharedPreferences(sharedSaveName, MODE_PRIVATE);
        String userName = mPreferences.getString("user_name", "");
        result.setUserName(userName);

        intent.putExtra("Result", result);
        // Start the first activity page
        startActivity(intent);
    }

    public void secondCityButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, ResultActivity.class);

        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        result.setCityName(cityList.get(1).getName());
        result.setDescription(cityList.get(1).getDescription());
        result.setImage(cityList.get(1).getImage());
        result.setUrl(cityList.get(1).getUrl());
        result.setLatitude(cityList.get(1).getLatitude());
        result.setLongitude(cityList.get(1).getLongitude());

        String sharedSaveName = "saveUserName";
        SharedPreferences mPreferences = getSharedPreferences(sharedSaveName, MODE_PRIVATE);
        String userName = mPreferences.getString("user_name", "");
        result.setUserName(userName);

        intent.putExtra("Result", result);
        // Start the first activity page
        startActivity(intent);
    }

    public void thirdCityButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, ResultActivity.class);

        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        result.setCityName(cityList.get(2).getName());
        result.setDescription(cityList.get(2).getDescription());
        result.setImage(cityList.get(2).getImage());
        result.setUrl(cityList.get(2).getUrl());
        result.setLatitude(cityList.get(2).getLatitude());
        result.setLongitude(cityList.get(2).getLongitude());

        String sharedSaveName = "saveUserName";
        SharedPreferences mPreferences = getSharedPreferences(sharedSaveName, MODE_PRIVATE);
        String userName = mPreferences.getString("user_name", "");
        result.setUserName(userName);

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