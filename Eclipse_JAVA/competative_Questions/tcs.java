package competative_Questions;

import java.util.Scanner;

public class tcs {

	public static void main(String[] args)
	{
//		range();
		pattern();
	}
	static void range()
	{
		// given a,b numbers determine the sum of cubes of numbers between the range from a to b
		//input a=4,b=9    o/p:1989
		Scanner s=new Scanner(System.in);
		System.out.print("a=");
		int a=s.nextInt();
		System.out.print("b=");
		int b=s.nextInt(),sum=0;
		
		s.close();
		for(int i=a;i<=b;i++)
		{
			int power=(int)Math.pow(i, 3);
			sum=sum+power;	
		}
		System.out.println(sum);	
	}
    static void pattern()
    {
        int n=6;
    	for(int i=1;i<=n;i++)
    	{
    		int b=i;  //1
    		int number=n;  //6  
    		for(int j=i;j<=n;j++)
    		{
    			System.out.print(b+" "); //1 7
    			b=b+number;  //1+6=7    
    			number--;    //5
    		}
    		System.out.println();
    	}
    }

}
