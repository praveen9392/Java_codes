package hello;

public class PatternNumberTask3 
{
	public static void main(String args[])
	{
				for(int r=1;r<=4;r++)
				{
					for(int c=1;c<=4;c++)
					{
						if(r%2==0) 
						System.out.print("0 ");
						else
							System.out.print("1 ");
					}
					System.out.println();
				}
	}

}
