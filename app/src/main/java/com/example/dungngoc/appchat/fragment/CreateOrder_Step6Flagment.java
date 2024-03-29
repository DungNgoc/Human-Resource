package com.example.dungngoc.appchat.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dungngoc.appchat.OnSkipNextListener;
import com.example.dungngoc.appchat.R;

public class CreateOrder_Step6Flagment extends Fragment implements View.OnClickListener {

    private static OnSkipNextListener callback;
    private Button btNext;
    private Button btBack;


    public CreateOrder_Step6Flagment(){}
    public static CreateOrder_Step6Flagment newInstance(OnSkipNextListener mcallback){
        CreateOrder_Step6Flagment createOrder_step6Flagment = new CreateOrder_Step6Flagment();
        callback = mcallback;
        return createOrder_step6Flagment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create_order_step6, container, false);
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
                callback.onCreateOrder(14);
                break;
            case R.id.bt_back:
                callback.onCreateOrder(5);
                break;
        }
    }
}
