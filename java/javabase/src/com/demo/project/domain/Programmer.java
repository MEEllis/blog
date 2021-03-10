package com.demo.project.domain;

import com.demo.project.service.Status;

//程序员
public class Programmer extends Employee {
    private int memberid;
    private Status status;
    private Equipment equipment;


    public Programmer() {
        super();
    }

    public Programmer(int id, String name, int age, double salary, int memberid, Status status, Equipment equipment) {
        super(id, name, age, salary);
        this.memberid = memberid;
        this.status = status;
        this.equipment = equipment;
    }

    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
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
}
