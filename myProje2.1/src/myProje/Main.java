package myProje;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("---------------MENU---------------");
		
		System.out.println("1- Calculate BMI ");
		System.out.println("2- Exit ");
		
		System.out.println("----------------------------------");
		
		int selection;
		Scanner input = new Scanner(System.in);
		
		while(true) 
		{			
			System.out.println("Your option? ");
			selection = input.nextInt();
			if (selection == 2)
			{
				System.out.printf("Exited.\n");
				break;
			}
			
			else 
			{
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
				}// end of while second loop
				double weight, height, BMI;
				System.out.print("Enter weight in pounds: ");
				weight = input.nextDouble();
				System.out.print("Enter height in inches: ");
				height = input.nextDouble();
				//calculation BMI	
				BMI = (weight * 0.45359237) / ((height * 0.0254) * (height * 0.0254));
				System.out.print("BMI is " + BMI);
				System.out.print("\n");
				if (BMI < 18.5)
				{ 
					System.out.print("Underwight \n");
				}
				else if (18.5 <= BMI && 25.0 >= BMI) 
				{
					System.out.print("Normal \n");
				}
				else if (25.0 <= BMI && 30.0 >= BMI)
				{
					System.out.print("Overweight \n");
				}
				else 
				{
					System.out.print("Obese \n");
				}
				System.out.print("\n");
			}
			
		}// end of first while loop
		
	}// main sonu
	
}//Main sonu