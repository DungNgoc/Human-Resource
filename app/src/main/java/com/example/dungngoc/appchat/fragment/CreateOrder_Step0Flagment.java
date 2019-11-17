package com.example.dungngoc.appchat.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dungngoc.appchat.R;

public class CreateOrder_Step0Flagment extends Fragment implements View.OnClickListener {
    public CreateOrder_Step0Flagment(){}
    public static CreateOrder_Step0Flagment newInstance(){
        CreateOrder_Step0Flagment createOrder_step0Flagment = new CreateOrder_Step0Flagment();

        return createOrder_step0Flagment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create_order_step0, container, false);
        return view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }
}
