package hello;

public class PatternNumberTask2
{
	public static void main(String args[])
	{           int rows=3,cols=3;
				for(int r=1;r<=rows;r++)
				{
					for(int c=1;c<=cols;c++)
					{
						if(c==4||c==7)
						{
							System.out.println();
						    System.out.print(c+" ");
						}
						else
							System.out.print(c+" ");
					}
					System.out.println();
				}
	}
}
