package com.cn.psw.collapsingtoolbarlayout;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.cn.psw.collapsingtoolbarlayout.Base.BaseViewHolder;


/**
 * Created by Mr.peng on 2017/3/3.
 */

class NormalViewHoder extends BaseViewHolder {


    public final LinearLayout mRefresh;
    public final FrameLayout mFail;
    public final FrameLayout mFinish;

    public NormalViewHoder(Context ctx, View itemView) {
        super(ctx,itemView);
        mRefresh= (LinearLayout)itemView.findViewById(R.id.refresh);
        mFail= (FrameLayout)itemView.findViewById(R.id.fail);
        mFinish= (FrameLayout)itemView.findViewById(R.id.load_period_view);
    }
}
