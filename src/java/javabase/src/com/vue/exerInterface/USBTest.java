package com.vue.exerInterface;
//interface 的多态
public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.transferData(new Flash());
    }
}

class Computer{
    public  void  transferData(USB usb){
        usb.start();
        usb.stop();
    }
}


interface USB {
    public abstract void start();

    public abstract void stop();
}

class Flash implements USB {

    @Override
    public void start() {
        System.out.println("Flash start.....");
    }

    @Override
    public void stop() {
        System.out.println("Flash stop.....");
    }
}

class Printer implements USB {

    @Override
    public void start() {
        System.out.println("Printer start.....");
    }

    @Override
    public void stop() {
        System.out.println("Printer stop.....");
    }
}