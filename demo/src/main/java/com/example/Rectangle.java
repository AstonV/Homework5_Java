package com.example;

public class Rectangle extends Shape{
    // data field
    private double width, height;

    // constructor
    Rectangle(String type, double width, double height) {
        super(type);
        this.height = height;
        this.width = width;
    }

    // getters and setters
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
    public double computeArea() {
        setArea(getHeight() * getWidth());
        return getArea();
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\nWidth and height of the rectangle: " + getWidth() + ", " + getHeight() + "\nArea of the rectangle: " + computeArea();
    }
}