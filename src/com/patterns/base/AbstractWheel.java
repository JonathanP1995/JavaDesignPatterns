package com.patterns.base;
/*
* Parent class for bicycle wheels
* */
public class AbstractWheel implements WheelInterface{

    private int size;
    boolean wide;

    public AbstractWheel(int size, boolean wide) {
        this.size = size;
        this.wide = wide;
    }

    @Override
        public int getSize() {
        return size;
    }
    @Override
    public boolean isWide() {
        return wide;
    }

    public String toString() {
        return getClass().getSimpleName() + " at " + size + " inches";
    }
}// end main class AbstractWheel
