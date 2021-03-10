package com.vue.exerInterface;

public class Exer1 {
}

interface A {
    int x = 0;
}

class B {
    int x = 1;
}
class  C extends B implements A{
    public void px(){
        //System.out.println(x);  //编译报错对x的引用不明确
        System.out.println(super.x);
        System.out.println(A.x);
    }

    public static void main(String[] args) {
        new C().px();
    }
}