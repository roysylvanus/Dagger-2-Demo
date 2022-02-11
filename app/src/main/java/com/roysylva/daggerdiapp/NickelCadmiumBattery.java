package com.roysylva.daggerdiapp;

import android.util.Log;

import javax.inject.Inject;

import dagger.Provides;

public class NickelCadmiumBattery implements Battery{

    private static final String TAG = "SmartPhone";

    @Inject
    public NickelCadmiumBattery(){

    }

    @Override
    public void showType() {
        Log.e(TAG,"this is a Nickel Cadmium Battery...");
    }
}
