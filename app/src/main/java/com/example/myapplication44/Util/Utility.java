package com.example.myapplication44.Util;

import android.text.TextUtils;

import com.example.myapplication44.db.City;
import com.example.myapplication44.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class Utility {
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allPronvinces = new JSONArray(response);
                for(int i=0;i<allPronvinces.length();i++){
                    JSONObject provinceObject = allPronvinces.getJSONObject(i);
                   Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));

                    province.save();
                }
            }catch (JSONException e){
                e.printStackTrace();

            }
            return true;
        }
        return false;
    }
    public static boolean handleCityResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allCities=new JSONArray(response);
                //遍历所有市
                for(int i=0;i<allCities.length();i++){
                    JSONObject cityObject=allCities.getJSONObject(i);
                    City city=new City();

                    city.setCityCode(cityObject.getInt("id"));
                    city.setCityName(cityObject.getString("name"));

                    city.save();
                }
            }catch (JSONException e){
                e.printStackTrace();
            }
            return true;
        }
        return false;
    }

}
