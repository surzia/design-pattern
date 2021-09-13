package com.github.surzia.responsibility.codec.atm;

public class ATMWithdrawal {

    protected static PaperCurrencyDispenser hundredDispenser = new HundredDispenser();
    protected static PaperCurrencyDispenser fiftyDispenser = new FiftyDispenser();
    protected static PaperCurrencyDispenser twentyDispenser = new TwentyDispenser();
    protected static PaperCurrencyDispenser tenDispenser = new TenDispenser();
    protected static PaperCurrencyDispenser dispenserChain;

    static {
        hundredDispenser.setNext(fiftyDispenser);
        fiftyDispenser.setNext(twentyDispenser);
        twentyDispenser.setNext(tenDispenser);
        dispenserChain = hundredDispenser;
    }

    public static void withdraw(PaperCurrency paper) {
        if (paper != null) {
            dispenserChain.dispense(paper);
        }
    }
}
