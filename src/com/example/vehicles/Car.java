package com.example.vehicles;

import java.awt.*;

/**
 * @author Bill
 * Date: 6/25/21
 * Time: 12:37 PM
 */
public class Car extends Vehicle {
    private String model;
    private int doors;

    public Car( int wheels, int year, Color color, Motor motorType, int seats, String model, int doors ) {
        super(wheels, year, color, motorType, seats);
        this.model = model;
        this.doors = doors;
    }

    public String getModel() {
        return model;
    }

    public void setModel( String model ) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors( int doors ) {
        this.doors = doors;
    }

    @Override
    String honkHorn() {
        return "Car: Honk!";
    }

    @Override
    public String toString() {
        return "vehicles.Car{" +
            "model='" + model + '\'' +
            ", doors=" + doors +
            "} " + super.toString();
    }
}
