package Hello.World;

import java.util.Scanner;

class Shape {
	public void area(String shape) {
		switch (shape) {
			case "square":
					Square sq = new Square();
					sq.area(2);
					break;
			case "circle":
				Circle cir = new Circle();
				cir.area(3);
				break;
			case "rectangle":
				Rectangle rec = new Rectangle();
				rec.area(5,6);
				break;
			case "triangle":
				Triangle tri = new Triangle();
				tri.area(5, 10);
				break;
			default:
				System.out.println("Invalid Shape");
		}
	}
}

class Square extends Shape {
	public void area(int side) {
		int area = side * side;
		System.out.println("Area of Square: " + area);
	}
}

class Circle extends Shape {
	public void area(int radius) {
		double area = (Math.PI) * radius * radius;
		System.out.println("Area of Circle: " + area);
	}
}
class Rectangle extends Shape{
	public void area(int lenght, int breadth) {
		int area = lenght * breadth;
		System.out.println("Area of Rectangle: "+ area);
	}
}
class Triangle extends Shape {
	public void area(int base, int height) {
		int area = ( base * height) / 2;
		System.out.println("Area of Triangle: " + area);
	}
}

public class assignment_9 {
	public static void main(String[] args) {
		Shape obj = new Shape();
		System.out.println("Enter the object shape: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if(input.equalsIgnoreCase("square")) {
			obj.area("square");}
		if(input.equalsIgnoreCase("circle")) {
			obj.area("circle");}
		if(input.equalsIgnoreCase("rectangle")) {
			obj.area("rectangle");
		}
		if(input.equalsIgnoreCase("triangle")) {
			obj.area("triangle");}
	}
}
