package com.visioncatcher.tax.nationaltax.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.visioncatcher.tax.nationaltax.R;
import com.visioncatcher.tax.nationaltax.utils.SysApplication;

public class InvoiceAskActivity extends AppCompatActivity {
    ImageView invoid_back,submit_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice_ask);
        SysApplication.getInstance().addActivity(this);
        invoid_back = (ImageView)findViewById(R.id.invoid_back);
        submit_btn= (ImageView)findViewById(R.id.submit_btn);

        invoid_back.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
//                startActivity(intent);
                finish();
            }

        });
        submit_btn.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(InvoiceAskActivity.this, "已提交申请！", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }

        });

    }
}
