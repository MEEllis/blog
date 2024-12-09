package com.demo.project.domain;

import com.demo.project.service.Status;

//架构师
public class Architect extends Designer {
    private int stock;//股票

    public Architect() {
        super();
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return this.getDetail() + "架构师\t" + status + "\t" + bonus + "\t" + stock + "\t" + equipment.getDescription();
    }

    @Override
    public String getDetailForTeam() {
        return this.getTeanBase() + "架构师\t" + getBonus() + "\t" + getStock();
    }
}
