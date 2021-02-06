package myProject7;

public class Rectangle extends GeometricObject
{
	
	public Rectangle(String color, boolean filled, java.util.Date dateCreated) 
	{
		super(color, filled, dateCreated);
	}
	
	private double width;
	private double height;
	
	public Rectangle()
	{
		
	}

	public Rectangle(double width, double height) 
	{
		this.width = width;
		this.height = height;
	}

	public double getWidth()
	{
		return width;
	}

	public double getHeight()
	{
		return height;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}

	public void setHeight(double height) 
	{
		this.height = height;
	}
	
	public double getArea() 
	{
	    return width * height;
	}
	
	public double getPerimeter()
	{
		return 2 * (width + height);
	}
	
	public String toString()
	{
		return "[Rectangle] created on " + getDateCreated() +
			      "\ncolor: " + getColor() + " and filled: " + isFilled() + 
			      "\nwidth = " + width + " height = " + height + 
			      "\nArea of object is " + getArea();
	}
}