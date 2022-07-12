package com.example.myShapes;

public class Square extends Shape {
    private final int side;

    public Square(Point p1, int side) {
        super(p1);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4.0 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString() +
                ", side=" + side +
                '}';
    }
}
