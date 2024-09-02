package hello;

public class SuperNumber 
{
	public static void main(String args[])
	{
		for(int j=1;j<=1000;j++)
		{
		int a=j,count=0,temp=a,rev=0;
		while(a>0)
		{
			int rem=a/10;
			rev=rev*10+rem;
			a=a/10;
		}
		a=rev;
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			int rem=a%10;
			count++;
			int pow=(int)Math.pow(rem,count);
			sum=sum+pow;
			a=a/10;
		}
		if(temp==sum)
		     System.out.println("Number is super number");
		else
			System.out.println("not");
		}
	}
	

}
