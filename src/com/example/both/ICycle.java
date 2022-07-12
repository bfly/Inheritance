package com.example.both;

public interface ICycle {
        default void getName(String name) { // default method
                System.out.print(name + ": ");
        }
}
