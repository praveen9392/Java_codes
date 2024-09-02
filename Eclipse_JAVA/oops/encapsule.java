package oops;

import java.util.Scanner;

public class encapsule
{
	private int password=1234;
	public static void main(String[] args)
	{
	    encapsule obj=new encapsule();
	    obj.setpassword();
	}
	public void setpassword()
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=s.nextInt();
		if(a==password)
		{
			password=123456;
			System.out.println(getpassword());
		}
		else
			System.out.println("Not matches");
	}
	public int getpassword()
	{
		return password;
	}
}
