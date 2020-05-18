package com.patterns.base;

import com.patterns.java.BikeColor;

/*
* This class goes over the Vintage bike
* */
public class Vintage extends AbstractRoadBike {

    public Vintage(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    }

    public Vintage(WheelInterface wheel) {
        this(wheel, BikeColor.RED);
    }

    @Override
    public float getPrice() {
        return 700.00f;
    }
}
