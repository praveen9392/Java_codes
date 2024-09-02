package arrys;

public class Array_leafYear
{

	public static void main(String[] args)
	{
		
	int a[]={1900,2000,2024,2004,2007,1986};
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if((a[i]%4==0 && a[i]%100!=0) || a[i]%400==0)
		{
			System.out.println(a[i]+"Leaf year");
			count++;
		}
		else
		{
			System.out.println(a[i]+"Not leaf year");
		}
	}
	System.out.println("leaf year count are ="+count);	

  }

}
