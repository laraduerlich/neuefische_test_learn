package org.sessions.record_big_decimal;

public record BookRecord(String ISBN,
                         String title,
                         double price) {

    // Wither
    public BookRecord withPrice(double price) {
        return new BookRecord(ISBN, title, price);
    }

    public BookRecord withTitle(String title) {
        return new BookRecord(ISBN, title, price);
    }
}
