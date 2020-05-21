package com.patterns.observer2;

public class BikeGearBox implements SpeedometerListener {

    @Override
    public void speedChange(SpeedometerEvent event) {
        if(event.getSpeed() <=5) {
            System.out.println("Now in Easy Gear");
        } else if(event.getSpeed() <= 10) {
            System.out.println("Now in Second Gear");
        } else if(event.getSpeed() <= 15) {
            System.out.println("Now in Third Gear");
        } else if(event.getSpeed() <= 20) {
            System.out.println("Now in Fourth Gear");
        } else if(event.getSpeed() <=30) {
            System.out.println("Now in Fifth Gear");
        }

    }
}
