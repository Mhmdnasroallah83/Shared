package com.example.shared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    UserSetting usersetting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usersetting=new UserSetting(this);

        usersetting.setSharedPrefUser("MohamdNasroallahi");
        usersetting.setSharedPrefEmail("mmd.nasroallahi.1383@gmail.com");




    }
}