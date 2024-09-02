package hello;

public class MaxMinDifference
{
	public static void main(String args[])
	{
		
				for(int i=1;i<=100;i++)
				{
					int n=i,rem,max=0,min=9,diff=0;
					while(n>0)
					{
						rem=n%10;
						n=n/10;  
						if(rem>max)
							max=rem;
						if(rem<min)
						    min=rem;
						diff=max-min;
					}
					System.out.println(i+"=max digit is ="+max);
					System.out.println(i+"=min digit is ="+min);
					System.out.println("Difference value is ="+diff);
					
				}

	}

}
