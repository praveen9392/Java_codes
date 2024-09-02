package hello;

public class practice_task
{
	public static void main(String args[])
	{
		int n=589,rev=0,rev1=0,rem;
		while(n>0)
		{
	    rem=n%10;
		rev=rev*10+rem+1;
		n=n/10;
		}
		System.out.println(rev);
		while(rev>0)
		{
			rem=rev%10;
			rev1=rev1*10+rem;
			rev=rev/10;	
		}
		System.out.println(rev1);
		rev1=rev1/10;
		System.out.println(rev1);
		
		
	}

}

