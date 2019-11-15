package com.example.dungngoc.appchat.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dungngoc.appchat.R;
import com.example.dungngoc.appchat.Users;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

import java.util.concurrent.Executor;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginRegisterFragment extends Fragment implements View.OnClickListener{

    private TextView tvLogin;
    private TextView tvRegister;
    private EditText edtUserName;
    private EditText edtEmail;
    private EditText edtPassWord;

    private Button btn_LoginRegister;
    private DatabaseReference mData;
    private Users users;
    private FirebaseAuth mAuth;

    public LoginRegisterFragment() {
        // Required empty public constructor
    }
    public static LoginRegisterFragment newInstance(){
        LoginRegisterFragment loginRegisterFragment = new LoginRegisterFragment();

        return loginRegisterFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login_register, container, false);

        tvLogin= (TextView) view.findViewById(R.id.tv_login);
        tvRegister = (TextView) view.findViewById(R.id.tv_register);
        edtUserName = (EditText) view.findViewById(R.id.edt_username);
        edtEmail = view.findViewById(R.id.edt_email);
        btn_LoginRegister = view.findViewById(R.id.bt_register);
        edtPassWord = view.findViewById(R.id.edt_password);


        tvLogin.setOnClickListener(this);
        tvRegister.setOnClickListener(this);
        btn_LoginRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dangki();
            }
        });
        mAuth = FirebaseAuth.getInstance();
       // String a = edtEmail.getText().toString();

        return view;

    }

    public void dangki(){
        String email, password;
        email = edtEmail.getText().toString();
        password = edtPassWord.getText().toString();

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener((Executor) this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            btn_LoginRegister.setText("Register");
                        } else {
                            btn_LoginRegister.setText("Register");
                        }

                        // ...
                    }
                });


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_login:
                tvLogin.setBackgroundResource(R.drawable.bg_loginregister_active);
                tvRegister.setBackgroundResource(R.drawable.bg_loginregister_inactive);
                edtEmail.setVisibility(View.GONE);
                btn_LoginRegister.setText("Login");
                break;

            case  R.id.tv_register:
                tvLogin.setBackgroundResource(R.drawable.bg_loginregister_inactive);
                tvRegister.setBackgroundResource(R.drawable.bg_loginregister_active);
                edtEmail.setVisibility(View.VISIBLE);
                btn_LoginRegister.setText("Register");
                break;
           // case  R.id.bt_register:
              //  dangki();

                //break;
        }

    }
}
