package com.learning;

public class Literals {

    public static void main(String args[]) {
        //Literals
        int var3 = 100;
        System.out.println(++var3);
        System.out.println(var3);
        int var4 = 100;
        System.out.println(var4++);
        System.out.println(var4);

        int num1 = 585;
        int num2 = 0x7E;
        double num3 = 100;
        double num4 = 12e10;
        boolean num5 = true;
        char c = 'a';
        c++;
        byte b = 120;
        int a = 258;
        byte k = (byte) a;

        int equ = equal(b, a);

        float f = 6.6f;
        int t = (int) f;

        //type promotions
        byte h = 50;
        byte i = 45;
        int result3 = (int) h * i;


        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(equ);
        System.out.println(k);
        System.out.println(t);
        System.out.println(result3);

        //non-static or obkject level variable or methods usage
        Variables variables = new Variables();
        variables.name="sai2";

        int result = variables.substract1(a, equ);

        Variables variables3 = new Variables();
        variables3.name="sai3";

        Variables variables4 = new Variables();
        variables4.name="sai4";

        //static or class level methods or variables usage
        Variables.i=123;
        int result1 = Variables.substract(a, equ);

    }

    static int equal(byte v1, int v2) {
        v2 = (byte) v1;
        // int result= (v1=v);
        return v2;
    }

}
