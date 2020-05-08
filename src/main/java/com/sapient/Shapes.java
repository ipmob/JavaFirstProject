package com.sapient;


class Circle {
	public static void calculateArea(int radius) {

		double area = 3.14 * (double)(radius * radius);
		System.out.println("Circle area is " + area);
	}
}

class Triangle {
	public static void calculateArea(int side) {
		double area = 0.433 * (double)(side * side);
		System.out.println("Triangle area is " + area);
	}
}

class Square {
	public static void calculateArea(int side) {

		double area = (double)(side * side);
		System.out.println("Square area is " + area);
	}
}

public class Shapes {
	public Shapes() {
		int numberOfSides;
	}

	public void calculateShapeArea(int numberOfSides, int sideLenght) {

		if (numberOfSides == 1) {
			Circle.calculateArea(sideLenght);

		} else if (numberOfSides == 3) {
			Triangle.calculateArea(sideLenght);

		} else if (numberOfSides == 4) {
			Square.calculateArea(sideLenght);

		} else {
			System.out.println("No Shapes present");
		}
	}
}
