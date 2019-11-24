package com.example.dungngoc.appchat.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.dungngoc.appchat.OnSkipNextListener;
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


    private ScrollView sv_travel;
    private ScrollView sv_order;

    private Button btCreateOrder;
    private static OnSkipNextListener callback;

    public HomeFlagment(){}


    public  static HomeFlagment newInstance(OnSkipNextListener mcallback){
        HomeFlagment homeFlagment = new HomeFlagment();
        callback = mcallback;
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

        btCreateOrder = view.findViewById(R.id.bt_create_order);

        sv_order=view.findViewById(R.id.sv_order);
        sv_travel=view.findViewById(R.id.sv_travel);

        tvOrder.setOnClickListener(this);
        tvTravel.setOnClickListener(this);
        btHome.setOnClickListener(this);
        btOrders.setOnClickListener(this);
        btTravels.setOnClickListener(this);
        btMess.setOnClickListener(this);
        btMore.setOnClickListener(this);

        btCreateOrder.setOnClickListener(this);

        sv_order.setVisibility(view.VISIBLE);
        sv_travel.setVisibility(view.GONE);

        return  view;

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_order:
                tvTravelBack.setBackgroundResource(R.drawable.bg_ordertravel);
                tvOrderBack.setBackgroundResource(R.drawable.bg_loginregister_active);
                sv_order.setVisibility(v.VISIBLE);
                sv_travel.setVisibility(v.GONE);
                break;
            case  R.id.tv_travel:
                tvTravelBack.setBackgroundResource(R.drawable.bg_loginregister_active);
                tvOrderBack.setBackgroundResource(R.drawable.bg_ordertravel);
                sv_travel.setVisibility(v.VISIBLE);
                sv_order.setVisibility(v.GONE);
                break;
            case R.id.bt_home:
                btTravels.setTextColor(getResources().getColor(R.color.colorBlack));
                btOrders.setTextColor(getResources().getColor(R.color.colorBlack));
                btMess.setTextColor(getResources().getColor(R.color.colorBlack));
                btMore.setTextColor(getResources().getColor(R.color.colorBlack));

                btHome.setCompoundDrawablesWithIntrinsicBounds(null,getResources().getDrawable(R.drawable.ic_home_active),null, null );
                btOrders.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_order_inactive), null, null);
                btTravels.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_travel_inactive), null, null);
                btMess.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_mess_inactive), null, null);
                btMore.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_more_inactive), null, null);
                break;
            case R.id.bt_orders:
                btOrders.setTextColor(getResources().getColor(R.color.blueTradeZ));
                btTravels.setTextColor(getResources().getColor(R.color.colorBlack));
                btHome.setTextColor(getResources().getColor(R.color.colorBlack));
                btMess.setTextColor(getResources().getColor(R.color.colorBlack));
                btMore.setTextColor(getResources().getColor(R.color.colorBlack));

                btHome.setCompoundDrawablesWithIntrinsicBounds(null,getResources().getDrawable(R.drawable.ic_home_inactive),null, null );
                btOrders.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_order_active), null, null);
                btTravels.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_travel_inactive), null, null);
                btMess.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_mess_inactive), null, null);
                btMore.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_more_inactive), null, null);
                break;
            case R.id.bt_travels:
                btTravels.setTextColor(getResources().getColor(R.color.blueTradeZ));
                btHome.setTextColor(getResources().getColor(R.color.colorBlack));
                btOrders.setTextColor(getResources().getColor(R.color.colorBlack));
                btMess.setTextColor(getResources().getColor(R.color.colorBlack));
                btMore.setTextColor(getResources().getColor(R.color.colorBlack));

                btHome.setCompoundDrawablesWithIntrinsicBounds(null,getResources().getDrawable(R.drawable.ic_home_inactive),null, null );
                btOrders.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_order_inactive), null, null);
                btTravels.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_travel_active), null, null);
                btMess.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_mess_inactive), null, null);
                btMore.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_more_inactive), null, null);
                break;
            case R.id.bt_mess:
                btMess.setTextColor(getResources().getColor(R.color.blueTradeZ));
                btTravels.setTextColor(getResources().getColor(R.color.colorBlack));
                btOrders.setTextColor(getResources().getColor(R.color.colorBlack));
                btHome.setTextColor(getResources().getColor(R.color.colorBlack));
                btMore.setTextColor(getResources().getColor(R.color.colorBlack));

                btHome.setCompoundDrawablesWithIntrinsicBounds(null,getResources().getDrawable(R.drawable.ic_home_inactive),null, null );
                btOrders.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_order_inactive), null, null);
                btTravels.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_travel_inactive), null, null);
                btMess.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_mess_active), null, null);
                btMore.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_more_inactive), null, null);
                break;
            case R.id.bt_more:
                btMore.setTextColor(getResources().getColor(R.color.blueTradeZ));
                btTravels.setTextColor(getResources().getColor(R.color.colorBlack));
                btOrders.setTextColor(getResources().getColor(R.color.colorBlack));
                btHome.setTextColor(getResources().getColor(R.color.colorBlack));
                btMess.setTextColor(getResources().getColor(R.color.colorBlack));

                btHome.setCompoundDrawablesWithIntrinsicBounds(null,getResources().getDrawable(R.drawable.ic_home_inactive),null, null );
                btOrders.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_order_inactive), null, null);
                btTravels.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_travel_inactive), null, null);
                btMess.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_mess_inactive), null, null);
                btMore.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ic_more_active), null, null);
                break;
            case R.id.bt_create_order:
                callback.onCreateOrder();
                //callback.onClickNext();
                break;
        }
    }
}
