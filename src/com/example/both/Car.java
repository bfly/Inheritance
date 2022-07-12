package com.example.both;

public class Car extends ACar implements ICar {
    private final String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void honk() {
        System.out.println("Honk!");
    }
}
