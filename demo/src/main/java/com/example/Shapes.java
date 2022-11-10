package com.example;

import java.lang.*;
import java.util.*;

public class Shapes<T extends Shape> extends Thread{
    // data field
    private ArrayList<T> shapeList;

    // constructor
    public Shapes() {
        this.shapeList = new ArrayList<>();
    }
    public Shapes(ArrayList<T> shapeList) {
        this.shapeList = shapeList;
    }

    // getters and setters
    public ArrayList<T> getShapeList() {
        return shapeList;
    }

    public void setShapeList(ArrayList<T> shapeList) {
        this.shapeList = shapeList;
    }

    // add method
    public void add(T shape) {
        this.shapeList.add(shape);
    }

    // remove method
    public void remove(T shape) {
        this.shapeList.remove(shape);
    }

    synchronized public void compute() {
        for (T shape: shapeList) {
            Thread thread = new Thread(shape);
            thread.start();
            // System.out.println(shape.toString());
        }
    }

    public void run() {
		try {
			this.compute();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

    // max method
    public Shape max() {
        Shape max = shapeList.get(0);
        for (int i = 1; i < shapeList.size(); i++) {
            if (shapeList.get(i).getArea() > max.getArea()) {
                max = shapeList.get(i);
            }
        }
        return max;
    }

    // min method
    public Shape min() {
        Shape min = shapeList.get(0);
        for (int i = 1; i < shapeList.size(); i++) {
            if (shapeList.get(i).getArea() < min.getArea()) {
                min = shapeList.get(i);
            }
        }
        return min;
    }

}
