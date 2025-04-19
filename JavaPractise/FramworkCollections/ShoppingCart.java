package JavaPractise.FramworkCollections;

import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args) {

            ArrayList<String> cart = new ArrayList<>();
            cart.add("Laptop");
            cart.add("Mouse");
            cart.add("Laptop");  // User adds the same item twice
            System.out.println("Your cart: " + cart);
        }
    }

