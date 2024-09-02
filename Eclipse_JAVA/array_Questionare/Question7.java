package array_Questionare;

import java.util.Arrays;

public class Question7 
{
	public static void main(String[] args) 
	{
		ascending();
		decending();
		singleloop();
		singleloopDesc();

	}
	static void ascending()
	{
		int a[]= {2,4,3,1,6,7};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	static void decending()
	{
		int a[]= {2,4,3,1,6,7};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	static void singleloop()
	{
		     int a[]= {2,4,3,1,6,7};
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])   // ascending order
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					j=-1;
				}
			}
		   System.out.println(Arrays.toString(a));
	}
	static void singleloopDesc()
	{
		     int a[]= {2,4,3,1,6,7};
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])   //descending order
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					j=-1;
				}
			}
		   System.out.println(Arrays.toString(a));
	}

}
