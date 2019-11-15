package com.example.dungngoc.appchat;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dungngoc.appchat.fragment.MainFragment;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference mData;
    private Users users;
    private EditText editText;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        MainFragment mainFragment = MainFragment.newIntance();
        fragmentTransaction.replace(R.id.frame_container, mainFragment);
        fragmentTransaction.commit();
        users = new Users("ton","24032018","16521261@gm.uit.edu.vn");
        // Write a message to the database
        mData = FirebaseDatabase.getInstance().getReference();
        mData.child("Users").setValue(users);

        Map<String, Integer> mymap = new HashMap<String,Integer>();
        mymap.put("xemay",2);
        mData.child("phuongtien").setValue(mymap);

        //Thông báo neeuscos lỗi
       mData.child("Users").setValue("Phan Minh Toàn", new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(@Nullable DatabaseError databaseError, @NonNull DatabaseReference databaseReference) {
                if (databaseError != null) {
                    Toast.makeText(MainActivity.this, databaseError.toString(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Lưu thành công", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //editText = (EditText) findViewById(R.id.edt_test);


    }
    //private void writeNewUser(String userId, String name, String email)
}
