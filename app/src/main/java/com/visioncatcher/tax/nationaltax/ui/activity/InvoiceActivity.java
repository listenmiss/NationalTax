package com.visioncatcher.tax.nationaltax.ui.activity;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.visioncatcher.tax.nationaltax.R;
import com.visioncatcher.tax.nationaltax.ui.fragment.InvoiceFplyFragment;
import com.visioncatcher.tax.nationaltax.ui.fragment.InvoiceXcdkFragment;
import com.visioncatcher.tax.nationaltax.ui.fragment.InvoiceYjdkFragment;
import com.visioncatcher.tax.nationaltax.utils.SysApplication;

import java.util.List;

public class InvoiceActivity extends AppCompatActivity {
    private String tabTxt[] = { "发票领用", "邮寄代开", "现场代开" };
    ImageView invoid_back;
    private FragmentTabHost tabHost;
    private Class fragmentArray[] = {InvoiceFplyFragment.class,InvoiceYjdkFragment.class,InvoiceXcdkFragment.class};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);
        SysApplication.getInstance().addActivity(this);
        tabHost = (FragmentTabHost) findViewById(R.id.tab_host);

        invoid_back = (ImageView)findViewById(R.id.invoid_back);

        initTabHost();

        invoid_back.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
//                startActivity(intent);
                finish();
            }

        });


    }


    /**
     * 初始化 TabHost
     */
    private void initTabHost() {
        tabHost.setup(this,getSupportFragmentManager(), R.id.maincontent);
        for (int i = 0; i < tabTxt.length; i++) {
            TabHost.TabSpec spec=tabHost.newTabSpec(tabTxt[i]).setIndicator(getView(i));
            tabHost.addTab(spec, fragmentArray[i], null);
        }

    }


    private View getView(int i) {
        View view=View.inflate(InvoiceActivity.this, R.layout.tab_invoice, null);
        TextView textView=(TextView) view.findViewById(R.id.title);
        textView.setText(tabTxt[i]);
        return view;
    }


}
