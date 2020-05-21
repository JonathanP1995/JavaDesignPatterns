package com.patterns.base;

import com.patterns.visitor.VisitableInterface;

/*
* This interface provides the methods
* for wheels
* */
public interface WheelInterface extends VisitableInterface {
    int getSize();
    boolean isWide();
}
