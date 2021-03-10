package com.vue.exer;

//透支账户
public class CheckAccount extends Account {

    private double overdraft;//透支金额

    public CheckAccount(int id, double balance, double annuallnterestRate, double overdraft) {
        super(id, balance, annuallnterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    //提款
    @Override
    public void withdraw(double amount) {
        double balance=super.getBalance();
        double subtractAmount=balance-amount;
        if(subtractAmount>=0){
            super.setBalance(subtractAmount);
        }else {
            super.setBalance(0);
            double subtractAmountAbs=Math.abs(subtractAmount);
            if(this.overdraft>=subtractAmountAbs){
                    this.setOverdraft(subtractAmountAbs);
            }else{
                System.out.println("超出可透支限额！");
            }
        }
    }
}
