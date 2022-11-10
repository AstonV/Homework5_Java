package com.example;

public class Circle extends Shape{
    // data field
    private double radius;

    // constructor
    Circle(String type, double radius) {
        super(type);
        this.radius = radius;
    }

    // getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        setArea(Math.pow(getRadius(), 2) * Math.PI);
        return getArea();
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\nRadius of the circle: " + getRadius() + "\nArea of the circle: " + computeArea();
    }
}