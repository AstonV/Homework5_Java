package com.example;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        super();
    }

    public Triangle(String shapeName, double sideA, double sideB, double sideC) {
        super(shapeName);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double computeArea() {
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        NumberFormat formatter = new DecimalFormat("#0.00");
        return Double.parseDouble(formatter.format(Math.sqrt(halfPerimeter * (halfPerimeter - sideA)
                * (halfPerimeter - sideB) * (halfPerimeter - sideC))));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
