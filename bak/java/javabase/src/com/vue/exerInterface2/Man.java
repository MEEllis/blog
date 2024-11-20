package com.vue.exerInterface2;


interface Filial{
    public default void help(){
        System.out.println("妈妈。我来救你！");
    }
}

interface Spoony{
    public default void help(){
        System.out.println("老婆 。我来救你！");
    }
}

public class Man implements Filial,Spoony {
    @Override
    public void help() {
        Filial.super.help();
    }
}


class Test{
    public static void main(String[] args) {
        new Man().help();
    }
}