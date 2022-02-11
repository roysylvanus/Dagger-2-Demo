package com.roysylva.daggerdiapp;

import dagger.Module;
import dagger.Provides;

@Module
public class NCBatteryModule {

    @Provides
    Battery provideNCBatter(NickelCadmiumBattery nickelCadmiumBattery){

        nickelCadmiumBattery.showType();
        return nickelCadmiumBattery;
    }
}
