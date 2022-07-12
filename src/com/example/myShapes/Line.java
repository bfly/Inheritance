package com.example.myShapes;

public class Line extends Shape {
    private final Point p2;

    public Line(Point p1, Point p2) {
        super(p1);
        this.p2 = p2;
    }

    public Point getP2() {
        return p2;
    }

    @Override
    public double area() {
        return 0.0;
    }

    @Override
    public double perimeter() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Line{" +
                super.toString() +
                ", p2=" + p2 +
                '}';
    }

}
