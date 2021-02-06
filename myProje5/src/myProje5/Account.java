package myProje5;

import java.util.Date;

public class Account 
{
	private int id;
	private double balance;
	private Date dateCreated;
	
	public Account()
	{
		id = 0;
		balance = 0;
	}
	
	public Account(int id, double balance, Date dateCreated)
	{
		this.id = id;
		this.balance = balance;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	
	public void withdraw(double amount)
	{
		this.balance -= amount;
	}
	
	public void deposit(double amount)
	{
		this.balance += amount;
	}
}