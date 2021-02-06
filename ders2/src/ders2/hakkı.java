package ders2;

import java.util.Scanner;

public class hakký
{
	public static void main(String[] args)
	{
		String str = "Hakký hakkýnýn hakkýný yemiþ. Hakký hakkýdan hakkýný istemiþ. Hakký hakkýya hakkýný vermeyince hakký da hakkýnýn hakkýndan gelmiþ.";
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

}// end of hakký
