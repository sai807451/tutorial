package com.learning;


import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Collect {
//    public static List<String> removeDuplicates(List<String> cars) {
//        List<String> uniqueCars = new ArrayList<>();
//        for (String car : cars) {
//            if (!uniqueCars.contains(car)) {
//                uniqueCars.add(car);
//            }
//
//        }
//          return uniqueCars;
//    }

    public static List<String> reverseOrder(List<String> cars) {
        List<String> reverse = new ArrayList<>();
        for (int i = cars.size() - 1; i > -1; i--) {
            reverse.add(cars.get(i));
        }
        return reverse;
    }



    public static int frequency(List<String> repeats) {

        int count = 0;

        for (String same : repeats) {
            if (same.equals("Audi")){
                count++;
            }


        }

     return count;
}


    public static void main(String args[]) {




        List<String> names = Arrays.asList("sai","prasad","saiprasad","sai","suman","charan");


        List<String> names2 = Arrays.asList("ria","suman","srinivas","poornima","bavik","charan");

        List<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Tesla");

        Iterator<String> vehicle=cars.iterator();
        while(vehicle.hasNext()) {
            String brand = vehicle.next();

            if(cars.equals("Tesla")){
//                String vehicle=cars.remove("Tesla");
            }


        System.out.println("Using Iterator " + cars);}

        for(int i=0; i<1000000;i++) {
            cars.add( "Toyota");
        }
        int repeat=frequency(cars);
        System.out.println(repeat);

//        Collections.reverse(cars);
//        int  total=int frequency();
//        System.out.println(to     freque
        Instant startTime=Instant.now();
        List<String> reverse=reverseOrder(cars);
        Instant endTime=Instant.now();
        System.out.println("Reverse Duration: " + Duration.between(startTime,endTime).toMillis());


            Instant startTime1=Instant.now();
         Collections.reverse(cars);
         Instant endTime1=Instant.now();
         System.out.println("Reverse duration1: " + Duration.between(startTime1,endTime1).toMillis());

       // List<String> result =removeDuplicates(cars);


//System.out.println(result);




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

    public static Integer getMaxNumber(List<Integer> numbers) {
        Integer maxNumber = 0;
        for(Integer num : numbers) {
            if(num >maxNumber) {
                maxNumber = num;
            }
        }
        return maxNumber;
    }

    public static void removeDuplicates(List<String> firstList, List<String> secondList) {

//        for(int i=0; i<firstList.size(); i++) {
//            System.out.println("Printing first list: " + firstList.get(i));
//            for(int j=0; j<secondList.size(); j++) {
//                if(firstList.get(i).equalsIgnoreCase(secondList.get(j))) {
//                    System.out.println("Printing duplicate name : " + firstList.get(i));
//                    secondList.remove(secondList.get(j));

//                for(String firstName: firstList){
//
//                    for(String secondName: secondList){
//
//                        if(firstName.equalsIgnoreCase(secondName)){
//                            System.out.println("printing duplicate name: "+ secondName);
//                            secondList.remove(firstName);
//                        }
//                    }
//                }

//        secondList.removeAll(firstList);


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
