package com.corp.ruiyken.peopol.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.corp.ruiyken.peopol.R;

public class PeopolActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState){
        //restoring app state
        super.onCreate(savedInstanceState);

        //set Activity View
        setContentView(R.layout.login);

    }
}
