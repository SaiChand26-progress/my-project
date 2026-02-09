package Oops;

import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String n, double p) {
        name = n;
        price = p;
    }
}

class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();

        cart.add(new Product("Pen", 10));
        cart.add(new Product("Book", 50));

        double total = 0;
        for (Product p : cart) {
            total += p.price;
        }

        System.out.println("Total Bill: " + total);
    }
}
