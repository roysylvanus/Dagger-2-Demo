package com.roysylva.daggerdiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    SmartPhone smartPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.create();
      //  smartPhone = smartPhoneComponent.getSmartPhone();

        App.getApp().getSmartPhoneComponent().inject(this);

        smartPhone.makeACall();

    }
}