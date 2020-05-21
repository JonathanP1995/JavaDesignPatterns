package com.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class SpeedMonitor implements Observer {
    public static int SPEED_TO_ALERT = 30;

    @Override
    public void update(Observable obs, Object arg) {
        Speedometer speedo = (Speedometer) obs;
        if(speedo.getCurrentSpeed() > SPEED_TO_ALERT) {
            System.out.println(" *** ALERT your riding to fast!! *** ");
        } else {
            System.out.println(" ... Nice and Steady ... ");
        }
    }
}
