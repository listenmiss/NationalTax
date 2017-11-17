package com.visioncatcher.tax.nationaltax.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.visioncatcher.tax.nationaltax.R;
import com.visioncatcher.tax.nationaltax.utils.SysApplication;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    TextView registTxt;
    ImageView loginBtn;
    ImageView loginCloseBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SysApplication.getInstance().addActivity(this);

        registTxt = (TextView)findViewById(R.id.regist_txt);
        loginBtn = (ImageView)findViewById(R.id.login_btn);
        loginCloseBtn = (ImageView)findViewById(R.id.login_close_btn);

        registTxt.setOnClickListener(this);
        loginBtn.setOnClickListener(this);
        loginCloseBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.regist_txt:
                Intent intent = new Intent(getApplicationContext(),RegistActivity.class);
                startActivity(intent);
                break;
            case R.id.login_btn:
                Intent mainIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(mainIntent);
                break;
            case R.id.login_close_btn:
//                finish();
                SysApplication.getInstance().exit();
                break;
        }
    }
}
