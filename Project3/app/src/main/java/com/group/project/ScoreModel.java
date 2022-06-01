package com.group.project;

import androidx.annotation.DrawableRes;

public class ScoreModel implements Comparable<ScoreModel>{

    // Variables
    private CityModel city;
    private int score;

    // Constructor
    public ScoreModel(CityModel city, int score) {
        this.city = city;
        this.score = score;
    }

    // Getters and setters
    public CityModel getCity() { return city; }

    public int getScore() { return score; }

    @Override
    public int compareTo(ScoreModel scoreModel) {
        return this.getScore() - scoreModel.getScore();
    }
}
