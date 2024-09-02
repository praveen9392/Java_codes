package hello;

public class PerfectFactorSum 
{
	public static void main(String args[])
	{
		for(int i=1;i<=100;i++)
		{
			int a=i,c;
			double b=Math.sqrt(a);
			c=(int)b;
			if(b==c)
			{
				int sum=0;
				for(int j=1;j<=c;j++)
				{
					if(c%j==0)
						sum=sum+j;
				}
				
				System.out.println(c+"=factors sum is="+sum);
			}
		}
	}

}
