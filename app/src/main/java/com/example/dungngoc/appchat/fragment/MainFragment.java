package com.example.dungngoc.appchat.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dungngoc.appchat.OnSkipNextListener;
import com.example.dungngoc.appchat.R;
import com.example.dungngoc.appchat.adapter.IntroAdapter;
import com.example.dungngoc.appchat.model.Course;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements OnSkipNextListener {

    private  ViewPager viewPager;
    private OnSkipNextListener callback;
    private int number;

    public MainFragment() {
        // Required empty public constructor
    }
    public static MainFragment newIntance(){
        MainFragment mainFragment = new MainFragment();
        return  mainFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_main, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        callback=this;


        IntroFlagment javafragment = IntroFlagment.newInstance(callback);
        IntroFlagment androidfragment =IntroFlagment.newInstance(callback);
        IntroFlagment iosfragment =  IntroFlagment.newInstance(callback);
        LoginRegisterFragment loginRegisterFragment=LoginRegisterFragment.newInstance();

        HomeFlagment homeFlagment = HomeFlagment.newInstance(callback);//callback);
        //HomeFlagment1 homeFlagment1 = HomeFlagment1.newInstance();
        CreateOrder_Step0Flagment createOrder_step0Flagment = CreateOrder_Step0Flagment.newInstance();
       // CreateOrder_Step1Flagment createOrder_step1Flagment = CreateOrder_Step1Flagment.newInstance();
        //CreateOrder_Step2Flagment createOrder_step2Flagment = CreateOrder_Step2Flagment.newInstance();
//        CreateOrder_Step3Flagment createOrderStep3Flagment = CreateOrder_Step3Flagment.newInstance();
        //CreateOrder_Step4Flagment createOrder_step4Flagment = CreateOrder_Step4Flagment.newInstance();
       // CreateOrder_Step5Flagment createOrder_step5Flagment = CreateOrder_Step5Flagment.newInstance();
        //CreateOrder_Step6Flagment createOrder_step6Flagment = CreateOrder_Step6Flagment.newInstance();
       // AddTrip_Step0Flagment addTrip_step0Flagment= AddTrip_Step0Flagment.newInstance();
        //AddTrip_Step1Flagment addTrip_step1Flagment=AddTrip_Step1Flagment.newInstance();
        //AddTrip_Step2Flagment addTrip_step2Flagment = AddTrip_Step2Flagment.newInstance();
       // AddTrip_Step3Flagment addTrip_step3Flagment =AddTrip_Step3Flagment.newInstance();
        //AddTrip_Step4Flagment addTrip_step4Flagment=AddTrip_Step4Flagment.newInstance();

        ArrayList<Fragment>arrayListFragment = new ArrayList<>();
        arrayListFragment.add(javafragment);
        arrayListFragment.add(androidfragment);
        arrayListFragment.add(iosfragment);



        arrayListFragment.add(homeFlagment);
        //arrayListFragment.add(loginRegisterFragment);
        arrayListFragment.add(createOrder_step0Flagment);

        //arrayListFragment.add(createOrder_step1Flagment);
        //arrayListFragment.add(createOrder_step2Flagment);
//       arrayListFragment.add(createOrderStep3Flagment);
        //arrayListFragment.add(createOrder_step4Flagment);
        //arrayListFragment.add(createOrder_step5Flagment);
        //arrayListFragment.add(createOrder_step6Flagment);
       // arrayListFragment.add(addTrip_step0Flagment);
        //arrayListFragment.add(addTrip_step1Flagment);
       // arrayListFragment.add(addTrip_step2Flagment);
      //  arrayListFragment.add(addTrip_step3Flagment);
       // arrayListFragment.add(addTrip_step4Flagment);

        ArrayList<Course>arrayListCourse = new ArrayList<>();
        Course javaCourse = new Course(getString(R.string.java_title), getString(R.string.java_decription), R.drawable.ic_2);
        Course androidCourse = new Course(getString(R.string.android_title).replace("java", "Android"), getString(R.string.android_decription).replace("java","Android"),R.drawable.ic_1);
        Course iosCourse = new Course(getString(R.string.ios_title).replace("java", "IOS"), getString(R.string.ios_decription).replace("java", "IOS"), R.drawable.ic_3);
        //Course bla = new Course(getString(R.string.ios_title).replace("java", "IOS"), getString(R.string.ios_decription).replace("java", "IOS"), R.drawable.ic_3);

        arrayListCourse.add(javaCourse);
        arrayListCourse.add(iosCourse);
        arrayListCourse.add(androidCourse);
        //arrayListCourse.add(bla);

        IntroAdapter adapter = new IntroAdapter(getFragmentManager(), arrayListFragment, arrayListCourse);
        viewPager.setAdapter(adapter);
        return view;
    }

    @Override
    public void onClickSkip() {
        viewPager.setCurrentItem(4, true);
    }
    @Override
    public void onCreateOrder() {
        viewPager.setCurrentItem(5, true);
    }
    @Override
    public void onClickNext(int currentPage) {
        viewPager.setCurrentItem(currentPage+1);

    }
}
