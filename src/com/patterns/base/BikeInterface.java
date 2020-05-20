package com.patterns.base;

import com.patterns.java.BikeColor;

/*
* This Interface serves the entrire bicycle base
* structure
* */
public interface BikeInterface {
    WheelInterface getWheel();

    BikeColor getColor();

    float getPrice();

    void paint(BikeColor color);

    //below are for facade pattern
    void cleanFrame();
    void airTires();
    void testDrive();
}
