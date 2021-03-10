package com.vue.exer;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 0.045);
        account.withdraw(30000);
        System.out.println(account.getBalance());
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println(account.getBalance());
        System.out.println(account.getMonthlyInterest());

        CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.045, 10000);
        checkAccount.withdraw(30000);

        Account Account1 = new CheckAccount(1122, 20000, 0.045, 10000);
        CheckAccount Account2 = (CheckAccount) Account1;
    }
}
