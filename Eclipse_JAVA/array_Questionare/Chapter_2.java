package array_Questionare;

import java.util.Arrays;

public class Chapter_2 
{
	public static void main(String[] args) 
	{
		//question1();
		//question2();
		//Question3();
       	//Question4();
		Question7();
	}
	static void question1()
	{
		int a[]=new int[] {1,2,3,4,5,6};
		int b[]	=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
	    System.out.println(Arrays.toString(b));
	}
	static void question2()
	{
		int a[]=new int[] {1,2,3,4,5,6};
		int b[]	=new int[a.length];
		int c=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[c++]=a[i];
		}
	    System.out.println(Arrays.toString(b));
	}
	static void Question3()
	{
		int a[]=new int[] {1,2,3,4,5,6};
		int b[]	=new int[a.length];
		int c[]=new int[a.length];
		int d=0;
		for(int i=0;i<a.length;i++)              //even indexed elements copy to second array
		{
			if(i%2==0)
			    b[d]=a[i];
			if(a[i]%2==0)
			    c[d]=a[i];
			d++;
		}
	    System.out.println(Arrays.toString(b));	
	    System.out.println(Arrays.toString(c));	
	}
	static void Question4()
	{
		int a[]=new int[] {1,2,3,4,5,6};
		int b[]	=new int[a.length];
		int c[]=new int[a.length];
		int d=0;                               //add indexed elements copy to second array
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			    b[d]=a[i];
			if(a[i]%2!=0)
			    c[d]=a[i];
			d++;
		}
	    System.out.println(Arrays.toString(b));	
	    System.out.println(Arrays.toString(c));	
	}

	static void Question7()
	{
		int a[]={14, 73, 28, 42, 67, 51, 85, 31, 19, 98};
		Arrays.sort(a);
		int b[]	=new int[a.length];                             //add indexed elements copy to second array
		int c=a.length-1,d=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				b[d++]=a[i];
			else
				b[c--]=a[i];	   
		}
		System.out.println(Arrays.toString(b));	   	
	}	
}
