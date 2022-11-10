package com.example;

import java.util.*;
public class ShapeTest {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle("Triangle", 3, 4, 5);
        Triangle triangle2 = new Triangle("Triangle", 4, 7, 5);

        Circle circle1 = new Circle("Circle", 3);
        Circle circle2 = new Circle("Circle", 5);

        Rectangle rectangle1 = new Rectangle("Rectangle", 7, 5);
        Rectangle rectangle2 = new Rectangle("Rectangle", 10, 3);

        Hexagon hexagon1 = new Hexagon("Hexagon", 5);
        Hexagon hexagon2 = new Hexagon("Hexagon", 6);

        Shapes<Shape> shapes = new Shapes<Shape>();
        shapes.add(triangle1);
        shapes.add(triangle2);
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(rectangle1);
        shapes.add(rectangle2);
        shapes.add(hexagon1);
        shapes.add(hexagon2);


        Thread thread = new Thread(shapes);
        thread.start();
		
		try {
			thread.join();
		}catch(Exception e) {
			System.out.println(e);
		}

        System.out.println();
		System.out.println("Shape with biggest area: " + shapes.max().toString());
        System.out.println();
		System.out.println("Shape with smallest area: " + shapes.min().toString());
    }
}
