package com.learning;


       class A
       {
           void aMethod()
       {
           System.out.println("AMethod");
       }
           class B
           {

               void bMethod()
               {
                   aMethod();

               }
           }
       }
public class InnerNdAnonymousInner
{    public static void main(String[]args )
{
    A obj1= new A();


    A.B obj2= obj1.new B();
    {
      obj2.bMethod();








}}}
