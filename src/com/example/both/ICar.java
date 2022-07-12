package com.example.both;

public interface ICar {
    default void getName(String name) { // default method
        System.out.print(name + ": ");
    }

}
