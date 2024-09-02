package hello;
import java.util.Random;
public class random 
{
	public static void main(String args[])
	{
	    Random r=new Random();
	    int a=10000+r.nextInt(10000);
	    System.out.println(a);
	}

}
