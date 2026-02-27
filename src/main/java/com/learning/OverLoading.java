package com.learning;

 class Maths {
     int add(int a, int b) {
         return a + b;
     }

     int add(int a, int b, int c) {
         return a + b + c;
     }
 }



public class OverLoading {
      public static void main (String[]args){
          int a=20;
          int b=21;
          int c= 22;

          Maths sum= new Maths();
          int total=sum.add(20,21);
          int total1=sum.add(20,21,22);
          System.out.println(total);
          System.out.println(total1);

      }

}
