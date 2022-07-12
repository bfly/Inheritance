package com.example.vehicles;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bill
 * Date: 6/25/21
 * Time: 12:35 PM
 */
public class Test {
    public static void main( String[] args ) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(4, 2015, Color.BLUE, Motor.GASOLINE, 5, "Edge", 4));
        vehicles.add(new Bicycle(2, 2020, Color.RED, Motor.UNPOWERED, 1));
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            System.out.println(vehicle.honkHorn());
        }
    }
}
