package com.learning;

public class Operators {
    public static void main(String arg[]) {
        /*int a = 15;
        int b = 30;  //+,-,/,%
         int result= (a/=8);       // ++,--,
        // -=,+=,=,/=,%=
        System.out.println(result);*/

//15
          /* System.out.println(a);//16
        System.out.println(++a);//17*?


           System.out.println(a--); //17
           System.out.println(a); //16
           System.out.println(--a);//15

       }
}

//        Arithematic com.learning.operators
//         d = "sai";   //data types which not support boolean,strings/objects
//        d++     //First use → then increment
//        int x=5; //First increment → then use
//        ++x;      //x = 5    ++x → x becomes 6 print 6

        /*int a = 11;
        int b = 13;

        System.out.println(++a); // 12
        System.out.println(b++); // 13

        System.out.println(a);   // 12
        System.out.println(b);   // 14
    }
}*/

// System.out.println(x);


// int x = 5;
// System.out.println(--x); // 4

        /*int x = 5;
        System.out.println(x--); // 5 */

        /*int i =101;
        i= i++;
        System.out.print(i);*/


        /*int x = 5;
        int y = ++x + x++;
        System.out.println(y);
        System.out.println(x);

 ++ works on numeric types only
boolean does not support ++

++x → change then use
x++ → use then change

         */


//int num1 = 10;
//int num2 = 15;

//int result = num1 % num2; // -,+,/(quotient),%(remainder)
//  num1= num1 + 5;  //increment
//num1 %=2 ;  //increment,sub,multiply,divide
//num1++;       //post increment,sub
//--num1;         //pre   increment,sub


//int result =
// ++num1; increment nd then fetch the value
//int result = num1++;   fetch the  value nd then increment*/


//relational com.learning.operators;
//<,>,=,t-f,==,!=,<=,>=  (result in boolean t or f)
       /* int x = 12;
        int y = 5;
        boolean result = x < y;
        System.out.println(result);
    }
}*/

        /*boolean x = true;
        boolean y = false;*/
        double x = 6.5;
        x++;
        double y = 7.5;
        boolean result = (x>y );
        //boolean result=x>y;
        //boolean result=x!=y;
        //boolean result = x<y;
        //boolean result=x==y;
        System.out.println(result);
    }
}

       /*❌ Wrong:

a > b > c


✅ Correct:

a > b && b > c

System.out.println('A' < 'B'); true
Works with boolean?
❌ No
*/

// logical com.learning.operators   (output of combined com.learning.operators)
//
//AND /OR
        /*int x= 8;
        int y= 10;
        int z=11;
        int a= 6;*/

//boolean result = x>y|| a>z || y>1;
//AND Operator (&&): If( a && b ) [if true execute else don't]
//OR Operator (||): If( a || b) [if one of them is true to execute; else don't]
// boolean result = x>y && a>z || y>1;
//boolean result = x>y && a>z && y>1;

// System.out.println(!result);

// int a=10, b=20, c=3;

// System.out.println("value of a: " +  a );//
// Using logical AND
// Short-Circuiting effect as the first condition is
// false so the second condition is never reached
// and so ++b(pre increment) doesn't take place and
// value of b re`mains unchanged

        /*if((a>c)&& (++b > c)){
            System.out.println("Inside if block");
        }
        System.out.println("value of b:" + b);
        }
        }*/

       /* a = 10, b = 20, c = 20

        condition1: a < b
        condition2: b > c

        if(condition1 || condition2)

            d = a + b + c

// Since one of the condition is true

        d = 50.*/



      /*  System.out.println("num1 = " + a);
        System.out.println("num2 = " + b);
        System.out.println("num3 = " + c);*/

        /*if ((a<b)&&(b>c)) {
            d = a + b + c;
            System.out.println("The sum is: " + c);
        }
        else
            System.out.println("true conditions");*/

//short-circuiting in AND

// initializing variables
//int a = 10, b = 1, c = 10, d = 30;

// Displaying a, b, c
        /*System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);
        System.out.println("Var4 = " + d);

        // using logical OR to verify
        // two constraints
        if (a > b || c == d)
            System.out.println(
                    "One or both + the conditions are true");
        else
            System.out.println(
                    "Both the + conditions are false"); */
//int a = 10, b = 1;

// Displaying a, b, c
        /*System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);

        // Using logical NOT operator
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));*/

        /*boolean a = true;
        boolean b = false;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + !a);
        System.out.println("!b: " + !b);*/

       /* int age = 20;
        boolean hasId = true;

        if (age >= 18 && hasId) {
            System.out.println("Access allowed");
        } else {
            System.out.println("Access denied");
        }*/



  /*int var1 = 10;

        int var2 = 12;
        int k = 19;
        if(k<10)
        System.out.println("Hello");
        //int result= ++var1;
      //  int p= var1++;

        //boolean result = var1==var2;
       //boolean result1 = var1>var2;
        boolean result2 = var1<var2;
             int result4= var1/var2;  //quotient
        //int i = var1 + 2;
       var1=var1+3;
       var2= var1+var2+6;
       var2= var1-var2-100;
       int result3 = var1%var2;//remiander
        var1 += 2;
        var2 += 8;
var1 -=10;
var2 -=110;
var1 *=10;
var2 *=10;
var1 ++;
var2 ++;
var1 --;
var2 --; //post increment  (fetch value  nd then increment)
        --var1;
        --var2;
        ++var1;
        ++var2;// pre increment (increment nd then fetch value)
        //int result= ++var1;
        int p= var1++;
        //relational com.learning.operators
        int q= 11;
        int r = 10;
        double x =12;
        double y=12.4;
        boolean resultap = x>=y;
                boolean result =x<=y;
                //boolean resultx =(x>=y);//(x<=y)(x><y)
// boolean resultx = x != y;
        boolean result1 = r!= q;
        boolean  result7=q==r;

        System.out.println(resultap);

        System.out.println(result);
        //System.out.println(resultx);
        System.out.println(result7);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result4);
        System.out.println(result3);
        System.out.println(p);
        System.out.println(var1);
        System.out.println(var2);
     System.out.println(var2);   */