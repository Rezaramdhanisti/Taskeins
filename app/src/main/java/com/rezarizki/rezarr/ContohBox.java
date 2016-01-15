package com.rezarizki.rezarr;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ContohBox extends AppCompatActivity {
    Button btn_obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_box);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn_obj = (Button)findViewById(R.id.one_btn);
        btn_obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox Hiu = (CheckBox)findViewById(R.id.cb_Hiu);
                CheckBox Paus = (CheckBox)findViewById(R.id.cb_Paus);
                StringBuffer list_animal = new StringBuffer();
                list_animal.append("Hiu : ").append(Hiu.isChecked()).append("\n");
                list_animal.append("Paus : ").append(Paus.isChecked());
                Toast.makeText(ContohBox.this, list_animal.toString(), Toast.LENGTH_LONG).show();


            }
        });
    }
}
