package com.example.judyhui.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Judyhui on 2017/12/14.
 */

public class driverDetialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.driver_detial);
        Intent intent = getIntent();
        TextView textView = (TextView)findViewById(R.id.driverDetial);
        textView.setText(intent.getStringExtra("driverData"));
    }
}
