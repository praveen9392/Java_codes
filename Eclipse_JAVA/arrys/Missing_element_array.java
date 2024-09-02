package arrys;

import java.util.Arrays;

public class Missing_element_array 
{
	public static void main(String[] args) 
	{
		int a[]= {1,3,4,5,7,9,12,2,2};
		for(int i=1;i<10;i++)  
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(i==a[j]) 
					count++;
			}
			if(count==0)
				System.out.println("missing element is="+i);
		}
		//method2();
	}
	static void method2()
	{
		int arr[]= {1,2,3,5};
		Arrays.sort(arr);
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
		    if(count==arr[i])              // single missing number of elements code 
		    {
		        count++;
		    }
		    else
		    {
		        System.out.println(count);  
		        break;                    
		    }
		}
	}
	static void method3()
	{
		int arr[]= {1,2,3,5,6,8,10};
		Arrays.sort(arr);
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
		    if(count==arr[i])  //1==1 2==2 3==3 4==5              // any number of elements code 
		    {
		        count++;
		    }
		    else
		    {
		        System.out.println(count);  // 4
		        count++;
		        i--;                    //5
		    }
		}
	}
}
