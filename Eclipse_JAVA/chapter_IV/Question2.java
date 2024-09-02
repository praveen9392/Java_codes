package chapter_IV;
import java.util.Scanner;
public class Question2 
{
	public static void main(String[] args) 
	{
		Question2 Q=new Question2();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter start number:");
		int a=s.nextInt();
		System.out.print("Enter end number:");
		int n=s.nextInt();
		for(int i=a;i<=n;i++)
		{
			Q.factors(i);
		}

	}
	void factors(int n)
	{   
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		System.out.println("Factor of a numeber "+n+" is = "+count);
	}

}
