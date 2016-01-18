package com.rezarizki.rezarr;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ActivityViewPager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.content_activity_view_pager);
        ViewPager view_pager = (ViewPager)findViewById(R.id.view_pager_container);
        view_pager.setAdapter(new InstanceFragmentPA(getSupportFragmentManager()));
    }

}
