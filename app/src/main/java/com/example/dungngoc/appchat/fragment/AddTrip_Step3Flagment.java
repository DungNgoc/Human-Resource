package com.example.dungngoc.appchat.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dungngoc.appchat.R;

public class AddTrip_Step0Flagment extends Fragment implements View.OnClickListener {
    public AddTrip_Step0Flagment(){}
    public static AddTrip_Step0Flagment newInstance(){
        AddTrip_Step0Flagment addTrip_step0Flagment = new AddTrip_Step0Flagment();

        return addTrip_step0Flagment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_trip_step0, container, false);
        return view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }
}
