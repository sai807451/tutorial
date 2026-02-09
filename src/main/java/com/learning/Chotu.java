package com.learning;

public class Chotu extends Dad {

    String name = "Sai";

    @Override
    public void stay() {
        System.out.println(name + " lives in St Louis" );
    }

    @Override
    public void drive() {
        System.out.println(name + " can drive auto and manual cars");
    }
}
