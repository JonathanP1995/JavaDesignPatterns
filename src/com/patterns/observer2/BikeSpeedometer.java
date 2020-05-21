package com.patterns.observer2;

import com.patterns.observer.Speedometer;

import java.util.ArrayList;
import java.util.List;

public class BikeSpeedometer {
    private int currentSpeed;
    private List<SpeedometerListener> listeners;

    public BikeSpeedometer() {
        currentSpeed = 0;
        listeners = new ArrayList<>();
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
        fireSpeedChanged();
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void addSpeedometerListener(SpeedometerListener obj) {
        listeners.add(obj);
    }

    public void removeSpeedometerListener(SpeedometerListener obj) {
        listeners.remove(obj);
    }

    private void fireSpeedChanged() {
        SpeedometerEvent speedEvent = new SpeedometerEvent(this, getCurrentSpeed());
        for(SpeedometerListener listen : listeners) {
            listen.speedChange(speedEvent);
        }
    }

}
