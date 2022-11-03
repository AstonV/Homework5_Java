package com.example;

import java.io.IOException;
import java.util.ArrayList;

public class ShapeTest {

    public static void main(String[] args) {

        //Ins array
        ArrayList<Shape> objList = new ArrayList<>();

        Shape circle1 = new Circle("Circle", 2);
        Shape circle2 = new Circle("Circle", 3);
        Shape hexagon1 = new Hexagon("Hexagon", 4);
        Shape hexagon2 = new Hexagon("Hexagon", 5);
        Shape rectangle1 = new Rectangle("Rectangle", 6, 7);
        Shape rectangle2 = new Rectangle("Rectangle", 8, 9);
        Shape triangle1 = new Triangle("Triangle", 1, 2, 3);
        Shape triangle2 = new Triangle("Triangle", 4, 5, 6);


        // Add, Remove objects
        objList.add(circle1);
        objList.add(circle2);
        objList.add(hexagon1);
        objList.add(hexagon2);
        objList.add(rectangle1);
        objList.add(rectangle2);
        objList.add(triangle1);
        objList.add(triangle2);
        Shapes shapesList = new Shapes(objList);

        //Ex 1
        for (int i = 0; i < 16; i++) {
            new Thread() {
                public void run() {
                    {
                        try {
                            Thread.sleep(100);
                            shapesList.compute();
                        } catch (Exception ex) {
                            System.out.println(ex);
                        }
                    }
                }
            }.start();

        }
        //Ex2
        System.out.println("Ex2");
        System.out.println("Max area | " + shapesList.max());
        System.out.println("Min area | " + shapesList.min());
        System.out.println("<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3");

    }
}
