package com.example;

public abstract class Shape {
    private String shapeName;

    public Shape(){
        super();
    }

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double computeArea();

    @Override
    public String toString() {
        return "Shape{" +
                "shapeName='" + shapeName + '\'' +
                '}';
    }
}
