package arrys;

import java.util.Arrays;

public class Array_even_odd_Element 
{
	public static void main(String args[])
	{
     int a[]= new int[]{1,8,6,3,9,2,0};
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=i+1;j<a.length-1;j++)
		  {
			 if(i%2!=0)
			 {
				 if(a[i]>a[i+2])
				 {
					 int temp=a[i];
					 a[i]=a[i+2];
					 a[i]=temp;
				 }    
			 }
			 else
			 {
				 if(a[i]<a[i+2])
				 {
					 int temp=a[i];
					 a[i]=a[i+2];
					 a[i]=temp; 
				 }
			 }
		  }
	 }
	 System.out.println(Arrays.toString(a));
	 }
}
