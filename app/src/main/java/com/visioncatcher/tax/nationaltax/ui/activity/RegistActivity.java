package com.visioncatcher.tax.nationaltax.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.visioncatcher.tax.nationaltax.R;
import com.visioncatcher.tax.nationaltax.utils.SysApplication;

public class RegistActivity extends AppCompatActivity implements View.OnTouchListener {
    ImageView registCloseBtn;
    ImageView codeBtn;
    ImageView registBtn;

    EditText phone_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);

        SysApplication.getInstance().addActivity(this);

        registCloseBtn = (ImageView)findViewById(R.id.regist_close_btn);
        codeBtn = (ImageView)findViewById(R.id.code_btn);
        registBtn = (ImageView)findViewById(R.id.regist_btn);


        phone_edit= (EditText)findViewById(R.id.phone_edit);
        phone_edit.setOnTouchListener(this);

        registCloseBtn.setOnClickListener(new MyOnclickListener() );
        codeBtn.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {

                codeBtn.setImageResource(R.drawable.sended_code);
//                codeBtn.setBackgroundResource(R.drawable.sended_code);

            }

        });


        registBtn.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast = Toast.makeText(RegistActivity.this, "注册成功！", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();

            }

        });

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
//        Toast toast = Toast.makeText(RegistActivity.this, "ok！", Toast.LENGTH_LONG);
//        toast.setGravity(Gravity.CENTER, 0, 0);
//        toast.show();
        return false;
    }

    class MyOnclickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
            startActivity(intent);
//            finish();
        }
    }
}
