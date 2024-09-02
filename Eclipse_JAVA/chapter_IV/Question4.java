package chapter_IV;
import java.util.Scanner;
public class Question4 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:");
		int a=s.nextInt();
		Question4 Q=new Question4();
		Q.rev(a);
	}
	void rev(int n)
	{
		int x=n;
		String b="";
		for(int i=1;i<=x;i++)
		{
			int rem=x%10;
			b+=rem;
			x=x/10;
		}
		System.out.println("Reverse of a number is "+n+" is "+b);
	}

}
