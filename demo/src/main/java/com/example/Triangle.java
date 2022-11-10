package com.example;

public class Triangle extends Shape{
    // data field
    private double side1, side2, side3;

    // constructor
    Triangle(String type, double side1, double side2, double side3) {
        super(type);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // getters and setters
    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // compute area
    @Override
    public double computeArea() {
        double halfPerimeter = (getSide1() + getSide2() + getSide3()) / 2;
        setArea(Math.sqrt(halfPerimeter * (halfPerimeter - getSide1()) * (halfPerimeter - getSide2()) * (halfPerimeter - getSide3())));
        return getArea();
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\nLengths of the triangle are: " + getSide1() + ", " + getSide2() + ", " + getSide3() + "\nArea of the triangle: " + computeArea(); 
    }
}
