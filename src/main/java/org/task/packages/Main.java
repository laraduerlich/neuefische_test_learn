package org.task.packages;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Hallo", "Welt", 123456789);
        Book book2 = new Book("Welt", "Hallo", 987654321);

        // Bücher in Array
        Book[] books = new Book[]{book1, book2};
        // Library Aufruf
        Library library = new Library();
        // Bücher in Library
        library.setBooks(books);

        // Library ausprinten
        System.out.println(library.toString());

    }
}
