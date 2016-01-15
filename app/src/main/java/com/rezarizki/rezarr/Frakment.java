package com.rezarizki.rezarr;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Frakment extends AppCompatActivity {
Button btn_frag_two;
    EditText name_obj,email_obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frakment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn_frag_two = (Button)findViewById(R.id.btn_frag_two);
        name_obj = (EditText)findViewById(R.id.txt_name);
        email_obj = (EditText)findViewById(R.id.txt_email);
        btn_frag_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == findViewById(R.id.btn_frag_two)) {
                    Fragment fragment = new DuaFrakment();
                    FragmentManager fm = getSupportFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    Bundle bundle = new Bundle();
                    bundle.putString("name", String.valueOf(name_obj.getText()));
                    bundle.putString("email", String.valueOf(email_obj.getText()));
                    fragment.setArguments(bundle);
                    ft.replace(R.id.fragment_place, fragment);
                    ft.commit();

                }
            }
        });
    }

}
