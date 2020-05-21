package com.patterns.observer2;

import java.util.EventObject;

public class SpeedometerEvent extends EventObject {

    private int speed;

    public SpeedometerEvent(Object source, int speed){
        super(speed);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

}
