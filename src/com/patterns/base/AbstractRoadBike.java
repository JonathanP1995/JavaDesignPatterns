package com.patterns.base;

import com.patterns.java.BikeColor;

/*
* Parent Class for Road Bikes*/
public abstract class AbstractRoadBike extends AbstractBike {

    protected AbstractRoadBike(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    }

    protected AbstractRoadBike(WheelInterface wheel) {
        this(wheel, BikeColor.RED);
    }
}
