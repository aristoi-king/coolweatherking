package com.example.king.coolweatherking.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by King on 5/21/2018.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
