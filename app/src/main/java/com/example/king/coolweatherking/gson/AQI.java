package com.example.king.coolweatherking.gson;

/**
 * Created by King on 5/21/2018.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
