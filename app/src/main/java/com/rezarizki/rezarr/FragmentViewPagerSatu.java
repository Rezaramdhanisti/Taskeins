package com.rezarizki.rezarr;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentViewPagerSatu extends Fragment {

    public static FragmentViewPagerSatu newInstance(String name, String email) {

        FragmentViewPagerSatu fragment = new FragmentViewPagerSatu();

        Bundle bundle = new Bundle();

        bundle.putString("name", name);

        bundle.putString("email", email);

        fragment.setArguments(bundle);

        return fragment;
    }
        @Override
        public  View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_fragment_view_pager_satu, container, false);
            TextView tv_name = (TextView)view.findViewById(R.id.tv_name);
            TextView tv_email = (TextView)view.findViewById(R.id.tv_email);
            //this bundle will retrieve value bundle
            //from constructor bundle
            Bundle bundle = getArguments();
            tv_name.setText(bundle.getString("name"));
            tv_email.setText(bundle.getString("email"));
            return view;








    }

    }
