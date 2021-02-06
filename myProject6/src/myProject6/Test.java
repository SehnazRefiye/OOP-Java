package myProject6;

import java.util.Scanner;
import java.util.Date;

public class Test 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter three sides: ");
		double side1 = scan.nextDouble();
		double side2 = scan.nextDouble();
		double side3 = scan.nextDouble();
		
		System.out.print("Enter the color: ");
		String color = scan.next();
		System.out.print("Enter a boolean value for filled: ");
		boolean filled = scan.nextBoolean();
		
		System.out.println();
		Triangle triangle = new Triangle(color, filled, side1, side2, side3);
		System.out.println(triangle.toString());
		
		System.out.println();
		System.out.println("---------- OUTPUT OF POLIMORPHISM EXAMPLE ----------");
		GeometricObject object = new Triangle(color, filled, side1, side2, side3);
		System.out.println(object.toString());
	}
	// toString()method is invokes the Triangle's toString() method. In Triangle's method invokes the GeometricObject's toString() method.
}