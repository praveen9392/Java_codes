package hello;

public class PatternNumberTask8
{
	public static void main(String args[])
	{
	for(int r=1;r<=4;r++)
	{
		for(int c=1;c<=4;c++)
		{
			if(r==c)
			System.out.print("0 ");
			else if(r+c==5)
			System.out.print("4 ");
			else if((r==1 && c==2) || (r==2 && c==1))
				System.out.print("2 ");
			else if((r==3 && c==4) || (r==4 && c==3))
				System.out.print("6 ");
			else
				System.out.print("0 ");
		}
		System.out.println();
	}
	}
}
