package hello;
import java.util.Scanner;
public class extractlarge
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),min=0,max=0,rem,secondlarge=0,secondmin=0,temp=n;
		while(n>0)
		{
			rem=n%10;
			if(rem>max)
			{
				max=rem;
			}
			else
			{
				min=rem;
				if(rem>secondlarge && rem!=max)
				{
					secondlarge=rem;
				}
				else if(rem>secondmin && rem!=min)
				{
					secondmin=rem;
				}
				
			}
			n=n/10;
		}
		System.out.println("minimum value is= "+min);
		System.out.println("maximum value is="+max);
		System.out.println("second large="+secondlarge);
		System.out.println("second min="+secondmin);
		
	}

}
