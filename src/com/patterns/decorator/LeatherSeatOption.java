package com.patterns.decorator;

import com.patterns.base.BikeInterface;

public class LeatherSeatOption extends AbstractBikeOption {
    public LeatherSeatOption(BikeInterface bike) {
        super(bike);
    }

    @Override
    public float getPrice() {
        return decoratedBike.getPrice() + 40.00f;
    }
}
