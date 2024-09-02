package hello;

public class power1 {
public static void main(String args[])
{
	int m=5,n=2,start=1,product=1;
	{
		while(start<=n)
		{
			product=product*m;    // 1*5=5 , 5*5=25;
			start++;
		}
		System.out.println(product);
	}  
}
}
