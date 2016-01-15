package com.rezarizki.rezarr;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImegPiew extends AppCompatActivity {
Button btn_back,btn_next;
    int[] images = {R.drawable.ic_action_name2, R.drawable.ic_action_name};
    int current_image = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imeg_piew);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btn_back = (Button)findViewById(R.id.btn_back);
        Button btn_next = (Button)findViewById(R.id.btn_next);
        final ImageView image_view_obj = (ImageView)findViewById(R.id.image_view);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_image == 0) {
                    current_image = images.length;
                } else  {
                    current_image--;

                }
                current_image = current_image % images.length;
                image_view_obj.setImageResource(images[current_image]);
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView andros_iv = (ImageView)findViewById(R.id.image_view);
                current_image++;
                current_image = current_image % images.length;
                image_view_obj.setImageResource(images[current_image]);
            }
        });
    }

}
