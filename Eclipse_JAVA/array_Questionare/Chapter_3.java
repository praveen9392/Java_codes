package array_Questionare;

import java.util.Arrays;
import java.util.Scanner;

public class Chapter_3 
{
	public static void main(String[] args)
	{
		
		//Question_A();
		//Question_B();
		//Question_C();
		//Question_D();
		Question_E_H();

	}
	static void Question_A()
	{
		int a[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the element to be searched:");
		int search=s.nextInt(),count=0;
		s.close();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
				count++;
		}
		if(count==0)
			System.out.println("Element not found");
		else
			System.out.println("Element found and its count is="+count);
	}
	static void Question_B()
	{
		int a[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		s.close();
		int count=0,count1=0,count2=0,count3=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
	             count++;
			if(a[i]%2!=0)
	             count1++;
			if(a[i]>0)
	             count2++;
			if(a[i]<0)
	             count3++;		
		}
		System.out.println("Even numbers count="+count);
		System.out.println("odd numbers count="+count1);
		System.out.println("positive numbers count="+count2);
		System.out.println("Negitive numbers count="+count3);	
	}
	static void Question_C()
	{
		int a[]= {10,20,30,40,50,23,45,6,2};
		int sum=0;
		for(int t:a)
		{
			sum+=t;
		}
		System.out.println("Array sum is ="+sum);		
	}
	static void Question_D()
	{
		int a[]= {10,20,30,40,50,23,45,6,2};
		Arrays.sort(a);	
		System.out.println("Minimun element is="+a[0]);
		System.out.println("Minimun element is="+a[a.length-1]);
	}	
	static void Question_E_H()
	{
		int a[]= {10,2,30,40,50,40,45,6,2};
		int b[]=new int[a.length];
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			count=1;
			if(b[i]==1)
				continue;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				    b[j]=1;
				}
			}
			System.out.println(a[i]+"Frequency ="+count);
//			if(count>1)
//				System.out.println(a[i]+"Element occured in "+count);   //duplicate elements
//			if(count==1)
//			{
//				System.out.println(a[i]+"Element is unique Element");     //Unique elements
//			}
		}
	}
}
