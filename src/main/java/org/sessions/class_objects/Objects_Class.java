package org.sessions.class_objects;

public class Objects_Class {
    public static void main(String[] args) {

    Book book1 = new Book("My best chess games", "Bobby Fischer", 150);
    Book book2 = new Book("My worst chess games", "Lara", 200);

    printBook(book1);
    printBook(book2);
    }

    public static void printBook(Book book) {
        System.out.println("Title: " + book.title + ", Author: " + book.author + ", Pages: " + book.pages);
    }
}
