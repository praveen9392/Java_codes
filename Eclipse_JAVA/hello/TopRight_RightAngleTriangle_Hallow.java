package hello;

public class TopRight_RightAngleTriangle_Hallow
{
	public static void main(String args[])
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(" ");
			}
			for(int c=r;c<=rows;c++)
			{   
				if(r==2&&c==3||r==2&&c==4||r==3&&c==4)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

}
