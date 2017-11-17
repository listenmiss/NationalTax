package com.visioncatcher.tax.nationaltax.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.visioncatcher.tax.nationaltax.R;
import com.visioncatcher.tax.nationaltax.ui.activity.InvoiceActivity;
import com.visioncatcher.tax.nationaltax.ui.activity.InvoiceAskActivity;
import com.visioncatcher.tax.nationaltax.ui.activity.LoginActivity;
import com.visioncatcher.tax.nationaltax.ui.activity.TaxCalendarActivity;
import com.visioncatcher.tax.nationaltax.ui.activity.TaxSiteActivity;
import com.visioncatcher.tax.nationaltax.utils.GlideImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sky-mxc
 */

public class HomeFragment extends Fragment implements View.OnClickListener {

    ImageView wdfp,wdtc,wdsb,wdcx,home_fplysq,taxSite,tax_calendar,wzsy,dzfp,nsrfww,dkfpsq,fpcj,wfwzjycf,fppzbg,sdshdzssb,yjlsb,nsrxt,yyqh,ts,zxzx;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);

        List<Integer> images = new ArrayList<Integer>();
        images.add(R.drawable.banner_1);
        images.add(R.drawable.banner_2);
        images.add(R.drawable.banner_3);
        images.add(R.drawable.banner_4);
        images.add(R.drawable.banner_5);
        images.add(R.drawable.banner_6);
        images.add(R.drawable.banner_7);
        images.add(R.drawable.banner_8);

        Banner banner = (Banner) view.findViewById(R.id.banner);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(images);
        //banner设置方法全部调用完毕时最后调用
        banner.start();




        wdfp = (ImageView)view.findViewById(R.id.wdfp);
        wdtc= (ImageView)view.findViewById(R.id.wdtc);
        wdsb = (ImageView)view.findViewById(R.id.wdsb);
        wdcx = (ImageView)view.findViewById(R.id.wdcx);
        home_fplysq = (ImageView)view.findViewById(R.id.home_fplysq);
        taxSite = (ImageView)view.findViewById(R.id.taxSite);
        tax_calendar = (ImageView)view.findViewById(R.id.tax_calendar);
        wzsy  = (ImageView)view.findViewById(R.id.wzsy);
        dzfp = (ImageView)view.findViewById(R.id.dzfp);
        nsrfww = (ImageView)view.findViewById(R.id.nsrfww);
        dkfpsq = (ImageView)view.findViewById(R.id.dkfpsq);
        fpcj = (ImageView)view.findViewById(R.id.fpcj);
        wfwzjycf = (ImageView)view.findViewById(R.id.wfwzjycf);
        fppzbg = (ImageView)view.findViewById(R.id.fppzbg);
        sdshdzssb = (ImageView)view.findViewById(R.id.sdshdzssb);
        yjlsb = (ImageView)view.findViewById(R.id.yjlsb);
        nsrxt = (ImageView)view.findViewById(R.id.nsrxt);
        yyqh = (ImageView)view.findViewById(R.id.yyqh);
        ts = (ImageView)view.findViewById(R.id.ts);
        zxzx = (ImageView)view.findViewById(R.id.zxzx);



        wdfp.setOnClickListener(this);
        wdtc.setOnClickListener(this);
        wdsb.setOnClickListener(this);
        wdcx.setOnClickListener(this);
        home_fplysq.setOnClickListener(this);
        taxSite.setOnClickListener(this);
        tax_calendar.setOnClickListener(this);
        wzsy.setOnClickListener(this);
        dzfp.setOnClickListener(this);
        nsrfww.setOnClickListener(this);
        dkfpsq.setOnClickListener(this);
        fpcj.setOnClickListener(this);
        wfwzjycf.setOnClickListener(this);
        fppzbg.setOnClickListener(this);
        sdshdzssb.setOnClickListener(this);
        yjlsb.setOnClickListener(this);
        nsrxt.setOnClickListener(this);
        yyqh.setOnClickListener(this);
        ts.setOnClickListener(this);
        zxzx.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        int id  = v.getId();
        switch (id) {
            case R.id.wdfp:
                Intent wdfpIntent = new Intent(getActivity(),InvoiceActivity.class);
                startActivity(wdfpIntent);
                break;
            case R.id.home_fplysq:
                Intent fplysqIntent = new Intent(getActivity(),InvoiceAskActivity.class);
                startActivity(fplysqIntent);
                break;
            case R.id.taxSite:
                Intent taxSiteIntent = new Intent(getActivity(),TaxSiteActivity.class);
                startActivity(taxSiteIntent);
                break;
            case R.id.tax_calendar:
                Intent taxCalendarIntent = new Intent(getActivity(), TaxCalendarActivity.class);
                startActivity(taxCalendarIntent);
                break;


            default:
                break;
        }

    }

}
