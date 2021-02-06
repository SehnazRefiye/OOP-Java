import java.lang.Math;
public class Triangle extends GeometricObject 
{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle()
	{
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
	public Triangle(String color, boolean filled, double side1 , double side2 , double side3)
	{
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getside1()
	{
		return side1;
	}
	public void setside1(double side1)
	{
		this.side1 = side1;
	}
	public double getside2()
	{
		return side2;
	}
	public void setside2(double side2)
	{
		this.side2 = side2;
	}
	public double getside3()
	{
		return side3;
	}
	public void setside3(double side3)
	{
		this.side3 = side3;
	}
	public double getArea()
	{
		double s = (this.side1 + this.side2 + this.side3)/2;
		double Area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return Area;
	}
	public double getPerimeter()
	{	  
		return (this.side1 + this.side2 + this.side3);
	}
	
	public String toString()
	{
		
		return super.toString() + "\n\nTRIANGULAR CLASS:\nside1: "+getside1()+", side2: "+getside2()+",side3: "+getside3() +",Area: "+ getArea() + ",Perimeter "+ getPerimeter();
	}
	
}
