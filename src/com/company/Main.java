package com.company;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> product = new ArrayList<String>();
        ArrayList<Double> price = new ArrayList<Double>();
        ArrayList<String> purchase = new ArrayList<String>();
        ArrayList<Double> priceofpurchase = new ArrayList<Double>();


        product.add("Bison Sweater");
        price.add(55.99);
        product.add("Bison Tee");
        price.add(14.99);
        product.add("Bison Hoodie");
        price.add(23.99);
        product.add("Bison Bumper Sticker");
        price.add(4.99);


        String answer;
        Scanner input = new Scanner(System.in);
        String item;
        double sum = 0.0;
        int index = -1;
        do {
            System.out.println("What item did you buy? If you are done type 'Finish Transaction':");
            item = input.nextLine();
            purchase.add(item);
            for (int i = 0; i < product.size(); i++) {
                if (item.equals(product.get(i))) {
                    index = i;
                }
            }
            priceofpurchase.add(price.get(index));
        } while (!item.equalsIgnoreCase("Finish Transaction"));
        for (int i = 0; i < purchase.size() - 1; i++) {
            System.out.println("You purchased: " + purchase.get(i));
            sum += priceofpurchase.get(i);
        }
        System.out.println("Your order sum is: $" + sum);
        System.out.println("Your order has been processed:");
    }
}