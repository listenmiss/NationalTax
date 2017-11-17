package com.visioncatcher.tax.nationaltax.ui.fragment;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.visioncatcher.tax.nationaltax.R;

import java.util.Calendar;

/**
 * Created by sky-mxc
 */

public class InvoiceXcdkFragment extends Fragment implements View.OnClickListener {
    ImageView search_btn,reset_btn;
 EditText xcdk_start_tab3,xcdk_end_tab3;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_invoice_xcdk,container,false);

        search_btn = (ImageView)view.findViewById(R.id.search_btn);
        reset_btn = (ImageView)view.findViewById(R.id.reset_btn);
        xcdk_start_tab3 = (EditText)view.findViewById(R.id.xcdk_start_tab3);
        xcdk_end_tab3 = (EditText)view.findViewById(R.id.xcdk_end_tab3);


        search_btn.setOnClickListener(this);
        reset_btn.setOnClickListener(this);

        xcdk_start_tab3.setInputType(InputType.TYPE_NULL); //不显示系统输入键盘</span>
        xcdk_start_tab3.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                // TODO Auto-generated method stub
                if(hasFocus){
                    showStartDatePickerDialog();
                }
            }
        });
        xcdk_start_tab3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showStartDatePickerDialog();
            }
        });



        xcdk_end_tab3.setInputType(InputType.TYPE_NULL); //不显示系统输入键盘</span>
        xcdk_end_tab3.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                // TODO Auto-generated method stub
                if(hasFocus){
                    showEndDatePickerDialog();
                }
            }
        });
        xcdk_end_tab3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showEndDatePickerDialog();
            }
        });

        return view;
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


                xcdk_start_tab3.setText(year+"-"+(monthOfYear+1)+"-"+dayOfMonth);

            }
        }, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show();

    }

    private void showEndDatePickerDialog() {
        Calendar c = Calendar.getInstance();
        new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                // TODO Auto-generated method stub


                xcdk_end_tab3.setText(year+"-"+(monthOfYear+1)+"-"+dayOfMonth);

            }
        }, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show();

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

            case R.id.xcdk_start_tab3:

                break;



            default:
                break;
        }

    }


}
