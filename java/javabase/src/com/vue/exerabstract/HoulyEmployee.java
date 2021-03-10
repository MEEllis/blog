package com.vue.exerabstract;

public class HoulyEmployee extends Employee {
    private double wage;
    private int hour;

    public HoulyEmployee(String name, int number, Mydate birthday,double wage,int hour) {
        super(name, number, birthday);
        this.hour=hour;
        this.wage=wage;
    }

    @Override
    public double earnings() {
        return 0;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
