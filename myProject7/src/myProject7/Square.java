package myProject7;

public class Square extends GeometricObject implements Colorable
{
	public Square(String color, boolean filled, java.util.Date dateCreated) 
	{
		super(color, filled, dateCreated);
	}
	
	private double side;
	
	public Square()
	{
		
	}
	
	public Square(double side)
	{
		this.side = side;
	}

	public double getSide() 
	{
		return side;
	}

	public void setSide(double side)
	{
		this.side = side;
	}
	
	public double getArea() 
	{
		return side * side;
	}
	
	public double getPerimeter() 
	{
		return 4 * side;
	}
	
	public String toString() 
	{
	    return "[Square] created on " + getDateCreated() +
	      "\ncolor: " + getColor() + " and filled: " + isFilled() + 
	      "\nside = " + side + 
	      "\nArea of object is " + getArea();
	}
	
	public void howToColor()
	{
		System.out.println("Color all four sides. ");
	}
}