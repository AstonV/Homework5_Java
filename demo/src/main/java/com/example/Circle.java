package com.example;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        super();
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        return Double.parseDouble(formatter.format(Math.PI * radius * radius));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}