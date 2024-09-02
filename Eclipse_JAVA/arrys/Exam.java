package arrys;

import java.util.Arrays;

public class Exam {

	public static void main(String[] args)
	{
		//second();
     	max();
        //string(args);
		//System.out.println(Arrays.toString(args));
	}
    static void second()
    {
    	int a[]= {1,2,19,4,5,7,8,12,3,4};
    	int max=0,smax=0;
    	for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && a[i]!=max)
			{
				smax=a[i];
			}
		}
    	System.out.println(smax);
    }
    static void max()
    {
    	int a[]= {1,2,19,6,5,7,2,1,3,6,6,2,7,7,8,8,8,9,9,9};
    	int b[]=new int[a.length];
    	int c[]=new int[a.length];
    	int z[]=c;
    	int count=1,max=0,d=0;
    	for(int i=0;i<a.length;i++)
    	{
    		count=1;
    		if(b[i]==1)
    		    continue;
    		for(int j=i+1;j<a.length;j++)
    		{
    			if(a[i]==a[j])
    			{
    				count++;
    				b[j]=1;
    			}	
    		}
    		if(count>1)
    			c[i]=count;	
    	}
    	for(int i=0;i<c.length;i++)
		{
			if(c[i]>max)
			{
				max=c[i];
				d=i;
			}
		}
    	for(int i=0;i<z.length;i++)
    	{
    		if(max==z[i])
    			System.out.println("Maximum repeated element is "+a[i]+" with count= "+max);
    			
    	}
    	//System.out.println("Maximum repeated element is "+a[d]+" with count= "+max);
    }
    static void string(String arr[])
    {
    	for(int a=0;a<arr.length;a++)
    	{
    		int b=Integer.parseInt(arr[a]);
    		int count=0;
    		for(int j=1;j<=b;j++)
    		{
    			if(b%j==0)
    				count++;
    		}
    		if(count==2)
    		{
    			arr[a]="prime";
    		}
    	}
    	System.out.println(Arrays.toString(arr));
    }
}
