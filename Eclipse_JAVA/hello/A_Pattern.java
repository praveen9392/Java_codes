package hello;

public class A_Pattern 
{
	  public static void main(String args[])
	  { 
		int rows=8;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{ 
				System.out.print(" ");
			}
			for(int c=r;c<=r;c++)
			{
				    System.out.print("*");
			}
			if(r>=2)
			{
				for(int i=1;i<=r;i++)
				{
					if(i==r)
						System.out.print("*");
					else if(rows/2==r)
						System.out.print("* ");
					else 
						System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	  }
	


}
