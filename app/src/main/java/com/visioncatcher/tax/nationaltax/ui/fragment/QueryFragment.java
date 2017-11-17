package com.visioncatcher.tax.nationaltax.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.visioncatcher.tax.nationaltax.R;

/**
 * Created by sky-mxc
 */

public class QueryFragment extends Fragment  implements View.OnClickListener{

    private TextView view;
    ImageView q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15,q16,q17,q18;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_query,container,false);
        q1 = (ImageView)view.findViewById(R.id.q1);
        q2 = (ImageView)view.findViewById(R.id.q2);
        q3 = (ImageView)view.findViewById(R.id.q3);
        q4 = (ImageView)view.findViewById(R.id.q4);
        q5 = (ImageView)view.findViewById(R.id.q5);
        q6 = (ImageView)view.findViewById(R.id.q6);
        q7 = (ImageView)view.findViewById(R.id.q7);
        q8 = (ImageView)view.findViewById(R.id.q8);
        q9 = (ImageView)view.findViewById(R.id.q9);
        q10 = (ImageView)view.findViewById(R.id.q10);
        q11 = (ImageView)view.findViewById(R.id.q11);
        q12 = (ImageView)view.findViewById(R.id.q12);
        q13 = (ImageView)view.findViewById(R.id.q13);
        q14 = (ImageView)view.findViewById(R.id.q14);
        q15 = (ImageView)view.findViewById(R.id.q15);
        q16 = (ImageView)view.findViewById(R.id.q16);
        q17 = (ImageView)view.findViewById(R.id.q17);
        q18 = (ImageView)view.findViewById(R.id.q18);


        q1.setOnClickListener(this);
        q2.setOnClickListener(this);
        q3.setOnClickListener(this);
        q4.setOnClickListener(this);
        q5.setOnClickListener(this);
        q6.setOnClickListener(this);
        q7.setOnClickListener(this);
        q8.setOnClickListener(this);
        q9.setOnClickListener(this);
        q10.setOnClickListener(this);
        q11.setOnClickListener(this);
        q12.setOnClickListener(this);
        q13.setOnClickListener(this);
        q14.setOnClickListener(this);
        q15.setOnClickListener(this);
        q16.setOnClickListener(this);
        q17.setOnClickListener(this);
        q18.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
