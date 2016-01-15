package com.rezarizki.rezarr;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntenWorkplow extends AppCompatActivity {
Button page_two_obj;
    EditText name_obj, email_obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inten_workplow);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        page_two_obj = (Button)findViewById(R.id.btn_page_two);
        name_obj = (EditText)findViewById(R.id.txt_name);
        email_obj = (EditText)findViewById(R.id.txt_email);
        page_two_obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_obj = new Intent(IntenWorkplow.this, IntenWorkplowdua.class);
                intent_obj.putExtra("name", name_obj.getText().toString());
                intent_obj.putExtra("email", email_obj.getText().toString());
                startActivity(intent_obj);

            }
        });
    }

}
