package com.example.interfaces;

public class C2 implements I1 {
    @Override
    public void p() {
        System.out.print("C2 ");
        System.out.println("c2.p()");   // inherited method
    }
}
