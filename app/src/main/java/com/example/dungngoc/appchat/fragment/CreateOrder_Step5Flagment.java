package com.example.dungngoc.appchat.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dungngoc.appchat.OnSkipNextListener;
import com.example.dungngoc.appchat.R;

public class CreateOrder_Step5Flagment extends Fragment implements View.OnClickListener {

    private static OnSkipNextListener callback;
    private Button btAccept;
    private Button btBack;


    public CreateOrder_Step5Flagment(){}
    public static CreateOrder_Step5Flagment newInstance(OnSkipNextListener mcallback){
        CreateOrder_Step5Flagment createOrder_step5Flagment = new CreateOrder_Step5Flagment();
        callback = mcallback;
        return createOrder_step5Flagment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create_order_step5, container, false);
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
                callback.onCreateOrder(13);
                break;
            case R.id.bt_back:
                callback.onCreateOrder(4);
                break;
        }
    }
}
