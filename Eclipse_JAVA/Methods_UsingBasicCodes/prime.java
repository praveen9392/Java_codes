package Methods_UsingBasicCodes;

import java.util.Scanner;

public class prime 
{

	public static void main(String[] args) 
	{
//	    //method1   
//	   System.out.println(pri(6));	
//	    
////	   method2
//	   if(pri1(0)==1)
//		   System.out.println("Prime");
//	   else
//		   System.out.println("Not Prime");
//	   
//	   //method3
//	   if(pri2(2))
//		   System.out.println("Prime");
//	   else
//		   System.out.println("Not Prime");
	   
	   //Prime Range
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter start Number=");
	   int a=s.nextInt();
	   System.out.println("Enter End Number=");
	   int b=s.nextInt();
	   for(int i=a;i<=b;i++)
	   {
		   if(pri1(i)==1)
			   System.out.println(i+" Prime Number");
	   }
	   s.close();
	   
	}
	static String  pri(int n)
	{
		if(n<2)
			return "Not Prime";	 
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return "Not prime"; 
		}
		return "Prime";
	}
	static int  pri1(int n)
	{
		if(n<2)
			return 0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return 0;	  
		}
		return 1;
	}
	static boolean  pri2(int n)
	{
		if(n<2)
			return false;	
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;	  
		}
		return true;
	}

}
