package com.rezarizki.rezarr;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class IntenWorkplowdua extends AppCompatActivity {
TextView name_obj, email_obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inten_workplowdua);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    name_obj = (TextView)findViewById(R.id.tv_name_val);
        email_obj = (TextView)findViewById(R.id.tv_Email_val);
        Intent intent_obj = getIntent();
        name_obj.setText("Name : " + intent_obj.getStringExtra("name"));
        email_obj.setText("email : "+ intent_obj.getStringExtra("email"));
    }

}
