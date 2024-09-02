package hello;
import java.util.Scanner;
public class prime_range
{
	public static void main(String args[])
	{
		
		Scanner b=new Scanner(System.in);
		System.out.println("enter where you want to start the prime numbers=");
		int i=b.nextInt();
		Scanner s=new Scanner(System.in);
		System.out.println("enter where you want to end the prime numbers=");
		int n=s.nextInt();
		
		for( ;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
			{
				System.out.println(i+"=is prime");
			}
		}
	}

}
