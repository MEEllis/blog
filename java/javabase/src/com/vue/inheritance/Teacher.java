package com.vue.inheritance;

public class Teacher extends Person {

    protected void sleep() {
        System.out.println("Teacher sleep");
    }

    public void play() {
        System.out.println("Teacher play");
    }

    @Override
    protected void eat() {
        System.out.println("Teacher eat");
    }
}


class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.sleep();
        teacher.play();
        teacher.eat();

        Teacher.fly();

        A test = new B();
        System.out.println(test.a);
        test.say();
    }
}





abstract class A {
    int a = 1;
    public A(){
        System.out.println("AAAAAAAAAAA");
    }

    public void say(){
        System.out.println("say: AAAAAA");
    }
}

class B extends A {
    int a = 2;
    public B(){
        super();
    }

    @Override
    public void say(){
        System.out.println("say: BBBBBBB");
    }
}