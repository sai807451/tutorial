package com.learning;

public class Loops {


    public static void main(String arg[]) {
        loops1();
        loops2();
        loops3();
        loops4();
        loops5();
        //loops6();
        //loops7();
    }


    private static void loops1() {
        int j = 6;
        while (j >= 10)
            j++;
        {
            System.out.println("hello ria " + j);

        }


        System.out.println("byee ria " + j);

    }

    private static void loops2() {
        int i = 6;
        while (i >= 10)
            i++;
        {
            System.out.println("hello ria " + i);

        }


        System.out.println("byee ria " + i);


    }

    //NESTED WHILE LOOP
    private static void loops3() {
        int k = 15;
        while (k <= 18) {
            System.out.println("hi ria i am waiting for you " + k);
            int h = 12;
            while (h <= 15) {

                System.out.println("okay Chotu " + h);
                h++;
            }
            k++;
        }
        System.out.println("bye" + k);
    }

    private static void loops4() {
        int l = 6;
        while (l <= 10) {
            System.out.println("hello ria " + l);
            l++;
        }
        System.out.println("HI CHOTU " + l);
    }

    // Do while loops5
    private static void loops5() {
        int n = 11;
        do {
            System.out.println("Hello" + n);
            n++;

        } while (n <= 8);
    }

   /* private static void loops6() {


        for (int z = 5; z >= 3; z--) {
            System.out.println("chotu i am ria " + z);
        }}
        private static void loops7() {


            for (int x = 1; x <= 7; x++) {
                System.out.println("day" + x);
                for
            }*/

        }
    //}







