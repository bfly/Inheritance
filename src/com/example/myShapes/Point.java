package com.example.myShapes;

public record Point(int x, int y) {

    public double distance(Point p2) {
        int dx = this.x - p2.x();
        int dy = this.y - p2.y();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
