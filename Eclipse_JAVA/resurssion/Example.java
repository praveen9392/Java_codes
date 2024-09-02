package resurssion;

public class Example {

	public static void main(String[] args) 
	{
//       recu(3);
//       fibo(0,1,5);
//      System.out.println(sum(1234));
//      System.out.println(Gcd(10,20));
        
      
	}
	static void recu(int n)
	{
		System.out.println(n);
		if(n>0)
			recu(n-1);
		System.out.println(n);
	}
	static void fibo(int a,int b,int n)
	{
	    if(n>0)
	    {
	    	System.out.println(a);
	    	int c=a+b;
	        fibo(b,c,n-1);
	    }
	}
	static int sum(int n)
	{
		if(n==0)
		{
		   return 0;
		}
		return n%10+sum(n/10); 
	}
	static int Gcd(int a,int b)
	{
		if(b==0)
			return a;
		else
			return Gcd(b,a%b);
	}
}
