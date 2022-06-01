package com.group.project;

import android.util.Log;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResultsDB implements Serializable {
    @SerializedName("results")
    private List<ResultModel> allResults = null;
    private static ResultsDB resultsDB = null;

    // Get all results from the database
    public static List<ResultModel> getAllResults() {
        return ResultsDB.getInstance().allResults;

    }

    // Get the result database instance
    public static ResultsDB getInstance() {
        if (resultsDB == null) {
            resultsDB = new ResultsDB();
        }
        return resultsDB;
    }

    // Set the database instance
    public static void setInstance(ResultsDB rs) {
        if (rs != null) {
            resultsDB = rs;
        }
    }

    // Delete result from the database using id
    public static Boolean deleteResult(int resultId) {

        for (ResultModel rs : ResultsDB.getAllResults()) {

            if (rs.getId() == resultId) {
                ResultsDB.getAllResults().remove(rs);
                return true;
            }
        }
        return false;
    }

    // Add result to the database
    public void addResult(ResultModel r) {
        if (allResults == null) {
            allResults = new ArrayList<ResultModel>();
        }
        allResults.add(r);
    }

    // Get the next ID for result table
    public static Integer getID() {
        if (ResultsDB.getInstance().allResults == null ||
                ResultsDB.getInstance().allResults.size() == 0) {
            return 1;
        } else {
            return ResultsDB.getInstance().allResults.
                    get(ResultsDB.getInstance().allResults.size() - 1).getId() + 1;
        }

    }

}
