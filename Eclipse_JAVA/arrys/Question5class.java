package arrys;

public class Question5class
{
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6,4,5,2,2,4,4,5,4};
		int b[]= new int[a.length];
		int maxcount=0,tem=0;
		for(int i=0;i<a.length;i++)
		{   
			int count=1;
			if(b[i]==1)
				continue;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					b[j]=1;
					count++;
				}
				if(maxcount<count)
				{
					maxcount=count;
					tem=a[i];
				}
			}
		}
		 System.out.println(tem+" max count value is "+maxcount);
	}
}
