package com.learning;


import java.util.*;

public class Collect {
    public static void main(String args[]) {
        List<String> names = new ArrayList<>();
        names.add("sai");
        names.add(0, "prasad");
        names.add("saiprasad");
        names.add("sai");
        names.add("suman");
        names.add("charan");

        List<String> names2 = new ArrayList<>();
        names2.add("ria");
        names2.add("suman");
        names2.add("srinivas");
        names2.add("poornima");
        names2.add("bhavik");
        names2.add("Charan");




        removeDuplicates(names, names2);
        System.out.println(names2);
        /*Set<String> namesSet= new HashSet<>(names);
       for(String name: namesSet){
           System.out.println(name);
       }*/
//        int size=names.size();
//        int count= Collections.frequency(names,"sai");
//        for(String name:names){
//            System.out.println(name);
//
//        }
       // System.out.println(size);

//        String target = "sai";
//        int count = 0;
//
//        for (String i : name) {
//            if (i == target) {
//                count++;
//            }
//        }
//        System.out.println("count: " + count);
    }

    public static void removeDuplicates(List<String> firstList, List<String> secondList) {

//        for(int i=0; i<firstList.size(); i++) {
//            System.out.println("Printing first list: " + firstList.get(i));
//            for(int j=0; j<secondList.size(); j++) {
//                if(firstList.get(i).equalsIgnoreCase(secondList.get(j))) {
//                    System.out.println("Printing duplicate name : " + firstList.get(i));
//                    secondList.remove(secondList.get(j));

                for(String firstName: firstList){

                    for(String secondName: secondList){

                        if(firstName.equalsIgnoreCase(secondName)){
                            System.out.println("printing duplicate name: "+ secondName);
                            secondList.remove(firstName);
                        }
                    }
        }


        }
    }




//        for(
//        Collections.sort(name, Collections.reverseOrder());
//        for(String A;name) {
//          System.out.println(A);
//        }
//        System.out.println(name.size());
//        System.out.println(name.get(1));
//        System.out.println(name);
//    }
//}
