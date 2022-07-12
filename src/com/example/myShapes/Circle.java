package com.example.myShapes;

public class Circle extends Shape {
    private final int radius;

    public Circle(Point p1, int radius) {
        super(p1);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return Math.PI * 2.0 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() +
                ", radius=" + radius +
                '}';
    }
}
