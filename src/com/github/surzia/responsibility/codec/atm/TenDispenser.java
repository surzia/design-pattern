package com.github.surzia.responsibility.codec.atm;

public class TenDispenser extends PaperCurrencyDispenser {

    public TenDispenser() {
        super();
    }

    @Override
    public void dispense(PaperCurrency currency) {
        if (currency != null) {
            int amount = currency.getAmount();
            int remainder = amount;
            if (amount >= 10) {
                int count = amount / 10;
                remainder = amount % 10;
                System.out.printf("取出'%d'张10元纸币\n", count);
            }
            if (remainder > 0 && this.next != null) {
                this.next.dispense(new PaperCurrency(remainder));
            }
        }
    }
}
