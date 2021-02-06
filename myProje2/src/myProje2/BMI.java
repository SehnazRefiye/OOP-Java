package myProje2;

public class BMI 
{
	public double calculateBMI(double weight, double height)
	{
		double calculateBMI;
		calculateBMI = (weight * 0.45359237) / ((height * 0.0254) * (height * 0.0254));
		return calculateBMI;
	}
}