package deneme;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		/*
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		int inputNumber = scan.nextInt();
		for(int i=0; i<inputNumber; i++) 
		{
			for(int j=0; j<i; j++) 
			{
				System.out.print(" ");
			}
			for(int j=0; j<=3; j++) 
			{
				System.out.print(i+1);
			}
			System.out.println();
		}// ilk for döngüsünün sonu
		*/
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(99)+1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz: ");
		int userNumber = scan.nextInt();
		int attempt = 1;
		while(randomNumber != userNumber) 
		{
			if(userNumber < randomNumber) 
			{
				System.out.println("Daha büyük bir sayý giriniz: ");
			}
			else if(userNumber > randomNumber)
			{
				System.out.println("Küçük sayý girin: ");
			}
			userNumber = scan.nextInt();
			attempt ++;
		}
		System.out.println("You guessed after " + attempt + " attemps.");
	}
}
