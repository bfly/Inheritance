package com.example.static_examples;

public class StaticMain {
    private String string;
    public static void main(String[] args) {
        string = "ABC";
        print();
    }

    private void print() {
        System.out.println(string);
    }
}
