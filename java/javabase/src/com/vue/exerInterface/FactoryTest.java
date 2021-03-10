package com.vue.exerInterface;

//interface的应用: 工厂模式
public class FactoryTest {
    public static void main(String[] args) {
        Ccar carA =new ByddFactory().getCar();
        Ccar carB =new AudiiFactory().getCar();
    }
}


interface Factory {
    public abstract Ccar getCar();
}

class ByddFactory implements Factory{

    @Override
    public Ccar getCar() {
        return new Bydd();
    }
}

class AudiiFactory implements Factory{

    @Override
    public Ccar getCar() {
        return new Audii();
    }
}




interface Ccar {
    public abstract void run();
}

class Bydd implements Ccar {

    @Override
    public void run() {
        System.out.println("Bydd run ....");
    }
}

class Audii implements Ccar {

    @Override
    public void run() {
        System.out.println("Audii run ....");
    }
}