package com.rezarizki.rezarr;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by wgs-lap148 on 1/18/16.
 */
public class InstanceFragmentPA extends FragmentPagerAdapter {


    public InstanceFragmentPA(android.support.v4.app.FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 :
                return FragmentViewPagerSatu.newInstance("Reza Rizki", "Rezaramdhanisti@gmail.com");
            case 1 :
                return FragmentViewPagerSatu.newInstance("Jon Deep", "jon.dip@gmail.com");
            default:
                break;
        }
        return null;
    }


    @Override
    public int getCount() {
        return 2;
    }
}
