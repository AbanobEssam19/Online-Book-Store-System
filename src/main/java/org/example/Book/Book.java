package org.example.Book;

import org.example.Types.Type;

public class Book {
    private final String ISBN;
    private final String title;
    private final int publishedYear;
    private double price;
    private final Type type;

    public Book(String ISBN, String title, int publishedYear, Type type) {
        this.ISBN = ISBN;
        this.title = title;
        this.publishedYear = publishedYear;
        this.type = type;
    }


    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public double getPrice() {
        return price;
    }

    public Type getType() {
        return type;
    }


}
