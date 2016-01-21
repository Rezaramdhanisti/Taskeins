package com.rezarizki.rezarr;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Jawadua extends AppCompatActivity {
TextView tv_shared_preference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawadua);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tv_shared_preference = (TextView)findViewById(R.id.tv_shared_preference);
        SharedPreferences get_shared_preference = getSharedPreferences("authentication", MODE_PRIVATE);
        tv_shared_preference.setText(get_shared_preference.getString("token_authentication",""));

    }

}
