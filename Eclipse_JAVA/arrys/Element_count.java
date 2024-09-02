package arrys;

public class Element_count
{
	public static void main(String[] args) 
	{
		int a[]=new int[] {1,2,3,4,5},x,c;
		for( x=0,c=0;x<a.length;x++)
		{
			if(demo(x,a,c)>0&&a[x]!=0)
			{
				System.out.println(a[x]);
				c++;
			}
		}
		if(c==0)
			System.out.println("-1");
		
	}
	static int demo(int x,int a[],int c)
	{
		int count=0;
		for(int y=x+1;y<a.length;y++)
		{
			if(a[x]==a[y])
			{
				a[y]=0;
				count++;
			}
		}
		return count;
	
	}
	
}
