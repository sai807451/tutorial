package com.learning;

public enum Phone {
    IPHONE(300),SAMSUNG(200),NOKIA(50);
    private int price;
    private Phone(int price)

    {this.price=price;
        }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
        System.out.println("in Laptop" + this.name());
    }

    public class CellPhone{
        public static void main(String []args){
            for(Phone p:Phone.values())
            {
                System.out.println(p+" : "+p.getPrice());
            }

        }
    }
}
