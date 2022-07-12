package com.example.interfaces;

public class C1 implements I1 {
    @Override
    public void p() {
        System.out.print("C1 ");
        System.out.println("c1.p()");   // inherited method
    }
}
