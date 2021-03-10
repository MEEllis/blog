package com.vue.exer2;

public class GeometryObject {
    protected String color;
    protected double weight;

    public GeometryObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea() {
        return 0;
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof GeometryObject) {
            GeometryObject other = (GeometryObject) anObject;
            if (other.color.equals(this.color)  && other.weight == this.weight) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
