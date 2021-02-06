package myProje3;

public class BMI 
{
	private String name;
	private int age;
	private double weight;
	private double height;
	
	public static final double KILOGRAM_PER_POUNDS = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;
	
	public BMI()
	{
		name = "John Black";
		age = 25;
		weight = 100;
		height = 50;
	}
	
	public BMI(double newWeight, double newHeight, String newName)
	{
		weight = newWeight;
		height = newHeight;
		name = newName;
		setAge(20);
	}
	
	public BMI(double newWeight, double newHeight, String newName, int newAge)
	{
		weight = newWeight;
		height = newHeight;
		name = newName;
		age = newAge;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String x) {
		x = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int y) {
		y = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double z) {
		z = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double t) {
		t = height;
	}
	
	double getBMI() 
	{
		double BMI;
		BMI = (weight * KILOGRAM_PER_POUNDS) / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
		BMI = (double)Math.round(BMI * 100) / 100;
		return BMI;
	}
	
	String getStatus(double BMI)
	{
		
		String str = null;
		if (BMI < 18.5)
		{ 
			str = "Underweight";
		}
		else if (18.5 <= BMI && 25.0 >= BMI) 
		{
			str = "Normal";
		}
		else if (25.0 <= BMI && 30.0 >= BMI)
		{
			str = "Overweight";
		}
		else 
		{
			str = "Obese";
		}
		return str;
	}
}
