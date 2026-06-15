package com.learning;

public class TestingCode {

    //    public void employee(){String name + int age + String name + String gender + boolean isStudent}
//
//
//                gender
//        isStudent)
    public static void main(String[] args) {
//        Problem 1
//
//        Create variables for:
//
//        name
//                age
//        salary
//                gender
//        isStudent
//
//        Print all values.
//        String name="Sai";
        int age = 25;
//        double salary= 25000.10;
//        String gender= "Male";
        if (age % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }


        int[] Classes = {1, 2, 3, 4, 5, 6, 7, 8};
        int LargestNumber = Classes[0];

        for (int i = 0; i < Classes.length; i++) {
            if (LargestNumber < Classes[i]) {
                LargestNumber = Classes[i];
            }
        }


        System.out.println(LargestNumber);


        int a=5;
        int b=-5;
        int o=0;

        if(a>0){System.out.println("positive");}
            if(b>0){System.out.println("negative");}
                if(o == 0){System.out.println("neutral");}


                String Z= "saturday";

                switch(Z){

                    case  "sun":
                        System.out.println("sunday");
                        break;

                    case "mon":
                        System.out.println("monday");
                        break;
                    case "saturday":
                        System.out.println("saturday");
                        break;

                    default:
                        System.out.println("weekend");
                }

                String name="sai";

                int[] marks={90,80,70,60,50};
                int sum=0;
                for(int mark: marks){
                    if(mark<0){
                        continue;
                    }
                    if(mark>100){
                        System.out.println("Invalid mark found");
                        break;
                    }
                    sum+=mark;
                }
                int avg=sum/marks.length;
                boolean isPass =avg >= 60;

                char grade;
                if(avg>=90){
                    grade='A';
                }
                else if(avg >=80){
                    grade ='B';

                }
                else if(avg>=70){
                    grade ='C';
                }
                else if(avg>=60){
                    grade='D';
                } else {
                    grade='F';

                }



                switch(grade) {
                    case 'A':
                        System.out.println("Excellent");
                        break;
                    case 'B':
                        System.out.println("Good");
                        break;
                    case 'C':
                        System.out.println("Average");
                        break;
                    case 'D':
                        System.out.println("Improve");
                        break;
                    case 'F':
                        System.out.println("Failed");
                break;

        }
                System.out.println("student Nmae: " + name);
        System.out.println("Total Marks: " + sum);
        System.out.println("avg: " + avg);
        System.out.println("Grade: " + grade);
        System.out.println("pass Status: " + isPass);



}
//String balance="$1000";
//    while(balance){
//        if(balance>)
//    }

}