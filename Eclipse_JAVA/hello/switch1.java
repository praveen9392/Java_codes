package hello;
import java.util.Scanner;
public class switch1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number=");
		int a=s.nextInt();
	    switch(a)
	    {
	    case 1:
	    	System.out.println("number is one");
	    	break;
	    case 2:
	    	System.out.println("number is two");
	    	break;
	    case 3:
	    	System.out.println("number is three");
	    	break;
	    case 4:
	    	System.out.println("number is four");
	    	break;
	    default:
	    	System.out.println("invalid number");
	    }
	}

}
