package com.visioncatcher.tax.nationaltax.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.visioncatcher.tax.nationaltax.R;
import com.visioncatcher.tax.nationaltax.utils.SysApplication;

public class TaxSiteActivity extends AppCompatActivity {
    ImageView invoid_back;
    TextView pdqh_txt,bgxq_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax_site);
        SysApplication.getInstance().addActivity(this);
        invoid_back = (ImageView)findViewById(R.id.invoid_back);
        pdqh_txt= (TextView)findViewById(R.id.pdqh_txt);
        bgxq_txt= (TextView)findViewById(R.id.bgxq_txt);

        invoid_back.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
//                startActivity(intent);
                finish();
            }

        });
        pdqh_txt.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
//                startActivity(intent);
//                finish();
            }

        });
        bgxq_txt.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
//                startActivity(intent);
//                finish();
            }

        });
    }
}
