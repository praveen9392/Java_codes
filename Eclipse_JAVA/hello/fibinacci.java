package hello;

public class fibinacci 
{
	public static void main(String args[])
	{
		int a=0,b=1,c,start=1;
		while(start<=20)
		{
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
			start++;
		}
	}

}
