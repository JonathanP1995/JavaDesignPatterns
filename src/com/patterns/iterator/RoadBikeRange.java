package com.patterns.iterator;

import com.patterns.base.BikeInterface;
import com.patterns.base.NarrowWheel;
import com.patterns.base.Touring;
import com.patterns.base.Vintage;

import java.util.ArrayList;
import java.util.Iterator;

public class RoadBikeRange implements Iterable<BikeInterface> {
    private ArrayList<BikeInterface> bikes;

    public RoadBikeRange() {
        bikes = new ArrayList<>();
        bikes.add(new Touring(new NarrowWheel(22)));
        bikes.add(new Touring(new NarrowWheel(24)));
        bikes.add(new Touring(new NarrowWheel(26)));
        bikes.add(new Vintage(new NarrowWheel(24)));
        bikes.add(new Touring(new NarrowWheel(26)));
        bikes.add(new Touring(new NarrowWheel(28)));
    }

    public ArrayList<BikeInterface> getRange() {
        return bikes;
    }

    @Override
    public Iterator<BikeInterface> iterator() {
        return bikes.listIterator();
    }
}
