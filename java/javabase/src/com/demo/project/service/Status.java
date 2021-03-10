package com.demo.project.service;

/**
 * 员工状态
 */
public class Status {
    private final String NAME;

    private Status(String name) {
        this.NAME = name;
    }

    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VOCATION = new Status("VOCATION");//休假中....

    public String getNAME() {
        return this.NAME;
    }
}
