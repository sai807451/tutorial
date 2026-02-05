package com.learning;

    class School{
        private int attendance;

        public int  getattendance()
        {
            return attendance;
        }
        public  void setattendance(int a )
        {
attendance=a;
        }
    }


public class Encapsulation
{
    public static void main(String a[])
    {
        School obj2 = new School();
obj2.setattendance(100);
        System.out.print(obj2.getattendance());
    }}
