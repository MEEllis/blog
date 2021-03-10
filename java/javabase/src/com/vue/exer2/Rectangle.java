package com.vue.exer2;

public class Rectangle extends GeometryObject {

    private double width;
    private double height;

    public Rectangle(double width, double height, String color, double weight) {
        super(color, weight);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return this.width * this.height;
    }
}
