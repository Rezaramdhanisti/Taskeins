package com.rezarizki.rezarr;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TextText extends AppCompatActivity {
    EditText txt_obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       txt_obj  = (EditText) findViewById(R.id.txt_one);
                Button btn_obj = (Button) findViewById(R.id.one_btn);
                        btn_obj.setOnClickListener(new View.OnClickListener(){
                            @Override
                        public void onClick(View v) {
                                Toast.makeText(TextText.this, txt_obj.getText(), Toast.LENGTH_SHORT).show();

                            }
                        });
    }
}
