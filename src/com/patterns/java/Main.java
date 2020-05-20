package com.patterns.java;

import com.patterns.abstractfactory.AbstractBikeFactory;
import com.patterns.abstractfactory.RoadBikeFactory;
import com.patterns.abstractfactory.BikeFrameInterface;
import com.patterns.abstractfactory.BikeSeatInterface;
import com.patterns.adapter.UltraWheel;
import com.patterns.adapter.UltraWheelAdapter;
import com.patterns.base.*;
import com.patterns.builder.AbstractBikeBuilder;
import com.patterns.builder.AbstractBikeDirector;
import com.patterns.builder.RoadBikeBuilder;
import com.patterns.builder.RoadBikeDirector;
import com.patterns.decorator.CustomGripsOption;
import com.patterns.decorator.GoldFrameOption;
import com.patterns.decorator.WhiteTireOption;
import com.patterns.facade.BikeFacade;
import com.patterns.singleton.SerialNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //exampleAbstractFactory();
        //exampleBuilder();
        //exampleSingleton();
        //exampleAdapter();
        //exampleDecorator();
        exampleFacade();
    }

    public static void exampleFacade() {
        BikeFacade facade = new BikeFacade();
        facade.prepareForSale(new DownHill(new WideWheel(24)));
    }

    public static void exampleDecorator() {
        BikeInterface myBike = new CrossCountry(new WideWheel(24));
        System.out.println(myBike);

        myBike = new GoldFrameOption(myBike);
        System.out.println(myBike);

        myBike = new CustomGripsOption(myBike);
        System.out.println(myBike);
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

    public static void exampleAdapter() {
        List<WheelInterface> wheels = new ArrayList<>();
        wheels.add(new NarrowWheel(22));
        wheels.add(new NarrowWheel(24));
        wheels.add(new WideWheel(24));
        wheels.add(new WideWheel(26));

        wheels.add(new UltraWheelAdapter(new UltraWheel(28)));
        wheels.add(new UltraWheelAdapter(new UltraWheel(32)));
        for(WheelInterface myWheel : wheels) {
            System.out.println(myWheel);
        }
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
