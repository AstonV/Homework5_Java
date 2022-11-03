package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Shapes {

    private ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public Shapes() {
        super();
    }

    public Shapes(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

    public void setShapeList(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public boolean add(Shape shape) {
        return shapeList.add(shape);
    }

    public boolean remove(Shape shape) {
        return shapeList.remove(shape);
    }

    public void compute() {
        synchronized (shapeList) {
            for (Shape shape : shapeList) {
                try {
                    System.out.println("Thread " + Thread.currentThread().getId() +
                            " | Shape: " + shape.getShapeName() +
                            ", area: " + shape.computeArea());
                } catch (NullPointerException e) {
                    System.out.println(e);
                }
            }
        }
    }

//   start ex2
    public Shape max() {
        Comparator<Shape> maxComparator = new Comparator<Shape>() {
            public int compare(Shape o1, Shape o2) {
                return Double.compare(o1.computeArea(), o2.computeArea());
            }
        };
        return Collections.max(shapeList, maxComparator);
    }

    public Shape min() {
        Comparator<Shape> minComparator = new Comparator<Shape>() {
            public int compare(Shape o1, Shape o2) {
                return Double.compare(o1.computeArea(), o2.computeArea());
            }
        };
        return Collections.min(shapeList, minComparator);
    }
//end ex2

}
