package com.zwy.kutils.widget.loadingdialog.bean;

import android.support.annotation.DrawableRes;

public class BottomSheetBean {
    public @DrawableRes
    int icon;
    public String text;

    public BottomSheetBean(){

    }

    public BottomSheetBean(int icon, String text) {
        this.icon = icon;
        this.text = text;
    }
}
