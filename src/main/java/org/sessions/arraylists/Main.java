package org.sessions.arraylists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        // adding names
        names.add("John");
        names.add("Jane");

        // remove names
        names.remove("Jane");

        // adding name at specific position
        names.add(1,"Jack");

        int arraySize = names.size();
        System.out.println(arraySize);

        // Namen an bestimmter Position ausgeben
        String name1 = names.get(0);
        System.out.println(name1);

        System.out.println("-".repeat(20));

        // alle Namen ausgeben
        for (String name : names) {
            System.out.println(name);
        }

        for (int i = 0; i < arraySize; i++) {
            System.out.println(names.get(i));
        }

        // nur int geht nicht
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        Book book1 = new Book("Hallo Welt", "Lara");
        Book book2 = new Book("Hello World", "John");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
