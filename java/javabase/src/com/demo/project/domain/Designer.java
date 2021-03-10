package com.demo.project.domain;

import com.demo.project.service.Status;

//产品经理
public class Designer extends Programmer {
    private double bonus; //奖金

    public Designer() {
        super();
    }

    public Designer(int id, String name, int age, double salary, int memberid, Status status, Equipment equipment, double bonus) {
        super(id, name, age, salary, memberid, status, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
