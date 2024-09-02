package array_Questionare;

import java.util.Arrays;

public class Question5 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//first();
		//second();
		third_evenIndexElements();
		System.out.println();
		fourth_oddIndexElements();
		System.out.println();
		fifth_divisibleElements();
		System.out.println();
		sixth_divisibleElements();
	}
	static void first()
	{
		int a[]= {12,56,34,23,67,76,32,75,90,365};
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	static void second()
	{
		int a[]= {12,56,34,23,67,76,32,75,90,365};
		int b[]=new int[a.length];
		int z=0;
		for(int i=(a.length/2)-1;i>=0;i--)
		{
			b[z++]=a[i];
		}
		for(int i=a.length/2;i<a.length;i++)
		{
			b[z++]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}
	static void third_evenIndexElements()
	{
		int a[]= {12,56,34,23,67,76,32,75,90,365};
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
				System.out.print(a[i]+" ");
		}
	}
	static void fourth_oddIndexElements()
	{
		int a[]= {12,56,34,23,67,76,32,75,90,365};
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
				System.out.print(a[i]+" ");
		}
	}
	static void fifth_divisibleElements()
	{
		int a[]= {12,56,34,23,67,76,32,75,90,365};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%4==0)
				System.out.print(a[i]+" ");
		}
	}
	static void sixth_divisibleElements()
	{
		int a[]= {12,56,34,23,67,76,32,75,90,365};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%3==0)
				System.out.print(a[i]+" ");
		}
	}

}
