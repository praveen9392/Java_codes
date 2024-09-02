package arrys;

public class AditionOfAny_TwoElements_5 
{
	public static void main(String[] args) 
	{
		int a[]= {5,0,1,2,1,4,9,3,-4,6,2};
		int k=5;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==k)
				     System.out.println(a[i]+"   "+a[j]);
			}
		}
	}
}
