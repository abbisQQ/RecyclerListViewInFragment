package com.abbisqq.recyclerlistviewinfragment.model;

import android.app.LauncherActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by babis on 7/11/2016.
 */

public class MyData {


    private static final String[] titles = {"hello i am title number 1","hello i am title number 2",
            "hello i am title number 3","hello i am title number 4","hello i am title number 5",
            "hello i am title number 6","hello i am title number 7","hello i am title number 8",
            "hello i am title number 9","hello i am title number 10","hello i am title number 11",
            "hello i am title number 12","hello i am title number 13","hello i am title number 14"};

    private static final int[] icons = {android.R.drawable.ic_input_delete,android.R.drawable.ic_menu_add,
            android.R.drawable.ic_popup_reminder,
            android.R.drawable.arrow_down_float,android.R.drawable.alert_dark_frame,
            android.R.drawable.arrow_up_float,android.R.drawable.bottom_bar,
            android.R.drawable.btn_default,android.R.drawable.btn_default_small,
            android.R.drawable.btn_dialog,android.R.drawable.ic_popup_reminder,
            android.R.drawable.btn_dropdown,android.R.drawable.btn_star_big_off,android.R.drawable.btn_minus};


    public static List<ListItem> getListData(){
        List<ListItem> data =  new ArrayList<>();



        for(int i=0;i<2;i++){
            for(int j=0;j<titles.length&&j<icons.length;j++) {
                ListItem item = new ListItem();
                item.setImageRes(icons[j]);
                item.setTitle(titles[j]);
                data.add(item);
            }
        }
        return data;
    }



    }



