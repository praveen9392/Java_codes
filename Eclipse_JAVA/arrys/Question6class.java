package arrys;

public class Question6class
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50};
		for(int i=0;i<a.length-1;i++)
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		for(int t:a)
		{
			System.out.print(t+" ");
		}
	}
}
