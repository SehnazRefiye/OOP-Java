package midterm;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Circle myCircle = new Circle(1);
		System.out.println("Please enter n value: ");
		int n = scan.nextInt();
		
		System.out.printf("\n" + myCircle.getNumberOfObjects() + " circle(s) has/have been created. Total area within table is: 4%.2f", print(myCircle, n)); 
	}
	public static double print(Circle circle, int times)
	{ 
		double totalArea = 0;
		System.out.println("Radius \t\tArea");
		while (times >= 1) 
		{
			System.out.println(circle.getRadius() + "\t\t"+ circle.getArea()); 
			totalArea += circle.getArea(); // toplam alaný bulmak için 
			circle.setRadius(circle.getRadius() + 1); // radius deðerini birer birer arttýrmak için 
			times--;
		}
		return totalArea; 
	}
}
