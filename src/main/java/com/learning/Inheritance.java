package com.learning;

public class Inheritance {

    public static void main(String[] args) {

//        Dad dad = new Chotu();
//        dad.drive();


        Dad dad = new Dad();
        dad.eat();
        dad.stay();
        dad.drive();

        dad = new Chotu();
        dad.eat();
        dad.stay();
        dad.drive();

        dad = new Bittu();
        dad.eat();
        dad.stay();
        dad.drive();

        Laptop laptop = new Laptop();
        laptop.model = "Mac";
        laptop.price=2000;
        laptop.ramSize=64;
        laptop.isBlueTooth=true;

        displayLaptopConfig(laptop);

    }

    public static void displayLaptopConfig(Laptop laptop) {
        System.out.println("Laptop details: " + laptop);
    }

//    public static void displayLaptopConfig(int l) {
//        System.out.println("Laptop details: " + l);
//    }
}
