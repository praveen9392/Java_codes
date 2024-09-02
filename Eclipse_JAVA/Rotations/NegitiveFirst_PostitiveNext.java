package Rotations;

import java.util.Arrays;

public class NegitiveFirst_PostitiveNext
{
	public static void main(String args[])
	{
		int a[]= {10,-2,3,-4,5-9,8,7,-5,-6};
		int b[]=new int[a.length];
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				b[c]=a[i];
				c++;
			}		
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{
				b[c]=a[i];
				c++;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
