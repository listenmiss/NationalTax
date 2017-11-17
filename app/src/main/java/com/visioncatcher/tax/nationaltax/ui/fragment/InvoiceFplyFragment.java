package com.visioncatcher.tax.nationaltax.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.visioncatcher.tax.nationaltax.R;

/**
 * Created by sky-mxc
 */

public class InvoiceFplyFragment extends Fragment implements View.OnClickListener{
    ImageView search_btn;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_invoice_fply,container,false);

        search_btn = (ImageView)view.findViewById(R.id.search_btn);
        search_btn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        int id  = v.getId();
        switch (id) {
            case R.id.search_btn:

                break;

            default:
                break;
        }

    }

}
