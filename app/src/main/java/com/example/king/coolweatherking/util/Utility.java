package com.example.king.coolweatherking.util;

import android.text.TextUtils;

import com.example.king.coolweatherking.db.City;
import com.example.king.coolweatherking.db.Country;
import com.example.king.coolweatherking.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by King on 5/18/2018.
 */

public class Utility {
    /*
    * Province
    * */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save(); //function of SubClass DataSupport
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    /*
    * City
    * */
    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i = 0; i < allCities.length(); i++) {
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save(); //function of SubClass DataSupport
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /*
    * Country
    * */
    public static boolean handleCountryResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allCountries = new JSONArray(response);
                for (int i = 0; i < allCountries.length(); i++) {
                    JSONObject countryObject = allCountries.getJSONObject(i);
                    Country country = new Country();
                    country.setCountryName(countryObject.getString("name"));
                    country.setWeatherId(countryObject.getString("weather_id"));
                    country.setCityId(cityId);
                    country.save(); //function of SubClass DataSupport
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }


}
