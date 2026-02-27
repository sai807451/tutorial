package com.learning;

public class Exception {
    public static void main(String arg[]) {

        try {
            int i = 20;
            int j = i / 0;
            int numbers[]={10,20,30,40,50};
            

            System.out.println(j);
        }
        catch(ArithmeticException e)
        {
            System.out.println("invalid type in java");
        }
    }
}
