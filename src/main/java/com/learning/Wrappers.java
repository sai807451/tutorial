package com.learning;

public class Wrappers {


    public static void main(String[] a) {
        System.out.println("========== AUTOBOXING & AUTOUNBOXING =======");
        int i = 8;
        Integer x = i;  //autoboxing
        int f = x;    //unboxing

        System.out.println(" PRIMITIVE int i = " + i);
        System.out.println(" Wrapper Integer x = " + x);
        System.out.println(" unboxed int q = " + f);
        System.out.println("\n========== INTEGER METHODS ==========");

        String S = "999";
        int parse = Integer.parseInt(S);
        System.out.println("parsed int = " + parse);

        Integer val = Integer.valueOf("500");
        System.out.println(val);


        //Integer a=12;
        //int primit=Integer.intvalue();
    }
}