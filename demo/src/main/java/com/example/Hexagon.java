package com.example;

public class Hexagon extends Shape{
    // data field
    private double side;

    // constructor
    Hexagon(String type, double side) {
        super(type);
        this.side = side;
    }

    // getters and setters
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double computeArea() {
        setArea(3 * Math.sqrt(3) * Math.pow(getSide(), 2) / 2);
        return getArea();
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\nSide of the hexagon: " + getSide() + "\nArea of the hexagon: " + computeArea();
    }
}
