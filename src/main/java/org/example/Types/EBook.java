package org.example.Types;

import org.example.Services.EmailService;
import org.example.Services.Service;

public class EBook implements Type {
    private final Service emailService;

    public EBook() {
        this.emailService = new EmailService();
    }

    public Service getService() {
        return emailService;
    }

    public String getType() {
        return "E-Book";
    }

    public int getStock() {
        return Integer.MAX_VALUE;
    }

    public void updateStock(int amount) {}
}
