package com.patterns.builder;

import com.patterns.base.BikeInterface;

public class MountainBikeDirector extends AbstractBikeDirector {

    @Override
    public BikeInterface build(AbstractBikeBuilder builder) {
        builder.buildWideTires();
        builder.buildHandleBars();
        return builder.getBike();
    }
}
