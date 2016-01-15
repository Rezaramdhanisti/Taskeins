package com.rezarizki.rezarr;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ContohRadio extends AppCompatActivity {
    Button btn_obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_radio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn_obj = (Button)findViewById(R.id.one_btn);
        btn_obj.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                RadioGroup rb_group_obj = (RadioGroup)findViewById(R.id.RB_g);

                int selected_rb = rb_group_obj.getCheckedRadioButtonId();
            RadioButton rb_obj = (RadioButton)findViewById(selected_rb);
            Toast.makeText(ContohRadio.this, rb_obj.getText().toString(), Toast.LENGTH_SHORT).show();
        }
        });
    }

}
