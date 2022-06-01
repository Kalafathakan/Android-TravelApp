package com.group.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {

    String user_name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        // Get the result
        ResultModel result = (ResultModel) getIntent().getSerializableExtra("Result");

        // Check if the history page should be active or not
        boolean seeHistory = getIntent().getBooleanExtra("seeHistory", false);

        // Retrieve username from shared preferences
        String sharedSaveName = "saveUserName";
        SharedPreferences mPreferences = getSharedPreferences(sharedSaveName, MODE_PRIVATE);
        user_name = mPreferences.getString("user_name", "");

        // Retrieve results from database
        ResultsDB resultsDB = ResultsDB.getInstance();

        // Add the result to history if it's not empty
        if (!seeHistory) {
            if(result != null){
            resultsDB.addResult(result);}
        }

        // If result database isn't empty, proceed
        if (ResultsDB.getAllResults() != null) {

            // Create a table of results
            TableLayout resultsTable = (TableLayout) findViewById(R.id.testTable);
            resultsTable.setStretchAllColumns(true);
            resultsTable.bringToFront();

            // Go through all the results
            for (ResultModel result1 : ResultsDB.getAllResults()) {

                // If the username matches the username in results, add city and country to table
                if (user_name.equals(result1.getUserName())) {
                    TableRow tr = new TableRow(this);

                    TextView cityName = new TextView(this);
                    cityName.setText(String.valueOf(result1.getCityName()));
                    cityName.setTextSize(15);
                    cityName.setPadding(0, 0, 30, 0);

                    TextView countryName = new TextView(this);
                    countryName.setText(String.valueOf(result1.getCountryName()));
                    countryName.setTextSize(15);

                    // Create a delete button
                    Button deleteRow = new Button(this);
                    deleteRow.setText("Delete");
                    deleteRow.setId(result1.getId());

                    // Delete row when button is clicked
                    deleteRow.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            if (ResultsDB.deleteResult(deleteRow.getId())) {
                                SaveData saveData = new SaveData();
                                saveData.saveResultsToFile(ResultsDB.getInstance());

                                finish();
                                startActivity(getIntent());
                            }
                        }
                    });

                    tr.addView(cityName);
                    tr.addView(countryName);
                    tr.addView(deleteRow);

                    resultsTable.addView(tr);
                }
                else {
                    TextView noResults = new TextView(this);
                    noResults.setText("No results.");
                    noResults.setTextSize(25);
                }
            }
        }
    }


    // Log out button clicked
    public void logOutButtonClicked(View view) {
        Intent intent = new Intent(this, LogInPageActivity.class);
        String sharedSaveName = "saveUserName";
        SharedPreferences mPreferences = getSharedPreferences(sharedSaveName, MODE_PRIVATE);
        SharedPreferences.Editor preferencesEditor = mPreferences.edit();
        preferencesEditor.clear();
        preferencesEditor.apply();
        ResultModel result = new ResultModel();
        intent.putExtra("Result", result);
        startActivity(intent);
    }

    // Start over button clicked
    public void startOverButtonClicked(View view) {
        Intent intent = new Intent(this, MenuActivity.class);

        startActivity(intent);
    }

}
