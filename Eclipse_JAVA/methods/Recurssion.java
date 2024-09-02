package methods;

public class Recurssion
{
	    public static void main(String[] args)
	    {
	        int result = factorial(5,0);
	        System.out.println("Factorial of 5 is: " + result);
	    }

	    public static int factorial(int n,int sum)
	    {
	       if(n>0)
	       {
	    	   sum=sum+n;
	    	   return factorial(n-1,sum);
	       }
	       else
	    	   return sum;
	    
	    }
	}
