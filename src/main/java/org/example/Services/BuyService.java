package org.example.Services;

import org.example.Book.Book;
import org.example.inventory.Inventory;
import org.example.Types.Type;

public class BuyService {
    public void buy(Inventory inventory, String ISBN, int quantity, String email, String address) {
        Book targetBook = inventory.search(ISBN);
        if (targetBook == null)
            throw new RuntimeException("Can't find book with ISBN = " + ISBN);
        Type type = targetBook.getType();
        Service service = type.getService();
        if (type.getStock() < quantity)
            throw new RuntimeException("The required amount is not available!");
        type.updateStock(quantity);
        service.deliver(targetBook, email, address);
    }
}
