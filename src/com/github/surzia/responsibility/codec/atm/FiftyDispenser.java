package com.github.surzia.responsibility.codec.atm;

public class FiftyDispenser extends PaperCurrencyDispenser {

    public FiftyDispenser() {
        super();
    }

    @Override
    public void dispense(PaperCurrency currency) {
        if (currency != null) {
            int amount = currency.getAmount();
            int remainder = amount;

            if (amount >= 50) {
                int count = amount / 50;
                remainder = amount % 50;
                System.out.printf("取出'%d'张50元纸币\n", count);
            }
            if (remainder > 0 && this.next != null) {
                this.next.dispense(new PaperCurrency(remainder));
            }
        }
    }
}
