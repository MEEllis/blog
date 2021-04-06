package com.demo.project.domain;


//产品经理
public class Designer extends Programmer {
    protected double bonus; //奖金

    public Designer() {
        super();
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return this.getDetail() + "产品经理\t" + status + "\t" + bonus + "\t\t" + equipment.getDescription();
    }

    @Override
    public String getDetailForTeam() {
        return  this.getTeanBase() +"产品经理\t" +getBonus() ;
    }

}
