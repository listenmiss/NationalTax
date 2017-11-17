package com.visioncatcher.tax.nationaltax.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.visioncatcher.tax.nationaltax.R;
import com.visioncatcher.tax.nationaltax.utils.SysApplication;

public class TaxCalendarActivity extends AppCompatActivity {
    ImageView invoid_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax_calendar);
        SysApplication.getInstance().addActivity(this);
        invoid_back = (ImageView)findViewById(R.id.invoid_back);


        invoid_back.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });

    }
}
