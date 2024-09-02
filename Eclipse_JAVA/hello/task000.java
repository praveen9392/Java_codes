package hello;

public class task000 
{
  public static void main(String args[])
  {
	int rows=6;
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=rows;c++)
		{ 
			
			if(r==1||c==1||c==6||r==4)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		
		
		System.out.println();
	}
	
  }
}
