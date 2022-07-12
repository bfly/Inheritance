package com.example.myShapes;

public abstract class Shape {
    private Point p1;

    public Shape(Point p1) {
        this.p1 = p1;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "p1=" + p1 +
                '}';
    }
}
