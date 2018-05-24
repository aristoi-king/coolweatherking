package com.example.king.coolweatherking.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by King on 5/20/2018.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
