package com.example.interfaces;

public class Main2 {
    public static void main(String[] args) {
        C1 c1 = new C1();   // child class 1
        c1.p();             // inherited method
        c1.d();             // inherited default method
        I1.s();             // inherited static member (not referenced by interface

        C2 c2 = new C2();   // child class 2
        c1.p();             // inherited method
        c2.d();             // inherited default method
        I1.s();             // inherited static member (not referenced by interface
    }
}
