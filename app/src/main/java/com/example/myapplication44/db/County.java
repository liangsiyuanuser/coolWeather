package com.example.myapplication44.db;

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {
    private int id;
//    private  int CountyCode;
    private String CountyName;
    private String weather_id;
    private int cityCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public int getCountyCode() {
//        return CountyCode;
//    }
//
//    public void setCountyCode(int countyCode) {
//        CountyCode = countyCode;
//    }

    public String getCountyName() {
        return CountyName;
    }

    public void setCountyName(String countyName) {
        CountyName = countyName;
    }

    public String getWeather_id() {
        return weather_id;
    }

    public void setWeather_id(String weather_id) {
        this.weather_id = weather_id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
