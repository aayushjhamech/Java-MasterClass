package com.tcs;

public class Car {
    private int wheels;
    private int doors;
    private String model; //String is a class in itself
    private String location;

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
}
