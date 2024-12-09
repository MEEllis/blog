package com.vue.exerInterface;

//interface的应用: 简单工厂
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Car carA = CarFactory.getCar("Byd");
        Car carB = CarFactory.getCar("Audi");
    }
}


class CarFactory {
    public static Car getCar(String sign) {
        if (sign.equals("Byd")) {
            return new Byd();
        } else {
            return new Audi();
        }
    }
}

interface Car {
    public abstract void run();
}

class Byd implements Car {

    @Override
    public void run() {
        System.out.println("Byd run ....");
    }
}

class Audi implements Car {

    @Override
    public void run() {
        System.out.println("Audi run ....");
    }
}