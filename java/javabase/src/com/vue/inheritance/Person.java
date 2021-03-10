package com.vue.inheritance;

public class Person {
    String name;

    public Person(){
        System.out.println("Person constructor");
    }

    private void sleep() {
        System.out.println("Person sleep");
    }

    void eat() {
        System.out.println("Person eat");
    }

    public static void fly(){
        System.out.println("Person fly........");
    }
}
