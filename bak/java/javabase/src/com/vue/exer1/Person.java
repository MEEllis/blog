package com.vue.exer1;

public class Person {
    protected String name = "person";
    protected int age = 50;

    public String info() {
        return "Name:" + this.name + "\t age:" + this.age;
    }
}

class Student extends Person {
    protected String school = "pku";

    public String info() {
        return "Name:" + this.name + "\t age:" + this.age + "\t school:" + this.school;
    }
}

class Graduate extends Student {
    protected String major = "IT";

    public String info() {
        return "Name:" + this.name + "\t age:" + this.age + "\t school:" + this.school + "\t major:" + this.major;
    }
}


class Test {
    public static void main(String[] args) {

        Test test = new Test();
        Graduate graduate = new Graduate();
        Student student = new Student();
        Person person = new Person();
        test.method(person);

        test.method(student);
        test.method(graduate);

    }

    public void method(Person e) {

        if (e instanceof Graduate) {
            System.out.println("e graduate");
        }

        if (e instanceof Student) {
            System.out.println("e student");
        }
        if (e instanceof Person) {
            System.out.println("e person");
        }
        System.out.println(e.info());
        System.out.println("************************");
    }
}