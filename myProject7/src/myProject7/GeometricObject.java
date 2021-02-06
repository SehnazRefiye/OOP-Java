package myProject7;

import java.util.Date;

public abstract class GeometricObject 
{
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	public GeometricObject()
	{
		dateCreated = new java.util.Date();
	}
	
	public GeometricObject(String color, boolean filled, Date dateCreated) 
	{
		this.color = color;
		this.filled = filled;
		dateCreated = new java.util.Date();
	}

	public String getColor() 
	{
		return color;
	}

	public boolean isFilled() 
	{
		return filled;
	}

	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public void setFilled(boolean filled) 
	{
		this.filled = filled;
	}

	public String toString()
	{
		return "GeometricObject [color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + "]";
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
}
