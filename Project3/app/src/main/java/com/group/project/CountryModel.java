package com.group.project;

import java.io.Serializable;

public class CountryModel implements Serializable {

    // Initialize variables
    private String name;
    private String climate;

    // Constructor
    public CountryModel(String name, String climate) {
        this.name = name;
        this.climate = climate;
    }

    // Getters
    public String getCountry() {
        return name;
    }

    public String getClimate() {
        return climate;
    }
}
