package com.demo.project.domain;

import com.demo.project.service.Status;

//架构师
public class Architect extends Designer {
    private  int stock;//股票

    public Architect() {
      super();
    }

    public Architect(int id, String name, int age, double salary, int memberid, Status status, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, memberid, status, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
