package com.patterns.builder;

import com.patterns.base.BikeInterface;
import com.patterns.base.AbstractRoadBike;

public class RoadBikeBuilder extends AbstractBikeBuilder {

    private AbstractRoadBike bikeInProgress;

    public RoadBikeBuilder(AbstractRoadBike bike) {
        this.bikeInProgress = bike;
    }

    @Override
    public BikeInterface getBike() {
        return  bikeInProgress;
    }

    @Override
    public void buildHandleBars() {
        System.out.println("Building Handle Bars");
    }

    @Override
    public void buildStreetTires() {
        System.out.println("Building Street Tires");
    }
}
