package com.roysylva.daggerdiapp;

import javax.inject.Inject;

public class SimCard {

    private ServiceProvider serviceProvider;

    @Inject
    public SimCard(ServiceProvider serviceProvider){
        this.serviceProvider = serviceProvider;
    }
}
