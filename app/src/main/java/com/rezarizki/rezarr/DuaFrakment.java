package com.rezarizki.rezarr;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DuaFrakment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DuaFrakment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DuaFrakment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dua_frakment, container, false);
        TextView name_obj = (TextView)view.findViewById(R.id.tv_name_val);
        TextView email_obj = (TextView)view.findViewById(R.id.tv_email_val);
        Bundle bundle = getArguments();
        if (bundle !=null) {
            if (bundle.containsKey("name")) {
                name_obj.setText("Name : " + bundle.getString("name"));
            }
                if (bundle.containsKey("email")) {
                    email_obj.setText("Email : " + bundle.getString("email"));
                }
        }
        return view;
    }

}
