package com.patterns.base;

import com.patterns.java.BikeColor;

/*
* Parent Class for Mountain bikes*/
public abstract class AbstractMountainBike extends AbstractBike {

    protected AbstractMountainBike(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    }

    protected AbstractMountainBike(WheelInterface wheel) {
        this(wheel, BikeColor.CHROME);
    }
}
