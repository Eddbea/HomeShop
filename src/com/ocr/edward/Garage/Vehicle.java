package com.ocr.edward.Garage;

public class Vehicle {
    private String description;
    private String manufacturer;
    private int speed;
    private int year;
    private String modelname;
    private String color;
    private int[] dimensions = new int[3];
    private int weight;

    public Vehicle(String description, String manufacturer, int speed, int year, String modelname, String color, int[] dimensions, int weight) {
        this.description = description;
        this.manufacturer = manufacturer;
        this.speed = speed;
        this.year = year;
        this.modelname = modelname;
        this.color = color;
        this.dimensions = dimensions;
        this.weight = weight;
    }

    public void start(){
        System.out.println();
    }

    public void stop() {
        System.out.println();
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

    public String getModelname() {
        return modelname;
    }

    public String getColor() {
        return color;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }
}
