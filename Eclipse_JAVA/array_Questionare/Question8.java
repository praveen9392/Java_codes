package array_Questionare;

import java.util.Arrays;

public class Question8 
{
	public static void main(String[] args) 
	{
		
		int a[]= {2,5,4,3,6,7,8,12,11,1,19,20};
		int b=a.length/2;
		for(int i=0;i<a.length/2;i++)
		{
			if(a[i]>a[i+1])   //descending order
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					i=-1;
				}
		}
//		//System.out.println(Arrays.toString(a));
		for(int i=b;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])   //descending order
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					i=+1;
				}
		}
		System.out.println(Arrays.toString(a));

	}

}
