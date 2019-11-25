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

public class AddTrip_Step1Flagment extends Fragment implements View.OnClickListener {
    private TextView tvOrder;
    private TextView tvOffer;
    private TextView tvTodeliver;
    private TextView tvDelivered;
    private TextView tvOrderLine;
    private TextView tvOfferLine;
    private TextView tvTodeliverLine;
    private TextView tvDeliveredLine;


    private static OnSkipNextListener callback;
    private Button btNext;
    private Button btBack;
    public AddTrip_Step1Flagment(){}
    public static AddTrip_Step1Flagment newInstance(OnSkipNextListener mcallback){
        AddTrip_Step1Flagment addTrip_step1Flagment = new AddTrip_Step1Flagment();
        callback = mcallback;
        return addTrip_step1Flagment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_trip_step1, container, false);
        tvOrder = view.findViewById(R.id.tv_order);
        tvOffer = view.findViewById(R.id.tv_offer);
        tvTodeliver = view.findViewById(R.id.tv_todeliver);
        tvDelivered = view.findViewById(R.id.tv_deliverd);
        tvOrderLine = view.findViewById(R.id.tv_order_line);
        tvOfferLine = view.findViewById(R.id.tv_offer_line);
        tvTodeliverLine = view.findViewById(R.id.tv_todeliver_line);
        tvDeliveredLine = view.findViewById(R.id.tv_deliverd_line);

        btNext = view.findViewById(R.id.bt_nextto);
        btBack = view.findViewById(R.id.bt_back);

        btNext.setOnClickListener(this);
        btBack.setOnClickListener(this);


        tvOrder.setOnClickListener(this);
        tvOffer.setOnClickListener(this);
        tvTodeliver.setOnClickListener(this);
        tvDelivered.setOnClickListener(this);


        return view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_order:
                tvOrder.setTextColor(getResources().getColor((R.color.blueTradeZ)));
                tvOffer.setTextColor(getResources().getColor((R.color.colorBlack)));
                tvTodeliver.setTextColor(getResources().getColor((R.color.colorBlack)));
                tvDelivered.setTextColor(getResources().getColor((R.color.colorBlack)));
                tvOrderLine.setBackgroundColor(getResources().getColor((R.color.blueTradeZ)));
                tvOfferLine.setBackgroundColor(getResources().getColor((R.color.colorBlack)));
                tvTodeliverLine.setBackgroundColor(getResources().getColor((R.color.colorBlack)));
                tvDeliveredLine.setBackgroundColor(getResources().getColor((R.color.colorBlack)));
                break;
            case R.id.tv_offer:
                tvOrder.setTextColor(getResources().getColor((R.color.colorBlack)));
                tvOffer.setTextColor(getResources().getColor((R.color.blueTradeZ)));
                tvTodeliver.setTextColor(getResources().getColor((R.color.colorBlack)));
                tvDelivered.setTextColor(getResources().getColor((R.color.colorBlack)));
                tvOrderLine.setBackgroundColor(getResources().getColor((R.color.colorBlack)));
                tvOfferLine.setBackgroundColor(getResources().getColor((R.color.blueTradeZ)));
                tvTodeliverLine.setBackgroundColor(getResources().getColor((R.color.colorBlack)));
                tvDeliveredLine.setBackgroundColor(getResources().getColor((R.color.colorBlack)));
                break;
            case R.id.tv_todeliver:
                tvOrder.setTextColor(getResources().getColor((R.color.colorBlack)));
                tvOffer.setTextColor(getResources().getColor((R.color.colorBlack)));
                tvTodeliver.setTextColor(getResources().getColor((R.color.blueTradeZ)));
                tvDelivered.setTextColor(getResources().getColor((R.color.colorBlack)));
                tvOrderLine.setBackgroundColor(getResources().getColor((R.color.colorBlack)));
                tvOfferLine.setBackgroundColor(getResources().getColor((R.color.colorBlack)));
                tvTodeliverLine.setBackgroundColor(getResources().getColor((R.color.blueTradeZ)));
                tvDeliveredLine.setBackgroundColor(getResources().getColor((R.color.colorBlack)));
                break;
            case R.id.tv_deliverd:
                tvOrder.setTextColor(getResources().getColor((R.color.colorBlack)));
                tvOffer.setTextColor(getResources().getColor((R.color.colorBlack)));
                tvTodeliver.setTextColor(getResources().getColor((R.color.colorBlack)));
                tvDelivered.setTextColor(getResources().getColor((R.color.blueTradeZ)));
                tvOrderLine.setBackgroundColor(getResources().getColor((R.color.colorBlack)));
                tvOfferLine.setBackgroundColor(getResources().getColor((R.color.colorBlack)));
                tvTodeliverLine.setBackgroundColor(getResources().getColor((R.color.colorBlack)));
                tvDeliveredLine.setBackgroundColor(getResources().getColor((R.color.blueTradeZ)));
                break;
                case R.id.bt_nextto:
                    callback.onCreateOrder(9);
                    break;
                case R.id.bt_back:
                    callback.onCreateOrder(7);
                    break;

        }
    }
}
