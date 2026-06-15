package com.learning;
import java.util.*;
public class Maps {

    public static Map<Integer,Integer> frequency(List<Integer>list){
        Map<Integer,Integer>map=new HashMap<>();
        for(Integer num: list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }

        public static void main(String[] args) {
            String input = "programming";
            Map<Character, Integer> map = new HashMap<>();

            for (char ch : input.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
            Map<String,Integer> map1=new HashMap<>();
            map1.put("Ria",99);
            map1.put("chotu",36);
            map1.put("babai",98);
            System.out.println(map1.get("Ria"));


             if (map1.containsKey("chotu")) {
                 System.out.println("Exists");

             } else {
                 System.out.println("doesnt exist");
             }






        }}

