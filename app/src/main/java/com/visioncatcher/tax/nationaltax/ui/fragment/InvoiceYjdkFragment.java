package com.visioncatcher.tax.nationaltax.ui.fragment;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;

import com.visioncatcher.tax.nationaltax.R;

import java.util.Calendar;

/**
 * Created by sky-mxc
 */

public class InvoiceYjdkFragment extends Fragment implements View.OnClickListener{
    ImageView search_btn,reset_btn;
    EditText tab2_start,tab2_end;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_invoice_yjdk,container,false);

        search_btn = (ImageView)view.findViewById(R.id.search_btn);
        reset_btn = (ImageView)view.findViewById(R.id.reset_btn);
        tab2_start = (EditText)view.findViewById(R.id.tab2_start);
        tab2_end = (EditText)view.findViewById(R.id.tab2_end);

        search_btn.setOnClickListener(this);
        reset_btn.setOnClickListener(this);


        tab2_start.setInputType(InputType.TYPE_NULL); //不显示系统输入键盘</span>
        tab2_start.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                // TODO Auto-generated method stub
                if(hasFocus){
                    showStartDatePickerDialog();
                }
            }
        });
        tab2_start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showStartDatePickerDialog();
            }
        });


        tab2_end.setInputType(InputType.TYPE_NULL); //不显示系统输入键盘</span>
        tab2_end.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                // TODO Auto-generated method stub
                if(hasFocus){
                    showEndDatePickerDialog();
                }
            }
        });
        tab2_end.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showEndDatePickerDialog();
            }
        });



        return view;
    }
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        int id  = v.getId();
        switch (id) {
            case R.id.search_btn:

                break;
            case R.id.reset_btn:

                break;
            default:
                break;
        }

    }


    /**
     * 展示日期选择对话框
     */
    private void showStartDatePickerDialog() {
        Calendar c = Calendar.getInstance();
        new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                // TODO Auto-generated method stub


                tab2_start.setText(year+"-"+(monthOfYear+1)+"-"+dayOfMonth);

            }
        }, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show();

    }

    private void showEndDatePickerDialog() {
        Calendar c = Calendar.getInstance();
        new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                // TODO Auto-generated method stub


                tab2_end.setText(year+"-"+(monthOfYear+1)+"-"+dayOfMonth);

            }
        }, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show();

    }
}
