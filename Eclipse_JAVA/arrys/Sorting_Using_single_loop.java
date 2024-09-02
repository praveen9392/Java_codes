package arrys;

public class Sorting_Using_single_loop
{
	public static void main(String[] args)
	{
	int a[]= {1,9,6,3,2,8,7};
	int b=a.length-1;
	for(int i=0;i<a.length-1;i++)
	{
		if(a[i]>a[i+1])
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;	
		}
//		if(a[i]>a[i+2] && i+2!=b)
//		{
//			int temp=a[i];
//			a[i]=a[i+2];
//			a[i+2]=temp;
//		}
//		if(a[i]>a[i+3] && i+3!=b)
//		{
//			int temp=a[i];
//			a[i]=a[i+3];
//			a[i+3]=temp;
//		}
	}
	for(int t:a)
	{
		System.out.println(t);
	}

	}

}
