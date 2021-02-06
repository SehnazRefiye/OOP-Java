package myProje3;

public class BMItest
{
	public static void main(String[] args) 
	{
		BMI myObj = new BMI();
		BMI myObj1 = new BMI(215,70,"Sara King");
		BMI myObj2 = new BMI(145,70,"Kim Young",18);

		System.out.println("The BMI for " + myObj.getName() + " is " + myObj.getBMI() + " " + myObj.getStatus(myObj.getBMI()));
		System.out.println("The BMI for " + myObj1.getName() + " is " + myObj1.getBMI() + " " + myObj1.getStatus(myObj1.getBMI()));
		System.out.println("The BMI for " + myObj2.getName() + " is " + myObj2.getBMI() + " " + myObj2.getStatus(myObj2.getBMI()));
	}
}