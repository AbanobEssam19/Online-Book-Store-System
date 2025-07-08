package org.example.Services;

import org.example.Book.Book;

public interface Service {
    void deliver(Book book, String email, String address);
}
