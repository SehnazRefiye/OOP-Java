package matrix;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		int[][] sparse = {{6,6,8}, {0,0,15}, {0,3,22}, {0,5,-15}, {1,1,11}, {1,2,3}, {2,3,-6}, {4,0,9}, {5,2,28}};
		
		/*
		// sparse matrix 
		int[][] realMatrix = new int [sparse[0][0]] [sparse[0][1]];
		for(int i = 1; i <= sparse[0][2]; i++)
		{
			realMatrix[sparse[i][0]] [sparse[i][1]] = sparse[i][2];
		}
		// print real matrix
		for(int i = 0; i < realMatrix.length; i++) 
		{
			for(int j = 0; j < realMatrix[0].length; j++)
			{
				System.out.print(realMatrix[i][j] + "\t");
			}
			System.out.println();
		}
		*/

		//zero-one matrix
		boolean flag = true;
		for (int i=1; i<sparse.length; i++)
		{
			if((sparse[i][2] != 0 && sparse[i][2] != 1))
			{
				flag = false;
				break;
			}
		}
		System.out.println(flag);
		
		
	}// end of main 
	
}// end of Main 
