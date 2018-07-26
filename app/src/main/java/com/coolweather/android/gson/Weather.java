package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {//总实例类

    public String status;//用来确认数据返回是否成功

    public Basic basic;
    public AQI aqi;
    public Now now;
    public  Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
