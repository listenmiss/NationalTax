package com.visioncatcher.tax.nationaltax.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.visioncatcher.tax.nationaltax.R;

/**
 * Created by sky-mxc
 */

public class TaxFragment extends Fragment implements View.OnClickListener{
    LinearLayout ly_tax1,ly_tax2,ly_tax3,ly_tax4,ly_tax5,ly_tax6,ly_tax7,ly_tax8;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tax,container,false);

        ly_tax1 = (LinearLayout)view.findViewById(R.id.ly_tax1);
        ly_tax2 = (LinearLayout)view.findViewById(R.id.ly_tax2);
        ly_tax3 = (LinearLayout)view.findViewById(R.id.ly_tax3);
        ly_tax4 = (LinearLayout)view.findViewById(R.id.ly_tax4);
        ly_tax5 = (LinearLayout)view.findViewById(R.id.ly_tax5);
        ly_tax6 = (LinearLayout)view.findViewById(R.id.ly_tax6);
        ly_tax7 = (LinearLayout)view.findViewById(R.id.ly_tax7);
        ly_tax8 = (LinearLayout)view.findViewById(R.id.ly_tax8);

        ly_tax1.setOnClickListener(this);
        ly_tax2.setOnClickListener(this);
        ly_tax3.setOnClickListener(this);
        ly_tax4.setOnClickListener(this);
        ly_tax5.setOnClickListener(this);
        ly_tax6.setOnClickListener(this);
        ly_tax7.setOnClickListener(this);
        ly_tax8.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int id  = v.getId();
        switch (id) {
            case R.id.ly_tax1:

                break;
            case R.id.ly_tax2:

                break;

            case R.id.ly_tax3:

                break;
            default:
                break;
        }
    }
}
