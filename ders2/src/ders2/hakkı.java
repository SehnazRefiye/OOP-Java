package ders2;

import java.util.Scanner;

public class hakk�
{
	public static void main(String[] args)
	{
		String str = "Hakk� hakk�n�n hakk�n� yemi�. Hakk� hakk�dan hakk�n� istemi�. Hakk� hakk�ya hakk�n� vermeyince hakk� da hakk�n�n hakk�ndan gelmi�.";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter old word: ");
		String oldWord = scan.next();
		System.out.println("Enter new word: ");
		String newWord = scan.next();
		String[]words = str.split(" ");
		for(int i=0; i<words.length; i++) 
		{
			if(oldWord.equalsIgnoreCase(words[i])) 
			{
				words[i] = newWord;
			}
		}
		for(int i=0; i<words.length; i++) 
		{
			System.out.print(words[i] + " ");
		}

	}// end of main 

}// end of hakk�
