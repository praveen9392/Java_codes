package hello;

public class PatternAlphabitsTask1
{
	public static void main(String args[])
	{
		/*int count=0;
	    for(int r=1;r<=1;r++)
	    {   char z='P';
	    	for(int c=65;c<=z;c++)
	    	{      
	    		count++;
		        if(count%4==0)
		        	System.out.println((char)c+" ");
		        else
				System.out.print((char)c+" ");
		}
	}  */
		/*char a='A';
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=6;c++)
			{
				System.out.print(a);
				a++;
	            if(a>'Z')
	            	break;
			}
			System.out.println();
		}
		*/
		char a='A';
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print(a);
				a++;  
			}
			a-=(char)2;
			System.out.println();
		}

	}
}
