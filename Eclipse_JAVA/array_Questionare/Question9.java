package array_Questionare;

import java.util.Arrays;

public class Question9 
{
	public static void main(String[] args) 
	{
			int a[]= {2,4,3,1,6,7,8};
			if(a.length%2==0)
			{
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
			else
			{
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
	}
}
