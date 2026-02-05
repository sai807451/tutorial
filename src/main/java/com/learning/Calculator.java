package com.learning;

public class Calculator {

    int x;

    public Calculator(){
        System.out.println("I am in Default Constrctor");
    }

    public Calculator(int x) {
        this.x = x;
    }

    public double pi = 3.142;

    public int add(int x, int y) {
        return x +y;
    }

    public int minus(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        return x/y;
    }

    public int percent(int x, int y) {
        return x % y;
    }

    public double radius(double r) {
        return 2 * pi * r;
    }

    public void printXValue() {
        System.out.println("X value: " + x);
    }
}
