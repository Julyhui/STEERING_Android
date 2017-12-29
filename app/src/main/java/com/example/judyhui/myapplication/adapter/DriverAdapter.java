package com.example.judyhui.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.judyhui.myapplication.R;
import com.example.judyhui.myapplication.model.driver;

import java.util.List;

/**
 * Created by Judyhui on 2017/12/28.
 */

public class DriverAdapter extends ArrayAdapter<driver> {
     private int resourceId;

     public DriverAdapter(Context context, int textViewResourceId, List<driver> objects){
         super(context,textViewResourceId,objects);
         resourceId = textViewResourceId;
     }

     @Override
    public View getView(int position, View convertView, ViewGroup parent){
         driver driverimp = getItem(position);
         View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
         TextView driverName = (TextView)view.findViewById(R.id.driver_name);
         TextView driverCurStatus = (TextView)view.findViewById(R.id.driver_curStatus);
         driverName.setText(driverimp.getName());
         driverCurStatus.setText(driverimp.getConcurrentStatus());
         return view;
     }
}
