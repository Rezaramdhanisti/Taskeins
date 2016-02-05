package com.example.user.task2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.SyncStateContract.Helpers.insert;

public class MainActivity extends AppCompatActivity {
    public String str = "";
    Character op = 'q';
    float i, num, numtemp;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bclear,bdelete;
    EditText showResult,e1,e2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showResult = (EditText) findViewById(R.id.editText);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b1= (Button) findViewById(R.id.buttoneins);
        b2= (Button) findViewById(R.id.button2);
        b3= (Button) findViewById(R.id.button3);
        b4= (Button) findViewById(R.id.button4);
        b5= (Button) findViewById(R.id.button5);
        b6= (Button) findViewById(R.id.button6);
        b7= (Button) findViewById(R.id.button7);
        b8= (Button) findViewById(R.id.button8);
        b9= (Button) findViewById(R.id.button9);
        b0= (Button) findViewById(R.id.button11);
        bclear= (Button) findViewById(R.id.buttoneins);


    }

    public void btn1Clicked(View v) {
        insert(1);
    }


    public void btn2Clicked(View v) {
        insert(2);

    }

    public void btn3Clicked(View v) {
        insert(3);
    }

    public void btn4Clicked(View v) {
        insert(4);
    }

    public void btn5Clicked(View v) {
        insert(5);
    }

    public void btn6Clicked(View v) {
        insert(6);
    }

    public void btn7Clicked(View v) {
        insert(7);
    }

    public void btn8Clicked(View v) {
        insert(8);
    }

    public void btn9Clicked(View v) {
        insert(9);
    }

    private void insert(int j) {
        EditText et=(EditText)findViewById(R.id.editText);

        int startSelection=et.getSelectionStart();
        et.getText().insert(startSelection, String.valueOf(j));


    }




    }
