import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		Scanner giris = new Scanner(System.in);
		System.out.println("Please enter a color");
		String color = giris.next();
		System.out.println("Please enter a filled");
		boolean filled = giris.nextBoolean();
		System.out.println("Please enter three sides");
		double side1 = giris.nextDouble();
		double side2 = giris.nextDouble();
		double side3 = giris.nextDouble();
		
		Triangle tri = new Triangle(color, filled, side1, side2, side3);
		System.out.println(tri.toString());	
		
		
		System.out.println("----------OUTPUT OF POLIMORPHISM EXAMPLE-------------- \n");
		GeometricObject obj = new Triangle(color, filled, side1, side2, side3);
		System.out.println(obj.toString());	
		
		
		// toString() method is invokes the Triangle's toString() method. In Triangle's toString method invokes the GeometricObject's toStrin() method. 
		// In conclusion, toString() method in the last line invokes Triangle's toString() method.
	}
}
