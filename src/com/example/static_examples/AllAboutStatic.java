package com.example.static_examples;

import static java.lang.Math.sqrt;              // static import

public class AllAboutStatic {

    private static final int i;                 // static variable

    static {                                    // static code block
        i = 4;
        System.out.println("I am a static Block.");
    }

    public static void m1() {                   // static method
        System.out.println("I am a static method.");
    }

    public static void main(String[] args) {    // Static main method
        System.out.println("Using static import: " + sqrt(i));
        System.out.println("I am a main() method.");
        m1();
        Java8.m2();
    }

    static class MyStaticClass {                //static inner class
        public static void main(String[] args) {
            System.out.println("I am an inner static class.");
        }
    }

    interface Java8 {
        static void m2() {
            System.out.println("I am inside an interface.");
        }
    }
}
