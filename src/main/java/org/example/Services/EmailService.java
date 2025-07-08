package org.example.Services;

import org.example.Book.Book;

public class EmailService implements Service {
    public void deliver(Book book, String email, String address) {
        System.out.println("Your book '" + book.getTitle() + "' has been sent to '" + email + "'");
    }
}
