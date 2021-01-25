package com.example.theweather.db;

import org.litepal.crud.DataSupport;

public class Country extends DataSupport {

    private int id;

    private String countryName;

    private String weatherId;

    private int cityId;

    private int getId(){
        return id;
    }

    private void setId(int id){
        this.id = id;
    }

    private String getCountryName(){
        return countryName;
    }

    public void setCountryName(String countryName){
        this.countryName = countryName;
    }

    public String getWeatherId(){
        return weatherId;
    }

    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }

    public int getCityId(){
        return cityId;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }

}
