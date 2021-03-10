package com.vue.exerInterface1;

public class CompareCircle extends Circle implements CompareObject{
    public CompareCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if(this==o){
            return 0;
        }
        if(o instanceof CompareCircle){
            CompareCircle  compareB=(CompareCircle) o;
            if(this.getRadius()>compareB.getRadius()){
                return 1;
            }else{
                return -1;
            }
        }else{
            //抛出一个 异常
            throw   new RuntimeException("输入的类型不匹配");
        }
    }
}
