package org.example.Services;

import org.example.Book.Book;
import org.example.Services.Service;

public class ShippingService implements Service {
    public void deliver(Book book, String email, String address) {
        System.out.println("Your book '" + book.getTitle() + "' has been shipped to address '" + address + "'");
    }
}
