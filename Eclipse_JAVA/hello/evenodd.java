package hello;
import java.util.Scanner;
public class evenodd 
{
	public static void main(String args[])
	{
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt(),rem;
	 while(n>0)
	 {
		 rem=n%10;
		 if(rem%2==0)
			 System.out.println(rem+1);
		 else
			 System.out.println(rem+2);
		 n=n/10;
	 }
   
}
}