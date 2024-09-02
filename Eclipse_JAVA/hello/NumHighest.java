package hello;

public class NumHighest
{
	public static void main(String args[])
	{
		for(int i=1;i<=100;i++)
		{
			int temp=i,rem,max=0;
			while(temp>0)
			{
				rem=temp%10;
				temp=temp/10;  
				if(rem>max)
					max=rem;
			}
			System.out.println(i+"=max digit is ="+max);
		}
	}
}
