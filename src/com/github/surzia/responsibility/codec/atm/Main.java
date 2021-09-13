package com.github.surzia.responsibility.codec.atm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("请输入要提取的金额（必须是10的倍数，最大1000, Ctrl+C退出): ");
                int amount = scanner.nextInt();
                if (isValid(amount)) {
                    ATMWithdrawal.withdraw(new PaperCurrency(amount));
                }
            } while (true);
        }
    }

    private static boolean isValid(int amount) {
        if (amount <= 0) {
            System.out.println("金额不能小于0，请重新输入！");
            return false;
        } else if (amount > 1000) {
            System.out.println("超出最大金额1000，请重新输入！");
            return false;
        } else if (amount % 10 != 0) {
            System.out.println("金额必须为10的倍数！");
            return false;
        }
        return true;
    }
}
