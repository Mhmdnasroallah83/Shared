package com.example.shared;

import android.content.Context;
import android.content.SharedPreferences;

public class UserSetting {

    private SharedPreferences sharedPref;

    public UserSetting(Context context){
        sharedPref= context.getSharedPreferences("app_setting",Context.MODE_PRIVATE);
    }

    public void setSharedPrefUser(String user){
        SharedPreferences.Editor editor= sharedPref.edit();
        editor.putString("key_user",user);
        editor.apply();
    }
    public void setSharedPrefEmail(String email){
        SharedPreferences.Editor editor= sharedPref.edit();
        editor.putString("key_email",email);
        editor.apply();
    }

    public String getSharedPrefUser(){
        return sharedPref.getString("key_user","defValue");

    }
    public String getSharedPrefEmail(){
        return sharedPref.getString("key_email","defValue");

    }




}