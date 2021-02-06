package homework;

import java.util.Scanner;

public class createMatrix 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the number of rows of first matrix: ");
		int firstRow = scan.nextInt();
		
		System.out.println("Enter the number of columns of first matrix: ");
		int firstColumn = scan.nextInt();
		
		System.out.println("Enter the elements of first matrix: ");
		int [][] firstMatrix = new int[firstRow][firstColumn];
		
		//elements of first matrix
		for(int i = 0; i < firstRow; i++)
		{
			for(int j = 0; j < firstColumn; j++)
			{
				firstMatrix[i][j] = scan.nextInt();
			}
		}
		
		// print first matrix 
		System.out.println("Your first matrix is: ");
		for(int i = 0; i < firstRow; i++)
		{
			for(int j = 0; j < firstColumn; j++)
			{
				System.out.print(firstMatrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Enter the number of rows of second matrix: ");
		int secondRow = scan.nextInt();
		
		System.out.println("Enter the number of columns of second matrix: ");
		int secondColumn = scan.nextInt();
		
		System.out.println("Enter the elements of second matrix: ");
		int [][] secondMatrix = new int[secondRow][secondColumn];
		
		//elements of second matrix
		for(int i = 0; i < secondRow; i++)
		{
			for(int j = 0; j < secondColumn; j++)
			{
				secondMatrix[i][j] = scan.nextInt();
			}
		}
		
		// print second matrix 
		System.out.println("Your second matrix is: ");
		for(int i = 0; i < secondRow; i++)
		{
			for(int j = 0; j < secondColumn; j++)
			{
				System.out.print(secondMatrix[i][j] + "\t");
			}
			System.out.println();
		}
		// Check whether the two matrix are suitable for multiplication or not.
		if(firstColumn != secondRow)
		{
			System.out.println("The matrices can't be multiplied with each other.");
		}
		else // calculate multiply matrix
		{
			multiplyTwoMatrix (firstRow, secondRow, secondColumn, firstMatrix, secondMatrix);
		}// end of if-else
		
	}// end of main
	
	public static void multiplyTwoMatrix(int firstRow, int secondRow, int secondColumn, int [][] firstMatrix, int [][] secondMatrix)
	{
		int [][] multiplyMatrix = new int[firstRow][secondColumn];
		System.out.println("Result is: ");
		
		for(int i = 0; i < firstRow; i++)
		{
			for(int j = 0; j < secondColumn; j++)
			{
				multiplyMatrix[i][j] = 0;
				for(int k = 0; k < secondRow; k++)
				{
					multiplyMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				}
				System.out.print(multiplyMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}// end of createMatrix