package hello;

public class BelowRight_RightAngledTriangle_Hallow 
{
	public static void main(String args[])
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print("  ");
			}
			for(int c=1;c<=r;c++)
			{
				if(r==3&&c==2 || r==4&&c==2||r==4&&c==3)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
