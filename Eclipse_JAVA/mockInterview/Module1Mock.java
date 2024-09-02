package mockInterview;

import java.util.Arrays;
import java.util.Random;

public class Module1Mock
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		question1();
//		question2();
//		question3();
//		question31();
//		question4();
//		question5();
//		arr();
//		vowel();
		
	
	}
	static void question1()
	{
		String s="Hello all good Morning c",s3="";
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			String s2=s1[i];
			if(s2.length()>s3.length())
			{
				s3=s2;
			}
		}
		System.out.println(Arrays.toString(s1));
		System.out.println(s3);
		System.out.println(s.indexOf(s3));
	}
	static void question2()
	{
		int a[]= {1,3,2,6,7,8,9,10},count=0;
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
					c++;
			}
			if(c==2)
			{
				System.out.println(a[i]);
				count++;
			}
		}
		System.out.println("Prime number count is="+count);
	}
	static void question3()
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=i;j<3;j++)
			{
			 System.out.print(" ");
			}
			for(int z=i;z>=1;z--)
			{
				System.out.print(z);
			}
			System.out.println();
			
		}
	}
	static void question31()
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=i;j>=1;j--)
			{
			 System.out.print(j);
			}
			System.out.println();
		}
	}
	static void question4()
	{
		int a=121;
		String s=Integer.toString(a);           // String.valueOf(a);
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		if(s.contentEquals(sb))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not");
	}
	static void question5()
	{
		String s="a1b2c3";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='0' && c<='9')
				sum=sum+Character.getNumericValue(c);
		}
		System.out.println(sum);
	}
	static void arr() 
	{
	    int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	    int b = 24;

	    for (int i = 0; i < a.length; i++) 
	    {
	        for (int j = i + 1; j < a.length; j++) 
	        {
	            for (int k = j + 1; k < a.length; k++) 
	            {
	                if (a[i] * a[j] * a[k] == b) 
	                {
	                    System.out.println("Product of three numbers " + a[i] + ", " + a[j] + ", " + a[k] + " == " + b);
	                }
	            }
	        }
	    }
	}
	static void vowel()
	{
	String s="virtual infromation resourcs under size",s2="";
	String str[]=s.split(" ");
	int temp[]=new int[s.length()],maxcount=0;;
	for(int x=0;x<str.length;x++)
	{
		String word=str[x];
		int count=0;
		for(int y=0;y<word.length();y++)
		{
			char ch=word.charAt(y);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				count++;
		}
		if(count>maxcount)
		{
			maxcount=count;
			s2=word;
		}
	}
		System.out.println(s2);
		System.out.println(maxcount);
	}
	static void duplicate()
	{
		int a[]= {1,2,3,4,5,6,2,3};
		int b[]=new int[a.length],z=0;
		String s="";
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=0;
				}
			}
			if(count>0)
				b[z++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=0)
				s=s+b[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(s);
		
		int x=0;
	    if(s.length()==0)
	    	System.out.println("Null");
	    else
	    	for(int i=0;i<a.length;i++)
	    	{
	    		if(a[i]!=0)
	    			System.out.print(a[i]+"  ");
	    		if(s.length()>x)
	    			System.out.print(s.charAt(x++)+"  ");
	    	}	
	}
}
