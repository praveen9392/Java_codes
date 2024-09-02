package hello;

public class TopRight_RightAngleTriangle
{
	public static void main(String args[])
	{
		int rows=9;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(" ");
			}
			for(int c=r;c<=rows;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
