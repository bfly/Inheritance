package com.example.vehicles;

import java.awt.*;

/**
 * @author Bill
 * Date: 6/25/21
 * Time: 12:51 PM
 */
public class Bicycle extends Vehicle {
    public Bicycle( int wheels, int year, Color color, Motor motorType, int seats ) {
        super(wheels, year, color, motorType, seats);
    }

    @Override
    String honkHorn() {
        return "Bike: beep.";
    }

    @Override
    public String toString() {
        return "vehicles.Bicycle{} " + super.toString();
    }
}
