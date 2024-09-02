package hello;

public class task2_501_105
{
 public static void main(String args[])
 {
	 int a=150000,rem;
	 String rev = "";
	 while(a>0)
	 {
		 rem=a%10;
		 if(rem==0)
			 rev = rev+"0";
		 else
		     rev = rev + rem;
		 a=a/10;
	 }
	 System.out.println(rev);
 }
}