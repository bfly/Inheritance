package com.example.vehicles;

import java.awt.Color;
import java.util.Objects;

/**
 * @author Bill
 * Date: 6/25/21
 * Time: 12:16 PM
 */
public abstract class Vehicle {
    private final int wheels;
    private final int year;
    private final Color color;
    private final Motor motorType;
    private final int seats;

    /**
     */
    public Vehicle(int wheels, int year, Color color, Motor motorType, int seats) {
        this.wheels = wheels;
        this.year = year;
        this.color = color;
        this.motorType = motorType;
        this.seats = seats;
    }

    abstract String honkHorn();

    public int wheels() {
        return wheels;
    }

    public int year() {
        return year;
    }

    public Color color() {
        return color;
    }

    public Motor motorType() {
        return motorType;
    }

    public int seats() {
        return seats;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Vehicle) obj;
        return this.wheels == that.wheels &&
                this.year == that.year &&
                Objects.equals(this.color, that.color) &&
                Objects.equals(this.motorType, that.motorType) &&
                this.seats == that.seats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheels, year, color, motorType, seats);
    }

    @Override
    public String toString() {
        return "vehicles.Vehicle[" +
                "wheels=" + wheels + ", " +
                "year=" + year + ", " +
                "color=" + color + ", " +
                "motorType=" + motorType + ", " +
                "seats=" + seats + ']';
    }
}

