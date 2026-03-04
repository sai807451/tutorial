package com.learning;

public class ArraysProblems {


    public static void main(String[] args) {
//        String[] Schools = {"Alphone", "Johns", "Trinity"};
//      for(int i=0; i<Schools.length;i++){
//        System.out.println(Schools[i]);}

     int [ ] numbers={1,2,3,4,5};
//      int sum=0;
//      for(int i=0;i< numbers.length; i++){
//          sum+=numbers[i];
//      }
//      System.out.println(sum);
int lowestNumber=numbers[2];
        for(int number:numbers) {
            if (lowestNumber>number){
                lowestNumber=number;

            }
            System.out.println("lowest number is "+" "+ lowestNumber);
        }}}


//        System.out.println(number);}


