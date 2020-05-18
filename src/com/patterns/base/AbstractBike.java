package com.patterns.base;
/*
* Base class for ACME bycicles
* */

import com.patterns.java.BikeColor;

public abstract class AbstractBike implements BikeInterface {

    private WheelInterface wheel;
    private BikeColor color;

    protected AbstractBike(WheelInterface wheel, BikeColor color) {
        this.wheel = wheel;
        this.color = color;
    }

    protected AbstractBike(WheelInterface wheel) {
        this(wheel, BikeColor.UNPAINTED);
    }

    @Override
    public WheelInterface getWheel() {
        return wheel;
    }

    @Override
    public BikeColor getColor() {
        return color;
    }

    @Override
    public float getPrice() {
        return 900.00f;
    }

    public void paint(BikeColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (" + wheel + "), " +
                color + ", price =$" + getPrice();

    }
}
