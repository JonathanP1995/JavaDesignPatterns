package com.patterns.visitor;

public class Bearings implements VisitableInterface {

    public void acceptVisitor(WheelVisitorInterface visitor) {
        visitor.visit(this);
    }
}
