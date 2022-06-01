package com.group.project;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ResultModel implements Serializable {
    @SerializedName("Id")
    private int id;
    @SerializedName("climate")
    private String climate;
    @SerializedName("phobia")
    private String phobia;
    @SerializedName("landscape")
    private String landscape;
    @SerializedName("budget")
    private String budget;
    @SerializedName("countryName")
    private String countryName;
    @SerializedName("cityName")
    private String cityName;
    @SerializedName("userName")
    private String userName;
    @SerializedName("description")
    private String description;
    @SerializedName("url")
    private String url;
    @SerializedName("image")
    private String image;
    @SerializedName("latitude")
    private String latitude;
    @SerializedName("longitude")
    private String longitude;

    // Constructor
    public ResultModel() {
        id = ResultsDB.getInstance().getID();
    }

    // Getters and setters
    public String getClimate() {
        return climate;
    }

    public String getPhobia() {
        return phobia;
    }

    public String getLandscape() {
        return landscape;
    }

    public String getBudget() {
        return budget;
    }

    public Integer getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getUserName() {
        return userName;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getImage() {
        return image;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void setCountryName(String name) {
        this.countryName = name;
    }

    public void setCityName(String name) {
        this.cityName = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public void setPhobia(String phobia) {
        this.phobia = phobia;
    }

    public void setLandscape(String landscape) {
        this.landscape = landscape;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }


}
