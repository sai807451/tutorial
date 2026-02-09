package com.learning;

public class Bittu extends Dad{

    String name = "Charan";

    @Override
    public void stay() {
        System.out.println(name + " lives in Hyderabad" );
    }

    @Override
    public void drive() {
        System.out.println(name + " can drive auto cars");
    }
}
