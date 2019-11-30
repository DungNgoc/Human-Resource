package com.example.dungngoc.appchat.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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
    private EditText etLink;
    private TextView tvWWW;
    private ImageView imProduct;
    private ImageView imAmabuy;
    private ImageView imLazada;
    private ImageView imSendo;
    private ImageView imEbay;
    private ImageView imTiki;
    private TextView tvPrice;
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
        etLink = view.findViewById(R.id.et_link);
        tvWWW = view.findViewById(R.id.tv_www);
        tvPrice =view.findViewById(R.id.tv_product_price);
        imAmabuy = view.findViewById(R.id.im_amabuy);
        imEbay = view.findViewById(R.id.im_ebay);
        imLazada = view.findViewById(R.id.im_lazada);
        imTiki = view.findViewById(R.id.im_tiki);
        imSendo = view.findViewById(R.id.im_sendo);
        imProduct = view.findViewById(R.id.imv_image);

        btNext.setOnClickListener(this);
        btBack.setOnClickListener(this);
        btAdd.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        tvQuantity.setText(String.valueOf(quantity));
        imAmabuy.setOnClickListener(this);
        imEbay.setOnClickListener(this);
        imLazada.setOnClickListener(this);
        imTiki.setOnClickListener(this);
        imSendo.setOnClickListener(this);


        etLink.setText("https://www.amabuy.com/us/a...");
        imLazada.setImageDrawable( getResources().getDrawable(R.drawable.im_lazada));
        imProduct.setImageDrawable(getResources().getDrawable(R.drawable.im_iphone11_pro));
        tvPrice.setText("&400");
        imTiki.getDrawable().mutate().setAlpha(70);
        imLazada.getDrawable().mutate().setAlpha(70);
        imSendo.getDrawable().mutate().setAlpha(70);
        imEbay.getDrawable().mutate().setAlpha(70);
        tvWWW.setText("  www.amabuy.com");

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
            case R.id.im_amabuy:
                etLink.setText("https://www.amabuy.com/us/a...");
                imAmabuy.setImageDrawable( getResources().getDrawable(R.drawable.im_amabuy));
                imProduct.setImageDrawable(getResources().getDrawable(R.drawable.im_iphone11_pro));
                tvPrice.setText("&400");
                imTiki.getDrawable().mutate().setAlpha(70);
                imLazada.getDrawable().mutate().setAlpha(70);
                imSendo.getDrawable().mutate().setAlpha(70);
                imEbay.getDrawable().mutate().setAlpha(70);
                tvWWW.setText("  www.amabuy.com");
                break;
            case R.id.im_tiki:
                etLink.setText("https://www.tiki.vn/dien-thoai...");
                imTiki.setImageDrawable( getResources().getDrawable(R.drawable.im_tiki));
                imProduct.setImageDrawable(getResources().getDrawable(R.drawable.im_iphone11_tiki));
                tvPrice.setText("&410");
                imAmabuy.getDrawable().mutate().setAlpha(70);
                imLazada.getDrawable().mutate().setAlpha(70);
                imSendo.getDrawable().mutate().setAlpha(70);
                imEbay.getDrawable().mutate().setAlpha(70);
                tvWWW.setText("  www.tiki.vn");
                break;
            case R.id.im_lazada:
                etLink.setText("https://www.lazada.vn/products/iph..");
                imLazada.setImageDrawable( getResources().getDrawable(R.drawable.im_lazada));
                imProduct.setImageDrawable(getResources().getDrawable(R.drawable.im_iphone11_lazada));
                tvPrice.setText("&420");
                imAmabuy.getDrawable().mutate().setAlpha(70);
                imTiki.getDrawable().mutate().setAlpha(70);
                imSendo.getDrawable().mutate().setAlpha(70);
                imEbay.getDrawable().mutate().setAlpha(70);
                tvWWW.setText("  www.lazada.vn");
                break;
            case R.id.im_sendo:
                etLink.setText("https://www.sendo.vn/dien-thoai...");
                imSendo.setImageDrawable( getResources().getDrawable(R.drawable.im_sendo));
                imProduct.setImageDrawable(getResources().getDrawable(R.drawable.im_iphone11_sendo));
                tvPrice.setText("&430");
                imAmabuy.getDrawable().mutate().setAlpha(70);
                imLazada.getDrawable().mutate().setAlpha(70);
                imTiki.getDrawable().mutate().setAlpha(70);
                imEbay.getDrawable().mutate().setAlpha(70);
                tvWWW.setText("  www.sendo.vn");
                break;
            case R.id.im_ebay:
                etLink.setText("https://www.ebay.com/b/Apple-iPh...");
                imEbay.setImageDrawable( getResources().getDrawable(R.drawable.im_ebay));
                imProduct.setImageDrawable(getResources().getDrawable(R.drawable.im_iphone11_ebay));
                tvPrice.setText("&450");
                imAmabuy.getDrawable().mutate().setAlpha(70);
                imLazada.getDrawable().mutate().setAlpha(70);
                imSendo.getDrawable().mutate().setAlpha(70);
                imTiki.getDrawable().mutate().setAlpha(70);
                tvWWW.setText("  www.ebay.vn");
                break;
        }
    }
}
