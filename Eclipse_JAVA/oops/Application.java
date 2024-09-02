package oops;

import java.util.Scanner;

public class Application 
{
	public static void main(String[] args) 
	{
		savingsAccount obj=new savingsAccount(1234,"AAAA",10000,5.2);
		obj.setaccountnumber();
		if(obj.getaccountnumber()>5)
		{
			obj.setaccountholder();
		}
		System.out.println("-----------------Savings Account Details-----------------");
		System.out.println("Account Holdername        ="+obj.getaccountholder());
		System.out.println("Account Number            ="+obj.getaccountnumber());
		System.out.println("Total Balance             ="+obj.getbalance());
		System.out.println("Intrest amount            ="+obj.interest());
		System.out.println("Calculated interest amount="+obj.balance());
		obj.deposit(1000);
		obj.withdraw(200);
		
	}

}
abstract class bank
{
	private  int  accountnumber;
	private String accountholder;
	private  double balance;
	bank(int accountnumber,String accountholder,int balance)
	{
		this.accountnumber=accountnumber;
		this.accountholder=accountholder;
		this.balance=balance;
	}
	public int getaccountnumber()
	{
		return accountnumber;
	}
	public void setaccountnumber()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter pin:");
		int pin=s.nextInt();
		s.close();
		if(accountnumber==pin)
			this.accountnumber=652345654;
		else
			System.out.println("Invalid PIN");
	}
	public String getaccountholder()
	{
		return accountholder;
	}
	public void setaccountholder()
	{
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter accountholdername=");
	   String name=s.next();
	   s.close();
	   this.accountholder=name;
	}
	public double getbalance()
	{
		return balance;
	}
	public void withdraw(int amount)
	{
		if(balance>amount)
		{
			balance-=amount;
			System.out.println("withdraw ammount="+amount);
			System.out.println("Currect balance="+this.balance);
		}
		
		else
			System.out.println("Insufficient ammount");
	}
	public void deposit(int dep_amount)
	{
		balance+=dep_amount;
		System.out.println("Deposited ammount="+dep_amount);
		System.out.println("Current Balance="+this.balance);
	}
	public abstract double balance();
	
}
class savingsAccount extends bank
{
    private double interestRate;
	savingsAccount(int accountnumber, String accountholder, int balance,double interestRate)
	{
		super(accountnumber, accountholder, balance);
		 this.interestRate=interestRate;	
	}
	public double interest()
	{
		double interest = (getbalance() * interestRate )/ 100;
		return interest;
	}	
	@Override
	public double balance()
	{
		double total=super.getbalance()+interest();
		return total;
	}
}
	

