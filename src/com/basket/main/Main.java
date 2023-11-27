package com.basket.main;

import com.basket.models.GroceryList;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        GroceryList cart = new GroceryList();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("0: stop app");
            System.out.println("1: add items");
            System.out.println("2: remove items");

            try {
                String input = scanner.nextLine();

                switch (input) {
                    case "0":
                        return;

                    case "1":
                        System.out.println("Eklenmesini istediğiniz elemanları giriniz, birden fazla ise virgüllerle ayırınız > \n");
                        String itemsToBeAdded = scanner.nextLine();
                        String[] arrItemsToBeAdded = itemsToBeAdded.split(",");

                        for(String str: arrItemsToBeAdded) {
                            if( null != str && !str.isEmpty() && !str.isBlank()) {
                                cart.addItem(str.trim());
                            }
                        }

                        System.out.println(cart);
                        break;
                    case
                        "2":
                        System.out.println("Çıkarılmasını istediğiniz elemanları giriniz, birden fazla ise virgüllerle ayırınız > \n");
                        String itemsToBeRemoved = scanner.nextLine();
                        String[] arrItemsToBeRemoved = itemsToBeRemoved.split(",");

                        for(String str: arrItemsToBeRemoved) {
                            if( null != str && !str.isEmpty() && !str.isBlank()) {
                                cart.removeItem(str.trim());
                            }
                        }

                        System.out.println(cart);

                        break;
                    default:
                        throw new Exception("Geçersiz input");
                }
            }
            catch (Exception exception) {
                System.out.println("Exception msg: " + exception.getMessage());
            }
        }
    }
}
