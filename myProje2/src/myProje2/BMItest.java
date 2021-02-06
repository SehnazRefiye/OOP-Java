package myProje2;

public class BMItest 
{
	public  String interpretBMI(double BMI)
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
