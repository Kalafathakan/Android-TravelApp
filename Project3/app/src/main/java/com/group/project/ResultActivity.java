package com.group.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private static final int MY_PERMISSIONS_INTERNET = 7;
    private static final int URL_REQUEST = 1000;
    private static final int MAP_REQUEST = 1100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Get result
        ResultModel result = (ResultModel) getIntent().getSerializableExtra("Result");

        // Set see history to false
        boolean seeHistory = getIntent().getBooleanExtra("seeHistory", false);

        // Get results database
        ResultsDB resultsDB = ResultsDB.getInstance();

        // Add the result to database if see history wasn't pressed
        if (!seeHistory) {
            resultsDB.addResult(result);
        }

        // Save data to results file
        SaveData sv = new SaveData();
        sv.saveResultsToFile(resultsDB);

        // Get buttons, text and image
        TextView cityName = (TextView) findViewById(R.id.txtCityName);
        ImageView cityImg = (ImageView) findViewById(R.id.imgCity);
        TextView cityDesc = (TextView) findViewById(R.id.txtCityDescription);
        Button btnMoreInfo = (Button) findViewById(R.id.btnMoreInfo);
        Button btnMap = (Button) findViewById(R.id.btnMap);
        cityName.setText(result.getCityName());
        cityDesc.setText(result.getDescription());
        cityImg.setImageResource(getResources().getIdentifier(result.getImage(),
                "drawable", this.getPackageName()));

        checkForInternetPermission();
    }

    public void startOver(View view) {
        // Create intent
        Intent intent = new Intent(this, MainActivity.class);

        // Start the initial activity page
        startActivity(intent);

    }

    public void seeHistory(View view) {

        // Create intent
        Intent intent = new Intent(this, HistoryActivity.class);

        /// Get result
        ResultModel result = (ResultModel) getIntent().getSerializableExtra("Result");

        // Pass result and history
        intent.putExtra("Result", result);
        intent.putExtra("seeHistory", true);

        // Start the history activity page
        startActivity(intent);

    }

    // Checks if user has internet enabled
    private void checkForInternetPermission() {
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.INTERNET) !=
                PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.INTERNET},
                    MY_PERMISSIONS_INTERNET);
        }
    }

    // Opens a city's url for more info
    public void moreInfoClicked(View view) {
        // Get result
        ResultModel result = (ResultModel) getIntent().getSerializableExtra("Result");

        String url = result.getUrl();
        Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivityForResult(urlIntent, URL_REQUEST);
    }

    // Opens a city's location in Google Maps
    public void openMapClicked(View view) {
        ResultModel result = (ResultModel) getIntent().getSerializableExtra("Result");
        String parameter = result.getLatitude() + ", " + result.getLongitude();
        Uri mapURI = Uri.parse("geo:" + parameter);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW);
        mapIntent.setData(mapURI);
        startActivityForResult(mapIntent, MAP_REQUEST);
    }
}