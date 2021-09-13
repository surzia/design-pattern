package com.github.surzia.responsibility.codec.atm;

public class HundredDispenser extends PaperCurrencyDispenser {

    public HundredDispenser() {
        super();
    }

    @Override
    public void dispense(PaperCurrency paper) {
        if (paper != null) {
            int amount = paper.getAmount();
            int remainder = amount;

            if (amount >= 100) {
                int count = amount / 100;
                remainder = amount % 100;
                System.out.printf("取出'%d'张100元纸币\n", count);
            }

            if (remainder > 0 && this.next != null) {
                this.next.dispense(new PaperCurrency(remainder));
            }
        }
    }
}
