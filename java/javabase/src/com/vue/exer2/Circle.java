package com.vue.exer2;

public class Circle extends GeometryObject {

    private double radius;

    public Circle(double radius,String color, double weight) {
        super(color, weight);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea(){
        return Math.PI*this.radius*this.radius;
    }
}
