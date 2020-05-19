package com.patterns.builder;

import com.patterns.base.AbstractMountainBike;
import com.patterns.base.BikeInterface;

public class MountainBikeBuilder extends AbstractBikeBuilder {
    private AbstractMountainBike bikeInProgress;

    public MountainBikeBuilder(AbstractMountainBike bike) {
        this.bikeInProgress = bike;
    }

    @Override
    public BikeInterface getBike() {
        return bikeInProgress;
    }

    @Override
    public void buildHandleBars() {
        System.out.println("Building Handle Bars");
    }

    @Override
    public void buildWideTires() {
        System.out.println("Building Wide Tires");
    }
}
