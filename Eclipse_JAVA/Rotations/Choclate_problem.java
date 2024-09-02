package Rotations;

import java.util.Arrays;

public class Choclate_problem 
{
	public static void main(String[] args) 
	{
		method1();
		System.out.println();
		method2();
	}
	static void method1()
	{
		int a[]= {0,1,0,2,0,0,2,0,5,1,0};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]==0)
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int t:a)
		{
			System.out.print(t+" ");
		}
	}
	
	static void method2()
	{
		int a[]= {0,1,0,2,0,0,2,0,5,1,0};
		int b[]= new int[a.length];
		int y=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[y]=a[i];
				y++;
			}	
		}
		System.out.println(Arrays.toString(b));
	}
}
