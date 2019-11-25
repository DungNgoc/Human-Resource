package com.example.dungngoc.appchat.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.dungngoc.appchat.OnSkipNextListener;
import com.example.dungngoc.appchat.R;

public class AddTrip_Step5Flagment extends Fragment implements View.OnClickListener {

    private Button btBack;
    private Button btNext;
    private static OnSkipNextListener callback;

    public AddTrip_Step5Flagment(){}
    public static AddTrip_Step5Flagment newInstance(OnSkipNextListener mcallback){
        AddTrip_Step5Flagment addTrip_step5Flagment = new AddTrip_Step5Flagment();
        callback = mcallback;
        return addTrip_step5Flagment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_trip_step5, container, false);

        btNext =view.findViewById(R.id.bt_nextto);
        btBack = view.findViewById(R.id.bt_back);


        btNext.setOnClickListener(this);
        btBack.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_nextto:
                callback.onCreateOrder(-1);
                break;
            case R.id.bt_back:
                callback.onCreateOrder(11);
        }
    }
}
