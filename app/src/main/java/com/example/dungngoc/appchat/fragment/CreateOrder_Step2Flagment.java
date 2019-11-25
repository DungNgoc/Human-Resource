package com.example.dungngoc.appchat.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dungngoc.appchat.OnSkipNextListener;
import com.example.dungngoc.appchat.R;

public class CreateOrder_Step2Flagment extends Fragment implements View.OnClickListener {

    private static OnSkipNextListener callback;
    private Button btNext;
    private Button btBack;


    public CreateOrder_Step2Flagment(){}
    public static CreateOrder_Step2Flagment newInstance(OnSkipNextListener mcallback){
        CreateOrder_Step2Flagment createOrder_step0Flagment = new CreateOrder_Step2Flagment();
        callback = mcallback;
        return createOrder_step0Flagment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create_order_step2, container, false);
        btNext = view.findViewById(R.id.bt_nextto);
        btBack = view.findViewById(R.id.bt_back);



        btNext.setOnClickListener(this);
        btBack.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_nextto:
                callback.onCreateOrder(3);
                break;
            case R.id.bt_back:
                callback.onCreateOrder(1);
                break;
        }
    }
}
