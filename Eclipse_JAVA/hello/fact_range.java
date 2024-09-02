package hello;

public class fact_range 
{
 public static void main(String args[])
 {
	 for(int i=1;i<=10;i++)
	 {
		 int fact=1;
		 for(int j=i;j>0;j--)
		 {
			 fact=fact*j;
		 }
		 System.out.println(fact);
	}
		 
 }
}
