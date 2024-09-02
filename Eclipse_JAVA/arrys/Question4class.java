package arrys;

public class Question4class 
{
	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,50};
		int b[]= new int[a.length];
		int d[]=new int[a.length];
		int c=0,e=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				b[c]=a[i];
				c++;
			}
			if(i%2!=0)
			{
				d[e]=a[i];
				e++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				b[c]=a[i];
				c++;
			}
			if(i%2==0)
			{
				d[e]=a[i];
				e++;
			}
		}
		for(int k=0;k<b.length;k++)
		{
			System.out.print(b[k]+" ");
//			System.out.println();
			System.out.println(d[k]+" ");			
		}
	}
}
