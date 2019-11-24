package com.example.dungngoc.appchat.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dungngoc.appchat.R;

public class CreateOrder_Step5Flagment extends Fragment implements View.OnClickListener {
    public CreateOrder_Step5Flagment(){}
    public static CreateOrder_Step5Flagment newInstance(){
        CreateOrder_Step5Flagment createOrder_step5Flagment = new CreateOrder_Step5Flagment();

        return createOrder_step5Flagment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create_order_step5, container, false);
        return view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }
}
