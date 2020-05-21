package com.patterns.base;

import com.patterns.visitor.Bearings;
import com.patterns.visitor.Spokes;
import com.patterns.visitor.WheelVisitorInterface;

/*
* Parent class for bicycle wheels
* */
public class AbstractWheel implements WheelInterface{

    private int size;
    boolean wide;

    //part of thevisitor pattern //below
    private Spokes spokes;
    private Bearings bearings;

    public AbstractWheel(int size, boolean wide) {
        this.size = size;
        this.wide = wide;

        //part of visitor pattern
        this.spokes = new Spokes();
        this.bearings = new Bearings();
    }

    @Override
        public int getSize() {
        return size;
    }
    @Override
    public boolean isWide() {
        return wide;
    }

    @Override
    public void acceptVisitor(WheelVisitorInterface visitor) {
        spokes.acceptVisitor(visitor);
        bearings.acceptVisitor(visitor);
        visitor.visit(this);
    }

    public String toString() {
        return getClass().getSimpleName() + " at " + size + " inches";
    }
}// end main class AbstractWheel
