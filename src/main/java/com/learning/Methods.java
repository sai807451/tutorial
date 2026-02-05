package com.learning;


public class Methods {
        public static void main (String a[])
        {Car object= new Car();
            object.tires();
            String brand=object.buyWipers(5);
            System.out.println(brand);



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
