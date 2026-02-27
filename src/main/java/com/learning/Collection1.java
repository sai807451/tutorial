package com.learning;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.Collections;

public class Collection1 {
    public static void main(String a[]) {
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(130);
        num1.add(35);
        num1.add(30);
        num1.add(40);
//        int max=num1.get(1);
//        int min=num1.get(1);
//
//        for(int num: num1){
//            if(num>max){
//                max=num;
//            }
//            if(num<min){
//                min=num;
//                System.out.println("Largest: " + max);
//                System.out.println("Smallest: " + min);

                for(Object n : num1){
                    int sum=(Integer)n;
                    System.out.println(sum*2);
                }}}


//        num1.add(3,33);
//        num1.set(0,123);

//        int total=num1.get(0);
//        num1.remove(2);
//        for(int i: num1)
//     System.out.println(i);
//    }}
       // num1.clear();
//       int size= num1.size();
//       for(int i=0;i< num1.size();i++){
//           System.out.println(num1.get(i));
//       }
//       Collections.sort(num1);
//       for(Integer n: num1){
//           System.out.println(n);
//       }
//
//
//        System.out.println(size);
//        System.out.println(total);
//
//
//            System.out.println(num1);
//        }
//    }
