package org.example.Types;

import org.example.Services.Service;
import org.example.Services.ShippingService;
import org.example.Types.Type;

public class PaperBook implements Type {
    Service shippingService;

    private int stock;

    public PaperBook(int stock) {
        this.stock = stock;
        shippingService = new ShippingService();
    }

    public Service getService() {
        return shippingService;
    }

    public String getType() {
        return "Paper-Book";
    }

    public int getStock() {
        return stock;
    }

    public void updateStock(int amount) {
        this.stock -= amount;
    }
}
