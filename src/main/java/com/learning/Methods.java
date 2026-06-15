package com.learning;


public class Methods {
        public static void main (String a[])
        {Car object= new Car();
            object.tires();
            String brand=object.buyWipers(5);
            System.out.println(brand);

            OverLoad  object1= new OverLoad();
            object1.add(1,2,3);

            object1.add(1,2);
            object1.add(2,3);
            object1.add("sai","kumar");

            System.out.println(object1.add(1,2,3));


        }

    static class Car {
        void tires() {
            System.out.println("car drive with 4 wheels");
        }
        String buyWipers(int price)
        {   return "Wiper";
    }
}
}
