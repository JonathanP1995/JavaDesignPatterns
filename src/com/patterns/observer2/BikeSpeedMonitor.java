package com.patterns.observer2;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import sun.text.SupplementaryCharacterData;

public class BikeSpeedMonitor implements SpeedometerListener {

    public static final int SPEED_TO_ALERT = 30;

    @Override
    public void speedChange(SpeedometerEvent event) {
        if(event.getSpeed() > SPEED_TO_ALERT) {
            System.out.println("*** ALERT***you are riding to fast(" +
                    event.getSpeed() + ")");
        } else {
            System.out.println("... Nice and Steady ... (" +
                    event.getSpeed() + ")");
        }
    }
}
