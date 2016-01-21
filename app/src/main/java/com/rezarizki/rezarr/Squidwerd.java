package com.rezarizki.rezarr;

import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Squidwerd extends AppCompatActivity implements  View.OnClickListener {
Pembantudatabase myDB;
    EditText name, surname, marks, id;
    Button save_btn, list_btn, update_btn, delete_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squidwerd);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    myDB = new Pembantudatabase(this);

        name = (EditText)findViewById(R.id.name_txt);
        surname = (EditText)findViewById(R.id.surname_txt);
        marks = (EditText)findViewById(R.id.marks_txt);
        id = (EditText)findViewById(R.id.id_txt);

        save_btn = (Button)findViewById(R.id.send_btn);
        list_btn = (Button)findViewById(R.id.students_btn);
        update_btn = (Button)findViewById(R.id.update_btn);
        delete_btn = (Button)findViewById(R.id.delete_btn);

        save_btn.setOnClickListener(this);
        list_btn.setOnClickListener(this);
        update_btn.setOnClickListener(this);
        delete_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.send_btn:
                boolean result = myDB.save_student(name.getText().toString(),
                        surname.getText().toString(),
                        marks.getText().toString());
        if (result)
            Toast.makeText(Squidwerd.this, "Success Add Student", Toast.LENGTH_LONG).show();
                else
            Toast.makeText(Squidwerd.this, "Fails Add Studeng", Toast.LENGTH_LONG).show();
                break;
            case R.id.students_btn:
                Cursor students = myDB.list_student();
                if (students.getCount() == 0) {
                alert_message("Message", "No data student found");
                    return;
            }
                StringBuffer buffer  = new StringBuffer();
                while (students.moveToNext()) {
                    buffer.append("Id : "+ students.getString(0) + "\n");
                            buffer.append("Name : " + students.getString(1) + "\n");
                     buffer.append("Surname : " +students.getString(2) + "\n" );
                    buffer.append("Marks : " + students.getString(3) + "\n");
                }
            alert_message("List Student", buffer.toString());
                break;
            case R.id.update_btn :
                boolean db_result = myDB.update_student(id.getText().toString(),
                        name.getText().toString(),
                        surname.getText().toString(),
                        marks.getText().toString());
                if (db_result)

                    Toast.makeText(Squidwerd.this, "Success update data Student", Toast.LENGTH_LONG).show();

                else

                    Toast.makeText(Squidwerd.this, "Fails update data Student", Toast.LENGTH_LONG).show();

                break;

            case R.id.delete_btn :
                Integer ds_result = myDB.delete_student(id.getText().toString());

                if (ds_result > 0)
                    Toast.makeText(Squidwerd.this, "success delete a student", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(Squidwerd.this, "Fails delete a student", Toast.LENGTH_LONG).show();
                break;
        }

    }

    public void alert_message(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
}
