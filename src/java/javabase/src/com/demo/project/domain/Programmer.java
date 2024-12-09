package com.demo.project.domain;

import com.demo.project.service.Status;

//程序员
public class Programmer extends Employee {
    protected Status status = Status.FREE;
    protected Equipment equipment;



    protected int memberId;


    public Programmer() {
        super();
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public  String getTeanBase(){
       return getMemberId()+"/" +getId()+ "\t" +getName() + "\t" + getAge() + "\t" + getSalary()+ "\t";
    }

    @Override
    public String toString() {
        return this.getDetail() +"程序员\t"+ status +"\t\t\t" + equipment.getDescription();
    }

    public String getDetailForTeam() {
        return this.getTeanBase()+"程序员\t" ;
    }
}
