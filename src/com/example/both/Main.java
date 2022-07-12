package com.example.both;

public class Main {

    private void go() {
        Car car1 = new Car("car");
        car1.getName("car");
        car1.honk();

        Cycle cycle1 = new Cycle("cycle");
        cycle1.getName("cycle");
        cycle1.honk();
    }

    public static void main(String[] args) {
        new Main().go();
    }
}
