package com.example.dungngoc.appchat.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dungngoc.appchat.OnSkipNextListener;
import com.example.dungngoc.appchat.R;

public class AddTrip_Step3Flagment extends Fragment implements View.OnClickListener {
    public AddTrip_Step3Flagment(){}
    private static OnSkipNextListener callback;
    private Button btNext;
    private Button btBack;
    public static AddTrip_Step3Flagment newInstance(OnSkipNextListener mcallback){
        AddTrip_Step3Flagment addTrip_step3Flagment = new AddTrip_Step3Flagment();
        callback = mcallback;
        return addTrip_step3Flagment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_trip_step3, container, false);
        btNext = view.findViewById(R.id.bt_nextto);
       // btBack = view.findViewById(R.id.bt_back);

        btNext.setOnClickListener(this);
      //  btBack.setOnClickListener(this);

        return view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_nextto:
                callback.onCreateOrder(11);
                break;
            /*case R.id.bt_back:
                callback.onCreateOrder(7);
                break;
*/
        }
    }
}
