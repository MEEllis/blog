package com.vue.packaging;

/**
 * 懒汉式单例
 */
public class SingletonTest {

    private static SingletonTest instance = null;

    private SingletonTest() {

    }

    public static SingletonTest getInstance() {
        //这里存在多线程安全问题
        if (instance == null) {
            instance = new SingletonTest();
        }
        return instance;
    }

}


/**
 * 饿汉式单例
 */
class SingletonTest1 {

    private static SingletonTest1 instance = new SingletonTest1();

    private SingletonTest1() {

    }

    public static SingletonTest1 getInstance() {
        return instance;
    }

}