package org.example.command;

import org.example.model.Stock;

public class BuyStock implements Order{
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
