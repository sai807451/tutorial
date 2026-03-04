package com.learning;

import java.util.*;

import static com.learning.Collect.getMaxNumber;

//First → length (ascending)
//If same length → alphabetical order
//["apple", "dog", "banana", "cat", "elephant"]

public class Ds {
    public static void main(String args[]) {

        List<Integer> numbers = Arrays.asList(3, 30, 300, 103, 33);
        Integer maxNumber = getMaxNumber(numbers);
        System.out.println("Max Number :" + maxNumber);


        List<String> name = new ArrayList<>();
        {
            name.add("apple");
            name.add("dog");
            name.add("banana");
            name.add("cat");
            name.add("elephant");

//            Comparator com = new `
//            Collections.sort(name);
//            for (String i : name)
//                System.out.println(i);
//            }
//
//            }
       }
    }}
