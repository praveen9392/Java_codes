package Rotations;

import java.util.Arrays;

public class Right_rotation
{
	public static void main(String[] args) 
	{
	    LRotation();
		RRoration();
	}
	static void LRotation()
	{
		int a[]= {1,2,3,4,5};
		int temp=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
       System.out.println(Arrays.toString(a));
	}
	static void RRoration()
	{
		int a[]= {1,2,3,4,5};
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
       System.out.println(Arrays.toString(a));
	}

}
