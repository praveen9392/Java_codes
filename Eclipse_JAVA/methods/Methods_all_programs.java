package methods;
import java.util.Scanner;
public class Methods_all_programs 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		palindrome(num);
		even(num);
		armstrong(num);
		prime(num);
		perfect(num);
		s.close();
	}
	static void palindrome(int num)
	{
		int x=num,rev=0;
		while(x>0)
		{
			int rem=x%10;
			rev=rev*10+rem;
			x=x/10;
		}
		if(rev==num)
			System.out.println(num+" is palindrome");
		else
			System.out.println(num+" is not palindrome");
	}
	static void even(int num)
	{
		int x=num;
		if(x%2==0)
			System.out.println(num+" Number is Even");
		else
			System.out.println(num+" Number is odd");
	}
	static void prime(int num)
	{
		int n=num,count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.println(num+" prime");
		else
			System.out.println(num+" Not Prime");
	}
	static void armstrong(int num)
	{
		int n=num,count=0,sum=0,temp=n;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		n=temp;
		while(n>0)
		{
			int rem=n%10;
			int pow=(int)Math.pow(rem,count);
			sum=sum+pow;
			n=n/10;
		}
		if(sum==temp)
			System.out.println(num+" Armstrong");
		else
			System.out.println(num+" Not Armstrong");
	}
	static void perfect(int num)
	{
		int x=num,sum=0;
		for(int i=1;i<=x/2;i++)
		{
			if(x%i==0)
				sum=sum+i;
		}
		if(num==sum)
			System.out.println("perfect numeber");
		else
			System.out.println("Not perfectNumber");
	}

}
