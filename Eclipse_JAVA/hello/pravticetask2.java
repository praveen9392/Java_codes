package hello;

public class pravticetask2
{
	public static void main(String args[])
	{
		int a=269,rem=0,rev=0,temp=0,rev1=0;
		String b="";
		while(a>0)
		{
			rem=a%10;
			rev=rev*10+rem+1;
			a=a/10;
		}
		temp=rev;
		System.out.println(rev);
		rev=rev/100;
		rev=rev/10;
		System.out.println(rev);
		a=temp;
		while(a>0)
		{
			rem=a%10;
			rev1=rev1*10+rem;
			a=a/10;
		}
		System.out.println(rev1);
		rev1=rev1/100;
		b=b+rev1+rev;
		System.out.println(b);
		
		
		
	}

}
