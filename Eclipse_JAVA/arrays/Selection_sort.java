package arrays;

import java.util.Arrays;

public class Selection_sort 
{
	public static void main(String[] args)
	{
		
		int a[]= {10,60,20,30,40,50};
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[min]>a[j])
					min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
