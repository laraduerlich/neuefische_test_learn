package org.sessions.set_map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ShoppingItem apple = new ShoppingItem ("apple", 2);
        ShoppingItem banana = new ShoppingItem("banana", 4);
        ShoppingItem orange = new ShoppingItem("orange", 5);
        ShoppingItem apple2 = new ShoppingItem("apple", 2);

        Set<ShoppingItem> shoppingList = new HashSet<>();

        shoppingList.add(apple);
        shoppingList.add(banana);
        shoppingList.add(orange);
        shoppingList.add(apple2);

        for (ShoppingItem shoppingitem : shoppingList) {
            System.out.println(shoppingitem);
        }

        System.out.println("Ist ein Apfel auf der Liste? " + shoppingList.contains(apple));

        System.out.println("-".repeat(20));

        Map<ShoppingItem, String> detailedShoppingList = new HashMap<>();

        detailedShoppingList.put(apple, "Pink Lady" );
        detailedShoppingList.put(banana, "Minibanane");
        detailedShoppingList.put(orange, "Mandarine");

        String appleToBuy = detailedShoppingList.get(apple);
        System.out.println(appleToBuy);

        for (ShoppingItem shoppingitem : shoppingList) {
            System.out.println("Ich will noch einkaufen: " + detailedShoppingList.get(shoppingitem));
        }




    }
}
