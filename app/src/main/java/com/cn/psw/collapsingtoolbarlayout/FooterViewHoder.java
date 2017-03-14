package com.cn.psw.collapsingtoolbarlayout;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.cn.psw.collapsingtoolbarlayout.Base.BaseViewHolder;


/**
 * Created by Mr.peng on 2017/3/3.
 */

public class FooterViewHoder extends BaseViewHolder {
    public final LinearLayout mLoading;
    public final FrameLayout mLoadFail;
    public final FrameLayout mLoadPeriod;
    public FooterViewHoder(Context ct, View itemView) {
        super(ct,itemView);
        mLoading= (LinearLayout)itemView.findViewById(R.id.loading_view);
        mLoadFail= (FrameLayout)itemView.findViewById(R.id.load_fail_view);
        mLoadPeriod= (FrameLayout)itemView.findViewById(R.id.load_period_view);
    }
}
