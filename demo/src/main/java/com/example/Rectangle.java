package com.example;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        super();
    }


    public Rectangle(String shapeName, double width, double length) {
        super(shapeName);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double computeArea() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        return Double.parseDouble(formatter.format(width * length));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}