import java.util.Calendar;
import java.util.Date;
public class GeometricObject 
{
	private String color="white";
	private boolean filled = true;
    private Date dateCreated;
	
	public GeometricObject(){
		setDate(Calendar. getInstance(). getTime());
	}
	
	public GeometricObject(String color, boolean filled) {
		setDate(Calendar. getInstance(). getTime());
		setColor(color);
		setFilled(filled);
	}
	
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public boolean getFilled()
	{
		return filled;
	}
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	public Date getDate()
	{
		return dateCreated;
	}
	public void setDate(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public String toString()
	{
		return "GEOMETRIC OBJECT CLASS: created on " + getDate() + "\ncolor: " + getColor() + " and filled: " + getFilled();
	}
	
}
