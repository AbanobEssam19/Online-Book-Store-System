package org.example.Types;

import org.example.Services.Service;

public interface Type {
    Service getService();
    String getType();
    int getStock();

    void updateStock(int amount);
}