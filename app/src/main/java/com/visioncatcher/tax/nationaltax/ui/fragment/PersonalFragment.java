package com.visioncatcher.tax.nationaltax.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

import com.visioncatcher.tax.nationaltax.R;
import com.visioncatcher.tax.nationaltax.ui.activity.LoginActivity;

/**
 * Created by sky-mxc
 */

public class PersonalFragment extends Fragment implements OnClickListener {

    ImageView exsitToLogin;
    RelativeLayout personal_xxzx_ly,personal_qyxx_ly,personal_yyqhxx_ly,person_gywm_ly,personal_yjjy_ly,personal_gdcp_ly,personal_ssdl_ly,personal_rlsbdl_ly;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_personal,container,false);

        exsitToLogin = (ImageView)view.findViewById(R.id.exsitToLogin);
        personal_xxzx_ly = (RelativeLayout)view.findViewById(R.id.personal_xxzx_ly);
        personal_qyxx_ly = (RelativeLayout)view.findViewById(R.id.personal_qyxx_ly);
        personal_yyqhxx_ly= (RelativeLayout)view.findViewById(R.id.personal_yyqhxx_ly);
        person_gywm_ly= (RelativeLayout)view.findViewById(R.id.person_gywm_ly);
        personal_yjjy_ly= (RelativeLayout)view.findViewById(R.id.personal_yjjy_ly);
        personal_gdcp_ly= (RelativeLayout)view.findViewById(R.id.personal_gdcp_ly);
        personal_ssdl_ly= (RelativeLayout)view.findViewById(R.id.personal_ssdl_ly);
        personal_rlsbdl_ly= (RelativeLayout)view.findViewById(R.id.personal_rlsbdl_ly);


        exsitToLogin.setOnClickListener(this);
        personal_xxzx_ly.setOnClickListener(this);
        personal_qyxx_ly.setOnClickListener(this);
        personal_yyqhxx_ly.setOnClickListener(this);
        person_gywm_ly.setOnClickListener(this);
        personal_yjjy_ly.setOnClickListener(this);
        personal_gdcp_ly.setOnClickListener(this);
        personal_ssdl_ly.setOnClickListener(this);
        personal_rlsbdl_ly.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        int id  = v.getId();
        switch (id) {
            case R.id.exsitToLogin:
                backToLogin();
                break;
            default:
                break;
        }

    }
public void backToLogin()
{
    Intent intent = new Intent(getActivity(),LoginActivity.class);
    startActivity(intent);
}


}
