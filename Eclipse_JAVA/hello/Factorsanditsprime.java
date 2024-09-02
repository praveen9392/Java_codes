package hello;

public class Factorsanditsprime 
{
  public static void main(String args[])
  {
	  for(int i=1;i<=100;i++)
	  {
		  int temp=i,b=0;
		  for(int j=1;j<=i;j++)
		  {  
			  if(temp%j==0)
			  {
				  b=j;
				  int count=0;
				  for(int k=1;k<=b;k++)
				  {
					  if(b%k==0)
						  count++;	  
				  }
				  if(count==2)
				  {
					  System.out.println(temp+"is the number="+b+" is prime number");
				  }
			  }
		  }
	  }
  }
}
