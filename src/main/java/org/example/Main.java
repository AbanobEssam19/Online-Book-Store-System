package org.example;

import org.example.Book.Book;
import org.example.Services.BuyService;
import org.example.Types.DemoBook;
import org.example.Types.EBook;
import org.example.Types.PaperBook;
import org.example.inventory.Inventory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book paperBook = new Book("142D", "Network Architecture", 2022, new PaperBook(5));
        Book mailBook = new Book("142C", "Head First Object-Oriented Analysis", 2025, new EBook());
        Book demoBook = new Book("142H", "Artificial Intelligence", 2010, new DemoBook());

        Inventory inventory = new Inventory();
        inventory.add(paperBook);
        inventory.add(mailBook);
        inventory.add(demoBook);

        List<Book> outDated = inventory.removeOutDated(5);

        for (Book book : outDated) {
            System.out.println("Book '" + book.getTitle() + "' is outdated!");
        }

        BuyService buyService = new BuyService();

        buyService.buy(inventory, "142D", 2, "abanobessam19@gmail.com", "Ramsis Central");
        buyService.buy(inventory, "142C", 1, "abanobessam19@gmail.com", "Ramsis Central");


    }
}