package com.example.judyhui.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.judyhui.myapplication.adapter.DriverAdapter;
import com.example.judyhui.myapplication.model.driver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Judyhui on 2017/12/13.
 */

public class driverErrorActivity extends AppCompatActivity {
    //此处的数据来自服务器
    /*private String[] data = {"司机张三","司机李四","司机王五","司机老赵","司机老王","司机老孙",
            "司机老李","司机张三","司机李四","司机王五","司机老赵","司机老王","司机老孙","司机老李",
            "司机张三","司机李四","司机王五","司机老赵","司机老王","司机老孙","司机老李",
            "司机张三","司机李四","司机王五","司机老赵","司机老王","司机老孙","司机老李"};*/

    private List<driver> driverList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.driver_error);
        initDrivers();
        DriverAdapter adapter = new DriverAdapter(driverErrorActivity.this,R.layout.driver_item,driverList);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent,View view,int position,long id){
                //String str = data[position];
                //Toast.makeText(driverErrorActivity.this, str,Toast.LENGTH_SHORT).show();

                //点击了一个item要发生页面跳转，新的页面显示该item的详细数据

                Intent intent = new Intent(driverErrorActivity.this,driverDetialActivity.class);
                intent.putExtra("driverData",driverList.get(position).getName());
                startActivity(intent);

            }
        });
    }

    private void initDrivers(){
        for(int i = 0;i<10;i++){
            driver driver1 = new driver("张三","疲劳驾驶，超速");
            driverList.add(driver1);
            driver driver2 = new driver("李氏","超速");
            driverList.add(driver2);
            driver driver3 = new driver("王五","急打弯，超速");
            driverList.add(driver3);
            driver driver4 = new driver("曹操","疲劳驾驶");
            driverList.add(driver4);
            driver driver5 = new driver("司马懿","疲劳驾驶，急加速");
            driverList.add(driver5);

        }
    }
}
