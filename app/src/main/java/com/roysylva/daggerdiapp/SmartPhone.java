package com.roysylva.daggerdiapp;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class SmartPhone {

    private Battery battery;
    private MemoryCard memoryCard;
    private SimCard simCard;
    private static final String TAG = "SmartPhone";
    private String time;

    @Inject
    public SmartPhone(Battery battery,MemoryCard memoryCard,SimCard simCard ){
        this.battery = battery;
        this.memoryCard = memoryCard;
        this.simCard = simCard;

        battery.showType();
        SimpleDateFormat df = new SimpleDateFormat("EEE, dd MMM yyyy, HH:mm:ss");
        time = df.format(Calendar.getInstance().getTime());

    }

    public void makeACall(){
        Log.i(TAG,"Making a call");
        Log.i(TAG, "tIME IS "+ time);
    }
}
