package com.patterns.observer;

import java.util.Observer;
import java.util.Observable;

public class GearBox implements Observer {

    @Override
    public void update(Observable obs, Object arg) {
        Speedometer speedo = (Speedometer) obs;
        if(speedo.getCurrentSpeed() <=5) {
            System.out.println("Now in Easy Gear");
        } else if(speedo.getCurrentSpeed() <= 10) {
            System.out.println("Now in Second Gear");
        } else if(speedo.getCurrentSpeed() <= 15) {
            System.out.println("Now in Third Gear");
        } else if(speedo.getCurrentSpeed() <= 20) {
            System.out.println("Now in Fourth Gear");
        } else if(speedo.getCurrentSpeed() <=30) {
            System.out.println("Now in Fifth Gear");
        }

        }
    }
