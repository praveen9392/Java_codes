package hello;
import java.util.Scanner;
public class Prime {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),start=2;
		String status="prime";
		if(n<=1)
		{
			 System.out.println("Not prime");
			 
		}
		else
		{
			while(start<n)
			{
				if(n%start==0)
				{
					status="Not Prime";
					break;
				}
				start++;
			}
		}
		System.out.println(status);
		
	}

}
