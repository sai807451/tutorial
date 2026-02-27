package com.learning;

public class Tv {
    int price=300;
    String name;
    public static void Sports()
    {
        System.out.println("i watch cricket daily " );
    }
    public int newChannelPrice(int cost){

        System.out.println("we are watching telugu news channels:" + " " + cost);


        return 300;

        }
    public  void  additionalPack(double charge){
        System.out.println("We need extra channels to" +   charge);
    }
    public static void main(String[] args){
        Tv obj1= new Tv();
        obj1.price=300;
        obj1.name="sony";
        Sports();

        int returnedValue = obj1.newChannelPrice(200);
        System.out.println("Returned price: " + returnedValue);
        obj1.additionalPack(1.99);

    }
}
