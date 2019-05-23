package com.ocr.edward.Garage;

public class Bike extends Vehicle {
    public Bike(String description, String manufacturer, int speed, int year, String modelname, String color, int[] dimensions, int weight) {
        super(description, manufacturer, speed, year, modelname, color, dimensions, weight);
    }

    public Bike() {
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
