package com.roysylva.daggerdiapp;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class MemoryCardModule {
    private int memory_size;
    private static final String TAG = "SmartPhone";
    public MemoryCardModule(int memory_size) {
        this.memory_size = memory_size;
    }

    @Provides
     MemoryCard provideMemoryCard(){
        Log.d(TAG,"MEmory Size is " +memory_size);
        return  new MemoryCard();
    }
}
