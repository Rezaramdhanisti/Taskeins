package com.rezarizki.rezarr;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class JSON extends AppCompatActivity {
   TextView tv_name, tv_city, tv_province;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tv_name = (TextView) findViewById(R.id.tv_name_sembilan);
        tv_city = (TextView) findViewById(R.id.tv_city_sembilan);
        tv_province = (TextView) findViewById(R.id.tv_province_sembilan);
        JSONObject student_json = new JSONObject();

            try {
                student_json.put("name", "Rezarr");
                student_json.put("city", "Bandung");
                student_json.put("province", "West Java");
                student_json.put("address", "adress_json");
                tv_name.setText("Name : " + student_json.getString("name"));
                JSONObject jo_address =  student_json.getJSONObject("address");
                tv_city.setText("City : " + student_json.getString("city"));
                tv_province.setText("Province : " + student_json.getString("province"));


            } catch (JSONException e) {

                e.printStackTrace();


            }


    }
}