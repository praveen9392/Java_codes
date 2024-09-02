package hello;

public class Strong_number 
{
	public static void main(String args[])
	{
		int n=145,rem,temp=n,sum=0;
		while(n>0)
		{
			rem=n%10;
			int fact=1;
			while(rem>0)
			{
				fact=fact*rem;
				rem--;	
			}
			n=n/10;
			sum=sum+fact;
		}
		System.out.println("sum is="+sum);
		if(temp==sum)
		{
			System.out.println(temp+"= Strong number");
		}
		else
		{
			System.out.println("not");
		}
		
	}

}
