package myProje5;

import java.util.Scanner;

public class ATM  
{
	public ATM() 
	{
		Account[] account = new Account[10];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 10; i++)
		{
			account[i] = new Account();
			account[i].setBalance(100);
			account[i].setId(i+1);
		}
		while(true) 
		{
			
			System.out.println("Enter an id: ");
			int id = scan.nextInt();
			
			for(int i = 0; i < 10; i++)
			{
				if(id == account[i].getId()) 
				{
					while(true) 
					{
						System.out.println("Main menu");
						System.out.println("1: check balance");
						System.out.println("2: withdraw");
						System.out.println("3: deposit");
						System.out.println("4: exit");
						System.out.println("Enter a choice: ");
						int choice = scan.nextInt();
						
						if(choice == 4) 
						{
						System.out.println("Exited. ");
						break;
						}
							
						switch(choice)
						{
							case 1:
							System.out.println("The balance is: " + account[id].getBalance());
							break;
							
							case 2:
							System.out.println("Enter an amount to withdraw: ");
							int withdraw = scan.nextInt();
							if(withdraw < account[id].getBalance())
							{
								account[id].withdraw(withdraw);
							}
							else 
							{
								System.out.println("The amount you enter is less than your balance.");
							}
							break;
							
							case 3:
							System.out.println("Enter an amount to deposit: ");
							int deposit = scan.nextInt();
							account[id].deposit(deposit);
							break;
						}// end of switch case
					}
				}
			}// end of for
		}// end of while 1
	}
}