package com.example.myfirstproject;

import android.util.Log;

public class Information {
    private String userName = "Default";
    private String streetName = "Default";
    private String birthDate = "Default";

    public void setUserName(String value) {
        //Log.d("myTag", "saveData has run");
        userName = value;
    }

    //s

    public String getUserName() {
        return userName;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
