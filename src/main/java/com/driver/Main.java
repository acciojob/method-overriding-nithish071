package com.driver;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        // before overriden
//        System.out.println(b.meth());
        // after overriden
        System.out.println(b.meth());
    }
}