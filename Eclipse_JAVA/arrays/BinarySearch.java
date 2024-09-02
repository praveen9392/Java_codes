package arrays;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,200,120,22,45};
		Arrays.sort(a);
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		int start=0,end=a.length-1,mid,search=200;
		for(int i=0;i<a.length;i++)
		{
			mid=(start+end)/2;
			if(search==a[mid])
			{
				System.out.println(search+" Element found at Index "+mid);
				break;
			}
			else if(start>end)
			{
				System.out.println("Element not found");
				break;
			}
			else if(search>a[mid])
			{
				start=mid+1;
			}
			else if(search<a[mid])
			{
				end=mid-1;
			}
			
		}

	}

}
