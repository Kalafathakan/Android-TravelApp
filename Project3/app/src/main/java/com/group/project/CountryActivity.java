package com.group.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        initializeCountries();
    }

    private void initializeCountries() {
        Quiz quiz = new Quiz();

        // Get result
        ResultModel result = (ResultModel) getIntent().getSerializableExtra("Result");

        // Get buttons
        Button button1 = (Button) findViewById(R.id.buttonCountry1);
        Button button2 = (Button) findViewById(R.id.buttonCountry2);
        Button button3 = (Button) findViewById(R.id.buttonCountry3);
        Button button4 = (Button) findViewById(R.id.buttonCountry4);
        Button button5 = (Button) findViewById(R.id.buttonCountry5);

        Button[] buttons = new Button[] {button1, button2, button3, button4, button5};

        // Filter countries
        ArrayList<String> countryList = quiz.getCountriesFromCities(result);

        // Hide buttons depending on how many results there are
        switch (countryList.size()) {
            case 1:
                button2.setVisibility(View.GONE);
                button3.setVisibility(View.GONE);
                button4.setVisibility(View.GONE);
                button5.setVisibility(View.GONE);
                break;
            case 2:
                button3.setVisibility(View.GONE);
                button4.setVisibility(View.GONE);
                button5.setVisibility(View.GONE);
                break;
            case 3:
                button4.setVisibility(View.GONE);
                button5.setVisibility(View.GONE);
                break;
            case 4:
                button5.setVisibility(View.GONE);
        }

        // Display the country names in the buttons
        for (int i = 0; i < countryList.size(); i++) {
            buttons[i].setText(countryList.get(i));
        }

    }

    // First country button clicked
    public void firstCountryButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, CityActivity.class);

        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        Button button = (Button) findViewById(R.id.buttonCountry1);

        result.setCountryName(button.getText().toString());
        intent.putExtra("Result", result);
        // Start the first activity page
        startActivity(intent);
    }

    // Second country button clicked
    public void secondCountryButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, CityActivity.class);

        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        Button button = (Button)findViewById(R.id.buttonCountry2);

        result.setCountryName(button.getText().toString());
        intent.putExtra("Result", result);
        // Start the first activity page
        startActivity(intent);

    }

    // Third country button clicked
    public void thirdCountryButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, CityActivity.class);

        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        Button button = (Button)findViewById(R.id.buttonCountry3);

        result.setCountryName(button.getText().toString());
        intent.putExtra("Result", result);
        // Start the first activity page
        startActivity(intent);
    }

    // Fourth country button clicked
    public void fourthCountryButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, CityActivity.class);

        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        Button button = (Button)findViewById(R.id.buttonCountry4);

        result.setCountryName(button.getText().toString());
        intent.putExtra("Result", result);
        // Start the first activity page
        startActivity(intent);
    }

    // Fifth country button clicked
    public void fifthCountryButtonClicked(View view) {
        //Create intent
        Intent intent = new Intent(this, CityActivity.class);

        ResultModel result = (ResultModel)getIntent().getSerializableExtra("Result");
        Button button = (Button)findViewById(R.id.buttonCountry5);

        result.setCountryName(button.getText().toString());
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