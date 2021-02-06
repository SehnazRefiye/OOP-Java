package myProje;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int age;
		double salary;
		double tax;
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Please enter age of employee: ");
			age = input.nextInt();
			if (age >= 18 && age <= 95)
			{
				break;
			}
			
			else 
			{
				System.out.printf("The company does not have an employee of this age.\n");
			}
		}
		
		while(true) 
		{
			System.out.println("Please enter salary of employee: ");
			salary = input.nextDouble();
			if(salary > 0)
			{
				break;
			}
			else
			{
				System.out.println("Salary can not be less than 0.");
			}
		}
		
		if (age >= 18 && age <= 35)
		{
			tax = (0.16*17000) + (0.25*(salary-17000)); 
			System.out.printf("Tax is: %g \n", tax);
		}
		else if (age >= 36 && age <= 50) 
		{
			tax = (0.16*23000) + (0.25*(salary-23000));
			System.out.printf("Tax is: %g \n", tax);
		}
		else if (age >= 51 && age <= 74) 
		{
			tax = (0.16*29000) + (0.25*(salary-29000));
			System.out.printf("Tax is: %g \n", tax);
		}
		else if (age >= 75 && age <= 95) 
		{
			tax = (0.16*14000) + (0.25*(salary-14000));
			System.out.printf("Tax is: %g \n", tax);
		}

	}// main sonu

}// Main sonu
