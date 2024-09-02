package methods;

public class Method_para_return
{

	public static void main(String[] args)
	{
		Method_para_return m=new Method_para_return();
		for(int i=1;i<=20;i++)
		{
		int a=m.prime(i);  //2
		if(a==2)
		{
			System.out.println(i+" Prime");
			int b=m.rev(i);  //31
			int c=m.prime(b);  //2
			if(c==2) //2==2
				System.out.println(i+" Twisted prime numbers");
			else
				System.out.println(i+" Not Twisted prime");
		}
		else
			System.out.println(i+"Not prime");
		}
	}
	int prime(int x)  //31
	{
		int num=x,count=0;  //num=31
		for(int i=1;i<=x;i++)
		{
			if(num%i==0)  //31%1==0T , count=1 ,FFFFFFFF .......31%31==0T,count=2
				count++;
		}
		return count;  //2 2
	}
	int rev(int x)
	{
		int num=x,rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	
}
