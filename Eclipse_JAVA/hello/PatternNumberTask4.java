package hello;

public class PatternNumberTask4 
{
	public static void main(String args[])
	{           int rows=4,cols=4;
				for(int r=1;r<=rows;r++)
				{  
					if(r==2)
						cols=5;
					else if(r==3)
						cols=6;
					else if(r==4)
						cols=7;
					for(int c=r;c<=cols;c++)
					{ 
						System.out.print(c+" ");					
					}
					System.out.println();
				}
	}


}
