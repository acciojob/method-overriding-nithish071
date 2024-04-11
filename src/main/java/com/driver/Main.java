package com.driver;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        // before overriden
//        System.out.println(b.meth());
        // after overriden
        System.out.println(b.meth());
    }

    static class B extends A {
        @Override
        public String meth() {
            return "Method is overriden in Extended class B";
        }

    }

    static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }
}