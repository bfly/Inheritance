package com.example.interfaces;

public interface I1 {
    void p();                           // abstract method
    default void d() {
        System.out.print("I1 ");
        System.out.println("d()");      // default method
    }
    static void s() {
        System.out.print("I1 ");
        System.out.println("s()");      // static method
    }
}
