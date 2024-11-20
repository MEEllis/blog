package com.vue.exerInterface1;

public class Test {
    public static void main(String[] args) {
        CompareCircle compareCircleA = new CompareCircle(7.2);
        CompareCircle compareCircleB = new CompareCircle(8.2);
        int flag = compareCircleA.compareTo(compareCircleB);
        if(flag==1){
            System.out.println("compareCircleA更大");
        }else if(flag==-1){
            System.out.println("compareCircleB更大");
        }else if(flag==0){
            System.out.println("compareCircleA与compareCircleB一样大");
        }
    }
}
