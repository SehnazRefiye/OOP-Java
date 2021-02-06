package myProject7;

public class Circle extends GeometricObject
{
	
	public Circle(String color, boolean filled, java.util.Date dateCreated) 
	{
		super(color, filled, dateCreated);
	}
	
	private double radius;
	
	public Circle()
	{
		
	}
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius() 
	{
		return radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getArea() 
	{
		return radius * radius * Math.PI;
	}
	
	public double getPerimeter() 
	{
		return 2 * radius * Math.PI;
	}
	
	public String toString()
	{
	    return "[Circle] created on " + getDateCreated() +
	      "\ncolor: " + getColor() + " and filled: " + isFilled() + 
	      "\nradius = " + radius + 
	      "\nArea of object is " + getArea();
	}
}