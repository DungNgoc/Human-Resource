package com.example.dungngoc.appchat.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dungngoc.appchat.OnSkipNextListener;
import com.example.dungngoc.appchat.R;

public class AddTrip_Step4Flagment extends Fragment implements View.OnClickListener {
    private static OnSkipNextListener callback;
    private Button btAccept;
    private Button btBack;

    public AddTrip_Step4Flagment(){}
    public static AddTrip_Step4Flagment newInstance(OnSkipNextListener mcallback){
        AddTrip_Step4Flagment addTrip_step4Flagment = new AddTrip_Step4Flagment();
        callback = mcallback;
        return addTrip_step4Flagment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_trip_step4, container, false);
        btAccept = view.findViewById(R.id.bt_accept);
        btBack = view.findViewById(R.id.bt_back);

        btAccept.setOnClickListener(this);
        btBack.setOnClickListener(this);

        return view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_accept:
                callback.onCreateOrder(12);
                break;
            case R.id.bt_back:
                callback.onCreateOrder(10);
                break;
        }
    }
}
