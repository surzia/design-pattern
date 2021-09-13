package com.github.surzia.responsibility.codec.atm;

public abstract class PaperCurrencyDispenser {

    protected PaperCurrencyDispenser next;

    public void setNext(PaperCurrencyDispenser next) {
        this.next = next;
    }

    public abstract void dispense(PaperCurrency paper);
}
