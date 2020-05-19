package com.patterns.java;

import com.patterns.abstractfactory.AbstractBikeFactory;
import com.patterns.abstractfactory.RoadBikeFactory;
import com.patterns.abstractfactory.BikeFrameInterface;
import com.patterns.abstractfactory.BikeSeatInterface;
import com.patterns.base.BikeInterface;
import com.patterns.base.NarrowWheel;
import com.patterns.base.Touring;
import com.patterns.builder.AbstractBikeBuilder;
import com.patterns.builder.AbstractBikeDirector;
import com.patterns.builder.RoadBikeBuilder;
import com.patterns.builder.RoadBikeDirector;
import com.patterns.singleton.SerialNumberGenerator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //exampleAbstractFactory();
        //exampleBuilder();
        exampleSingleton();
    }

    public static void exampleAbstractFactory() {
        AbstractBikeFactory factory = new RoadBikeFactory();
        BikeFrameInterface frame = factory.createFrame();
        BikeSeatInterface seat = factory.createSeat();
        System.out.println(frame.getFrameParts());
        System.out.println(seat.getSeatParts());
    }
    public static void exampleBuilder() {
        Touring myBike = new Touring(new NarrowWheel(22));
        AbstractBikeBuilder builder = new RoadBikeBuilder(myBike);
        RoadBikeDirector director = new RoadBikeDirector();
        BikeInterface iBike = director.build(builder);
        System.out.println(iBike);
    }

    public static  void exampleSingleton() {
        System.out.println("Generating Serial Numbers");
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
        for(int i = 0; i < 5; i++) {
            System.out.println("next serial " + generator.getNextSerial());
        }
        /*
        System.out.println("next serial " + generator.getNextSerial());
        System.out.println("next serial " + generator.getNextSerial());
        System.out.println("next serial " + generator.getNextSerial());
        System.out.println("next serial " + generator.getNextSerial());
         */
    }

}
