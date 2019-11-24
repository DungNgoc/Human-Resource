package com.example.dungngoc.appchat.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dungngoc.appchat.R;

public class AddTrip_Step2Flagment extends Fragment implements View.OnClickListener {
    private TextView tv_ask;
    public AddTrip_Step2Flagment(){}
    public static AddTrip_Step2Flagment newInstance(){
        AddTrip_Step2Flagment addTrip_step2Flagment = new AddTrip_Step2Flagment();

        return addTrip_step2Flagment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_trip_step2, container, false);
        tv_ask = view.findViewById(R.id.tv_ask);
       /* String sourceString = "<b>" + R.id.tv_ask + "</b> " + tv_ask;
        tv_ask.setText(Html.fromHtml(sourceString));
*/
        return view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }
}
