package com.learning;

public class ConditionalStatement {
    public static void main(String[] args) {
        int n = 8;
        {
            if (n > 0)
                System.out.println("positive");
            else
                System.out.println("negative");
        }


        int i = -1;
        {
            if (i > 0) {
                System.out.println("positive");
            } else {
                System.out.println("negative");
            }
        }
        int x = 5;
        {
            if (x % 2 == 0) {

                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        int a = 20;
        int b = 21;
        if (a > b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("b is greater than a");

        }

        int Z = 50;

        if (Z >= 90) {
            System.out.println("A");
        } else if (Z >= 75) {
            System.out.println("B");
        } else if (Z >= 60) {
            System.out.println("C");
        } else {
            System.out.println("Fail");

        }

        boolean isRegistered = false;
        boolean hasPassword = true;
        if (isRegistered) {
            if (hasPassword) {
                System.out.println("Login successful");
            } else {
                System.out.println("Set password");
            }
        } else {
            System.out.println("Register first");
        }

        int amount = 5999;
        boolean isMember = false;
        {
            if (isMember) {
                if (amount >= 5000) {
                    System.out.println("Discount is 20%");
                } else {
                    System.out.println("Discount is 10%");
                }
            } else {
                System.out.println(" no Discount");
            }

        }
        {

            int W = 10;
            int B = 25;
            int C = 15;

            if (W >= B && W >= C) {
                System.out.println("W is largest");
            } else if (B >= W && B >= C) {
                System.out.println("B is largest");
            } else {
                System.out.println("C is largest");
            }
        }
        int s1 = 5;
        int s2 = 8;
        int s3 = 7;

        if (s1 >= s2 && s1 <= s3) {
            System.out.println("s1 is 2nd largest number");

        } else {
            System.out.println("s3 is 2nd largest number");

        }

        int q = 12;
        int w = 11;
        int e = 1;

        if ((q >= w && q <= e) ||(q <= w && q >= e))
        {
            System.out.println("q " + "is second smallest number");
        }

        else if ((w >= q && w <= e) || (w <= q && w >= e))
        {
            System.out.println("w " + "is second smallest number");
        }

                else
        {
            System.out.println("e " + "is second smallest number");
        }


    }
}














/*int x= 14;
 System.out.println(x);*/

        //int x = 8;

        //if (x < 10  &&  x<=11)//11- .....
        // if (x > 10  &&  x<=11)
        //int x= 13;
        //int y=15;
        // int z=18;

        /*String username = "admin";  //if else login system(realtime)
        String password = "1234";

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid credentials");
        }

        int marks = 80;   //IF-ELSE    Used when multiple dependent conditions exist
        boolean attendance = true;

        if (attendance) {
            if (marks >= 50) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail due to marks");
            }
        } else {
            System.out.println("Fail due to attendance");
        }*/

       /* int x = 10;

        if (x > 5)
            System.out.println("Hello");   //Only first line belongs to if .Use {} to avoid mistakes
        System.out.println("World");

        /*int x = 5;

        if (x > 10) {
            System.out.println("A");
        } else if (x > 3) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
        if (a > b) {
            if (a > c) {
                result = a;
            } else {
                result = c;
            }
        } else {
            if (b > c) {
                result = b;
            } else {
                result = c;
            }
        }

        // int greater= condition(x,y,z);

      /*  if(x>y || y>z)
        {
            System.out.println(x);
            System.out.println(y);
        }
         else

             System.out.println(z);


          // private static int condition(int  var1, int var2, int var3){

           /* int result1 = (x > y > z);
            return result;*/





