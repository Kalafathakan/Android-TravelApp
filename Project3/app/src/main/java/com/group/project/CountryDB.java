package com.group.project;

import java.io.Serializable;
import java.util.ArrayList;

public class CountryDB implements Serializable {

    private ArrayList<CountryModel> countryList = new ArrayList<>();

    // Create a database of countries and their climates
    public CountryDB() {
        AddCountry(new CountryModel("Dominican Republic", "Hot"));
        AddCountry(new CountryModel("Jamaica", "Hot"));
        AddCountry(new CountryModel("Cuba", "Hot"));
        AddCountry(new CountryModel("India", "Hot"));
        AddCountry(new CountryModel("Mexico", "Hot"));
        AddCountry(new CountryModel("Turkey", "Warm"));
        AddCountry(new CountryModel("France", "Warm"));
        AddCountry(new CountryModel("Italy", "Warm"));
        AddCountry(new CountryModel("Portugal", "Warm"));
        AddCountry(new CountryModel("England", "Warm"));
        AddCountry(new CountryModel("Canada", "Cold"));
        AddCountry(new CountryModel("Norway", "Cold"));
        AddCountry(new CountryModel("Iceland", "Cold"));
        AddCountry(new CountryModel("Switzerland", "Cold"));
        AddCountry(new CountryModel("China", "Cold"));
    }

    // Add a country to the database
    public boolean AddCountry(CountryModel country) {
        if (countryList.contains(country))
            return false;
        else {
            countryList.add(country);
            return true;
        }
    }

    // Retrieve all countries from the database
    public CountryModel[] GetAllCountries() {
        return countryList.toArray(new CountryModel[countryList.size()]);
    }

    // Remove a country from the database
    public boolean RemoveCountry(CountryModel country) {
        if (countryList.contains(country)) {
            countryList.remove(country);
            return true;
        } else
            return false;
    }

}
