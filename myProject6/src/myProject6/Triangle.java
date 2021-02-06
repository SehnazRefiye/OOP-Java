package myProject6;

public class Triangle extends GeometricObject
{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle()
	{
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	public Triangle(String color, boolean filled, double side1, double side2, double side3) 
	{
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1()
	{
		return side1;
	}
	public double getSide2() 
	{
		return side2;
	}
	public double getSide3()
	{
		return side3;
	}
	
	public double getArea(double side1, double side2, double side3)
	{
		double s = 0, area, result;
		s = (side1 + side2 + side3) / 2;
		area = s * (s - side1) * (s - side2) * (s - side3);
		result = Math.sqrt(area);
		return result;
	}
	
	public double getPerimeter(double side1, double side2, double side3)
	{
		double sum = 0;
		sum = side1 + side2 + side3;
		return sum;
	}

	public String toString() 
	{
		return "TRIANGLE CLASS: Triangle: side1 = " + getSide1() + " side2 = " + getSide2() + " side3 = " + getSide3() + 
				"\nThe area is: " + getArea(side1, side2, side3) + "\nThe perimeter is: " + getPerimeter(side1, side2, side3) + 
				"\nGEOMETRIC OBJECT CLASS: created on " + getDateCreated() + "\ncolor: " + getColor() + " and filled: " + isFilled();
	}
}