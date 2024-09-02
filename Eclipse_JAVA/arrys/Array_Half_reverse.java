package arrys;

import java.util.Arrays;

public class Array_Half_reverse
{
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6};
		int b[]=new int[a.length];
		int c=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(i<a.length/2)
			{
				b[i]=a[i];
			}
			else
			{
		       b[i]=a[c];
		       c--;
			}
		}
		System.out.println(Arrays.toString(b));

	}

}
