package com.learning;


public class Strings {
    public static void main(String[]a){
        String str="sai";
        for(char cha : str.toCharArray()) {
            System.out.println(cha);
        }

        System.out.println(areBothSame("SAI", "sai"));

        System.out.println(areBothCaseInsensitiveSame("SAI", "sai"));


        String name = "SAI PRASAD ALUVALA";
        Integer id = 123;
        String zipCode = " 345";
        String college="saint louis";
        System.out.println(name.trim());
        System.out.println(name.replace('A', 'a'));
        System.out.println(name.substring(0,3));
        System.out.println(name.replace("SAI" ,"CHOTU"));
        System.out.println(id.hashCode(1245));
        System.out.println(college.toUpperCase());
        System.out.println(college.endsWith("louis"));
        System.out.println(college.charAt(3));
        System.out.println(college.compareTo("saint louis" ));
        System.out.println(name.chars());
        System.out.println(name.concat(" sai"));
        System.out.println(name.lastIndexOf('A','s'));
        System.out.println(zipCode.repeat(3));


        String[] names = name.split(",");
        System.out.println(names.length);

        for(String n : names) {
            System.out.println(n);
        }

        String palindrome = "madam";
        char[] chars = palindrome.toCharArray();

        for(int i=0; i<chars.length/2; i++) {
            if(chars[i] != chars[chars.length-1 -i]) {
                //return false;
            }

        }
    }


    private static boolean areBothSame(String str1, String str2) {
        boolean areSame = str1.equals(str2);
        return areSame;

    }

    private static boolean areBothCaseInsensitiveSame(String str1, String str2) {
        boolean areSame = str1.equalsIgnoreCase(str2);
        return areSame;
    }


}
