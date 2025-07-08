package org.example.Types;

import org.example.Services.NotSellingService;
import org.example.Services.Service;

public class DemoBook implements Type {
    private final Service service;
    public DemoBook() {
        this.service = new NotSellingService();
    }

    @Override
    public Service getService() {
        return service;
    }

    @Override
    public int getStock() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void updateStock(int amount) {}

    @Override
    public String getType() {
        return "Demo-Book";
    }
}
