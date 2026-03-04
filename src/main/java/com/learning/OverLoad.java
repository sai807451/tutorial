package com.learning;

public class OverLoad {
    //Create overloaded methods for:
    //
    //add(int, int)
    //
    //add(double, double)
    //
    //add(int, int, int)
    //
    //add(String, String) → should concatenate
    //
    //Test all.
    public String add(int a, int b) {
        System.out.println("sai");
        return "correct";
    }

    public int add(double a, double b) {
        System.out.println("s.a.i");
        return (int) (a+b);

    }

    public double add(int a, int b, int c) {

        return (double)(a-b);
    }

    public void add(String a, String b) {
        System.out.println("s.a.i");


    }
}
