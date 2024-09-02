package arrys;

public class ArrayGeekforGeeks 
{

	public static void main(String[] args)
	{
		String b=duplicate();
		if(b.length()>0)
		{
			for(int i=0;i<b.length();i++)
			{	
				System.out.println(b.charAt(i));
			}
		}
		else
			System.out.println("-1");

	}
	static String duplicate()
	{
		
			int a[]= {1,2,3,4,5,6,4,5,2,2,4,4,5,4};
			int b[]= new int[a.length];
//			int count=0;
			String s2="";
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
				}
				if(count>1)
					s2=s2+a[i];
			}
			return s2;
	}
				
	

}
