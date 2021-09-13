package com.github.surzia.responsibility.codec.atm;

public class TwentyDispenser extends PaperCurrencyDispenser {

    public TwentyDispenser() {
        super();
    }

    @Override
    public void dispense(PaperCurrency currency) {
        if (currency != null) {
            int amount = currency.getAmount();
            int remainder = amount;
            if (amount >= 20) {
                int count = amount / 20;
                remainder = amount % 20;
                System.out.printf("取出'%d'张20元纸币\n", count);
            }
            if (remainder > 0 && this.next != null) {
                this.next.dispense(new PaperCurrency(remainder));
            }
        }
    }
}
