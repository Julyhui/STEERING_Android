package com.example.judyhui.myapplication.model;

/**
 * Created by Judyhui on 2017/12/13.
 */

public class driver {
    private String name;
    private String telNum;
    private String concurrentStatus;
    private int distance;

    public driver(String name,String concurrentStatus){
        this.name = name;
        this.concurrentStatus = concurrentStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getConcurrentStatus() {
        return concurrentStatus;
    }

    public void setConcurrentStatus(String concurrentStatusstatus) {
        this.concurrentStatus = concurrentStatusstatus;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
