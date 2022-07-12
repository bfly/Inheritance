package com.example.both;

public class Cycle extends ACycle implements ICycle {
    private final String name;

    public Cycle(String name) {
        this.name = name;
    }

    @Override
    public void honk() {
        System.out.println("Beep!");
    }
}
