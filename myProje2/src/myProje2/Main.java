package myProje2;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		BMItest str2 = new BMItest();
		BMI Bmi = new BMI();
		while(true) 
		{
			int age;
			System.out.println("Please enter your age: ");
			age = input.nextInt();
			if(age < 20) 
			{
				System.out.println("Age cannot be less than 20.");
			}
			else 
			{
				break;
			}		
		}// end of while loop
		double weight, height, bmi;
		System.out.print("Enter weight in pounds: ");
		weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		height = input.nextDouble();
		//calculation bmi	
		bmi = Bmi.calculateBMI(weight, height);		
		System.out.print("BMI is " + bmi);
		System.out.println();
		//print result
		String result = str2.interpretBMI(bmi);
		System.out.println(result);	
		
	}// main sonu
	
}// Main sonu