package com.vue.exerabstract;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, int number, Mydate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return this.monthlySalary;
    }

    public String aaaaa() {
        return "SalariedEmployee";
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                super.toString() +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
}
