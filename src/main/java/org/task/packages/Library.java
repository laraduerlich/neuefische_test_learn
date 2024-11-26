package org.task.packages;

import java.util.Arrays;

public class Library {
    Book [] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {

        String print = "";
        for (Book book : books) {
            print = print + "Title: " + book.getTitle() + ", ";
            print = print + "Author: " + book.getAuthor() + ", ";
            print = print + "ISBN: " + book.getIsbn() + ", ";
    }
        return print;
    }
}
