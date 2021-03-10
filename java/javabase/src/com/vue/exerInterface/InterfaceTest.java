package com.vue.exerInterface;

public class InterfaceTest {
    public static void main(String[] args) {
        PlaneA flyable = new PlaneA();
        flyable.stop();
        System.out.println(flyable.MAX);
    }
}


interface Flyable{
    final int MAX=1;
    void stop();
}

class PlaneA implements Flyable{

    @Override
    public void stop() {
        System.out.println("Plane");
    }
}
 abstract class PlaneB  implements Flyable{

 }


 class PlaneC  extends PlaneB{

     @Override
     public void stop() {

     }
 }