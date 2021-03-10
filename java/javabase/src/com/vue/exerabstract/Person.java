package com.vue.exerabstract;


/**
 * 抽象类
 * 修饰: 类，结构，方法；
 * 修饰类：
 * 1.抽象类，此类不能实例化
 * 2.抽象类一定有构造函数，便于子类实例化时调用
 * 3.开发中，都会提供抽象类的子类，让子类对象实例化
 * 抽象方法：
 * 1.只有方法声明，没有方法体
 * 2.包含抽象方法的类，一定是抽象类
 * 3.子类重写父类所有的抽象方法，此子类才可以实例化
 * 子类没有重写父类所有的抽象方法，此子类一定是抽象类
 */
class Test {
    public static void main(String[] args) {
        Student student = new Student("aaaa");
        System.out.println(student.name);
        student.say();

    }
}

public abstract class Person {
    int age;

    public void  say(){
        System.out.println("abstract class Person");
    }

    public abstract void Hi();

}

class Student extends Person {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void Hi() {
        this.say();
    }
}


