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

public class CreateOrder_Step8Flagment extends Fragment implements View.OnClickListener {
    private static OnSkipNextListener callback;

    private Button btBack;
    private Button btNext;
    private TextView tvContent;

    public CreateOrder_Step8Flagment(){}
    public static CreateOrder_Step8Flagment newInstance(OnSkipNextListener mcallback){
        CreateOrder_Step8Flagment addTrip_step5Flagment = new CreateOrder_Step8Flagment();
        callback = mcallback;
        return addTrip_step5Flagment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_trip_step5, container, false);
        btNext =view.findViewById(R.id.bt_nextto);
        btBack = view.findViewById(R.id.bt_back);
        tvContent = view.findViewById(R.id.some);
        tvContent.setText("- Create an order and bla bla bla\n\n- Make traveler taking your orderback");

        btNext.setOnClickListener(this);
        btBack.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_back:
                callback.onCreateOrder(6);
                break;
            case R.id.bt_nextto:
                callback.onCreateOrder(-1);
                break;
        }
    }
}
