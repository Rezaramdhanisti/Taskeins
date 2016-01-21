package com.rezarizki.rezarr;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class jawasatu extends AppCompatActivity{
@Override
protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_jawasatu);

    //set value from shared preferences

    //shared preferences can be access from different activity

    SharedPreferences set_shared_preference = getSharedPreferences("authentication", MODE_PRIVATE);

    SharedPreferences.Editor sp_editor = set_shared_preference.edit();

    sp_editor.putString("token_authentication", "fd@3jfD83#dfaksdfweqoru#LEWlkj");

    sp_editor.commit();
    Button page_two_obj = (Button)findViewById(R.id.btn_page_two);

    final EditText name_obj = (EditText)findViewById(R.id.txt_name);

    final EditText email_obj = (EditText)findViewById(R.id.txt_email);

    page_two_obj.setOnClickListener(new View.OnClickListener() {

        @Override

        public void onClick(View v) {

            Intent intent_obj = new Intent(jawasatu.this, Jawadua.class);

            intent_obj.putExtra(“nama”, name_obj.getText().toString());

            intent_obj.putExtra(“email”, email_obj.getText().toString());

            startActivity(intent_obj);

}
}
