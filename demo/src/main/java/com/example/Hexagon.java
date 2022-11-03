package com.example;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Hexagon extends Shape {
    private double side;

    public Hexagon() {
        super();
    }

    public Hexagon(String shapeName, double side) {
        super(shapeName);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double computeArea() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        return Double.parseDouble(formatter.format(side * side * 3 * Math.sqrt(3) / 2));
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "side=" + side +
                '}';
    }
}
