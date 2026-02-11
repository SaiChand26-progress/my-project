package Oopsadvance;

import java.util.*;

interface Product{
    String getName();
    double getPrice();
}

class Electronics implements Product{

    String name;
    double price;

    Electronics(String n,double p){
        name=n;
        price=p;
    }

    public String getName(){ return name; }
    public double getPrice(){ return price; }
}

public class CartApp{

    public static void main(String[] args){

        List<Product> cart = new ArrayList<>();

        cart.add(new Electronics("Laptop",60000));
        cart.add(new Electronics("Mobile",20000));

        double total = 0;

        for(Product p : cart){
            total += p.getPrice();
        }

        System.out.println("Total Price = " + total);
    }
}
