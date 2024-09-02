package hello;

public class TwoTriangles 
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
				if(r==3&&(c==2||c==3) || r==4&&c==2||r==4&&(c==3||c==4)||r==2&&c==2)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			for(int c=r;c<=rows;c++)
			{
				System.out.print("");
			}
			for(int c=1;c<=r;c++)
			{
				if(r==3&&(c==2||c==1) || r==4&&(c==2||c==1)||r==4&&c==3 ||r==2&&c==1)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
