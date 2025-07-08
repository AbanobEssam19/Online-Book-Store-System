package org.example.inventory;

import org.example.Book.Book;

import java.time.Year;
import java.util.*;

public class Inventory {
    private final List<Book> books;

    public Inventory() {
        this.books = new ArrayList<>();
    }

    public void add(Book book) {
        this.books.add(book);
    }

    public List<Book> removeOutDated(int numOfYears) {
        List<Book> outDated = new ArrayList<>();
        int currentYear = Year.now().getValue();
        for (Book book : books) {
            if (currentYear - book.getPublishedYear() > numOfYears) {
                outDated.add(book);
            }
        }
        for (Book book : outDated) {
            books.remove(book);
        }
        return outDated;
    }

    public Book search(String ISBN) {
        for (Book book : books) {
            if (Objects.equals(book.getISBN(), ISBN))
                return book;
        }
        return null;
    }
}
