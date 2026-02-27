package com.learning;



public class LeapYear
{

    public static void main(String args[]) {

        LeapYear year1= new LeapYear();
        boolean output= year1.getLeapYear(2023);
        System.out.println(output );
    }
    public  boolean  getLeapYear(int year) {

        int reminder = year % 4;
        boolean leapYear = reminder == 0;
        return leapYear;

       // return (year % 4) == 0;
    }





}