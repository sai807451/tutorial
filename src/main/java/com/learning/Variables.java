package com.learning;


public class Variables {
    int x = 0;
    String name = "Sai";

    static int i = 1000;


    public static void main(String[] args) {
        /*byte b = 11;
        short s = 126;
        int i = 3000;
        long l = 9990000000L;

        float f = 13.5f;
        double d = 100.999;

        char c = 'A';
        boolean flag = true;

         int  staticInt = 100;
         double staticDouble = 65.55;
        int x = 58;
        double y =25.5;
        System.out.println("Instance Variables");
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(flag);
        System.out.println("static variable");
        System.out.println(staticInt);
        System.out.println(staticDouble);
        System.out.println("Local variables");
        System.out.println(x);
        System.out.println(y);
        System.out.println("Method  parameters");

        System.out.println(b);

    }

        static void displaystaticvariables(){


        }
        static void localvariableDemo() {

        }
        void parameterDemo(int a, float b, char ch) {
        }*/

        int j = 90;
        byte by = 126;
        short s = 190;
        long ln = 16000;
        double d = 5555555555555555.555;
        float f = 5555555555555f;
        double k = 100;
        double l = 26;
        double H = 1.3;
        double R = 1.4;
        float B = 11f;
        float A = 12f;
        String word = "ria ";
        String sp = "chotu ";
        char me = 'k';
        boolean b = true;
        boolean c = false;
        System.out.println(j + k + l + H + R + B + A + word + me);
        System.out.println(ln);
        System.out.println(c);
        System.out.println("hi" + b);


        String address = "2301 ashley place";

        int sum = addition(i, j);
        int minus = substract(j, i);
        int mult = multiply(i, j);
        double add = addition(k, l);
        double sub = substraction(H, k);
        double div = division(H, R);
        float perc = percentage(B, A);
        float perc1 = percentages(A, B);
        String name = addition(word, sp);

        System.out.println("sum " + sum);
        System.out.println("minus " + minus);
        System.out.println("mult " + mult);
        System.out.println("sum " + add);
        System.out.println("total " + sub);
        System.out.println("div " + div);
        System.out.println("percentage " + perc);
        System.out.println("total1 " + perc1);
        System.out.println("we are playing " + name);
    }

    private static int addition(int var1, int var2) {
        int result = var1 + var2;
        return result;
    }

    public int addition2(int var1, int var2) {
        int result = var1 + var2;
        return result;
    }

    public int add() {
        int result = 100 + 100;
        return result;
    }

    public boolean isSkyBlue() {
        return true;
    }

    public static int substract(int var1, int var2) {
        int result = var1 - var2;
        return result;

    }

    public int substract1(int var1, int var2) {
        int result = var1 - var2;
        return result;

    }

    private static int multiply(int var1, int var2) {
        int result = var1 * var2 * 2300;
        return result;

    }

    private static double addition(double var1, double var2) {
        double result = var1 + var2;
        return result;


    }

    private static double substraction(double var1, double var2) {
        double result = var1 - var2;
        return result;
    }

    private static double division(double var1, double var2) {
        double result = var1 / var2;
        return result;
    }

    private static float percentage(float var1, float var2) {
        float result = var1 % var2;
        return result;
    }

    private static float percentages(float var1, float var2) {
        float result = var1 % var2;
        return result;
    }

    private static String addition(String var1, String var2) {
        String result = var1 + var2;
        return result;

    }
}


