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

public class CreateOrder_Step1Flagment extends Fragment implements View.OnClickListener {
    private static OnSkipNextListener callback;
    private Button btNext;
    private Button btBack;
    private TextView btAdd;
    private TextView btMinus;
    private  TextView tvQuantity;
    int quantity;

    public CreateOrder_Step1Flagment(){}
    public static CreateOrder_Step1Flagment newInstance(OnSkipNextListener mcallback){
        CreateOrder_Step1Flagment createOrder_step0Flagment = new CreateOrder_Step1Flagment();
        callback = mcallback;
        return createOrder_step0Flagment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create_order_step1, container, false);


        quantity = 1;
        btNext = view.findViewById(R.id.bt_nextto);
        btBack = view.findViewById(R.id.bt_back);
        btAdd = view.findViewById(R.id.bt_add);
        btMinus = view.findViewById(R.id.bt_minus);
        tvQuantity = view.findViewById(R.id.tv_quantity_number);


        btNext.setOnClickListener(this);
        btBack.setOnClickListener(this);
        btAdd.setOnClickListener(this);
        btMinus.setOnClickListener(this);
       tvQuantity.setText(String.valueOf(quantity));


        return view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_nextto:
                callback.onCreateOrder(2);
                break;
            case R.id.bt_back:
                callback.onCreateOrder(0);
                break;
            case R.id.bt_add:
                quantity ++;
               // tvQuantity.setText(quantity);
               // tvQuantity.setText(tvQuantity.toString());
                tvQuantity.setText(String.valueOf(quantity));

                break;
            case R.id.bt_minus:
                if(quantity <= 0)
                    quantity =0;
                else quantity --;
                //tvQuantity.setText(tvQuantity.toString());
                tvQuantity.setText(String.valueOf(quantity));

                break;
        }
    }
}
