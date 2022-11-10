package com.example;

import java.lang.*;

public abstract class Shape implements Runnable {
	// data field
	private String type;
	private double area;

	// constructor
	public Shape(String type) {
		this.type = type;
	}

	// getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double computeArea() {
		return getArea();
	}

	public void run() {
		System.out.println(getType() + "\nArea: " + computeArea() + "\n");
	}

	@Override
	public String toString(){
		return getType();
	}
}
