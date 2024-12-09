package com.vue.exer;

public class Account {
    private int id;
    private double balance;
    private double annuallnterestRate;

    public Account(int id, double balance, double annuallnterestRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    //提款
    public void withdraw(double amount) {

        if(this.balance - amount>=0){
            this.balance = this.balance - amount;
        }else{
            System.out.println("余额不足");
        }
    }

    //存款
    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    //获取月利率
    public double getMonthlyInterest() {
        return this.annuallnterestRate / 12;
    }
}
