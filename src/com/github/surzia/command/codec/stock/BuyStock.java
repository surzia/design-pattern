package com.github.surzia.command.codec.stock;

public class BuyStock implements Order {

    private final Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
