package hello;

public class TopLeftRightAngleTriangle
{
	public static void main(String args[])
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
