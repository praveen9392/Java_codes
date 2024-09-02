package arrys;

public class Add_2_Arrays
{
	public static void main(String args[])
	{
		int a[]= {10,20,30,40,50};
		int b[]= {60,70,80,90,100};
		int c[]=new int[a.length+b.length],y=b.length-1;
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
				c[i]=a[i];
			else
			{
				c[i]=b[y];
				y--;
			}
			System.out.print(c[i]+" ");
		}
		
		
		
	}

}
