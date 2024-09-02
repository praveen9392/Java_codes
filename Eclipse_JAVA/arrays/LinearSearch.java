package arrays;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,45,76,9,8};
		int k=45,count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
			     System.out.println(k+" Element found at index "+i);
			     count++;
			}
		}
		if(count==0)
			System.out.println("Element nt found");
	}
}
