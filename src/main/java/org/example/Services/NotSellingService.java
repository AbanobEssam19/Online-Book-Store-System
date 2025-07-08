package org.example.Services;

import org.example.Book.Book;

public class NotSellingService implements Service {
    @Override
    public void deliver(Book book, String email, String address) {
        throw new RuntimeException("Book '" + book.getTitle() + "' is not for sale!");
    }
}
