package chapter_IV;
import java.util.Scanner;
public class Question1 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int start=s.nextInt(),a=s.nextInt();
		for(int i=start;i<=a;i++)
		{
		   fact(i);
		}
	}
	static void fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println("factorial of a number is "+n+"=" +fact);
	}

}
