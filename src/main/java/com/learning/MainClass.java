package com.learning;

public class MainClass {

        static void main (String[] args){
            Engineering obj1=new ComputerScience();
            Engineering obj2=new Civil();

            Degree obj3=new Degree();
            obj3.learn(obj1);
            obj3.learn(obj2);
        }
}
