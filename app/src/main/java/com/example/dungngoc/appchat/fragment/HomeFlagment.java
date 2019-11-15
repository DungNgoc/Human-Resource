package com.example.dungngoc.appchat.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.dungngoc.appchat.R;

public class HomeFlagment extends Fragment implements View.OnClickListener {
    private TextView tvOrder;
    private TextView tvTravel;
    private TextView tvOrderBack;
    private TextView tvTravelBack;
    private Button btHome;
    private Button btOrders;
    private Button btTravels;
    private Button btMess;
    private Button btMore;
    public HomeFlagment(){}

    public  static HomeFlagment newInstance(){
        HomeFlagment homeFlagment = new HomeFlagment();
        return homeFlagment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        tvOrder = view.findViewById(R.id.tv_order);
        tvTravel = view.findViewById(R.id.tv_travel);
        tvOrderBack = view.findViewById(R.id.tv_order_back);
        tvTravelBack = view.findViewById(R.id.tv_travel_back);

        btHome = view.findViewById(R.id.bt_home);
        btOrders = view.findViewById(R.id.bt_orders);
        btTravels = view.findViewById(R.id.bt_travels);
        btMess = view.findViewById(R.id.bt_mess);
        btMore = view.findViewById(R.id.bt_more);


        tvOrder.setOnClickListener(this);
        tvTravel.setOnClickListener(this);
        btHome.setOnClickListener(this);
        btOrders.setOnClickListener(this);
        btTravels.setOnClickListener(this);
        btMess.setOnClickListener(this);
        btMore.setOnClickListener(this);

        return  view;

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_order:
                tvTravelBack.setBackgroundResource(R.drawable.bg_ordertravel);
                tvOrderBack.setBackgroundResource(R.drawable.bg_loginregister_active);
                break;
            case  R.id.tv_travel:
                tvTravelBack.setBackgroundResource(R.drawable.bg_loginregister_active);
                tvOrderBack.setBackgroundResource(R.drawable.bg_ordertravel);
                break;
            case R.id.bt_home:
                btTravels.setTextColor(getResources().getColor(R.color.colorBlack));
                btOrders.setTextColor(getResources().getColor(R.color.colorBlack));
                btMess.setTextColor(getResources().getColor(R.color.colorBlack));
                btMore.setTextColor(getResources().getColor(R.color.colorBlack));
                break;
            case R.id.bt_orders:
                btOrders.setTextColor(getResources().getColor(R.color.blueTradeZ));
                btTravels.setTextColor(getResources().getColor(R.color.colorBlack));
                btHome.setTextColor(getResources().getColor(R.color.colorBlack));
                btMess.setTextColor(getResources().getColor(R.color.colorBlack));
                btMore.setTextColor(getResources().getColor(R.color.colorBlack));
                break;
            case R.id.bt_travels:
                btTravels.setTextColor(getResources().getColor(R.color.blueTradeZ));
                btHome.setTextColor(getResources().getColor(R.color.colorBlack));
                btOrders.setTextColor(getResources().getColor(R.color.colorBlack));
                btMess.setTextColor(getResources().getColor(R.color.colorBlack));
                btMore.setTextColor(getResources().getColor(R.color.colorBlack));
                break;
            case R.id.bt_mess:
                btMess.setTextColor(getResources().getColor(R.color.blueTradeZ));
                btTravels.setTextColor(getResources().getColor(R.color.colorBlack));
                btOrders.setTextColor(getResources().getColor(R.color.colorBlack));
                btHome.setTextColor(getResources().getColor(R.color.colorBlack));
                btMore.setTextColor(getResources().getColor(R.color.colorBlack));
                break;
            case R.id.bt_more:
                btMore.setTextColor(getResources().getColor(R.color.blueTradeZ));
                btTravels.setTextColor(getResources().getColor(R.color.colorBlack));
                btOrders.setTextColor(getResources().getColor(R.color.colorBlack));
                btHome.setTextColor(getResources().getColor(R.color.colorBlack));
                btMess.setTextColor(getResources().getColor(R.color.colorBlack));
                break;

        }
    }
}
