package Methods_UsingBasicCodes;

public class Armstrong 
{
	public static void main(String[] args) 
	{
	  //Armstrong code
//      System.out.println(arm(153));
      
      //armstrong Range
      for(int i=0;i<1000;i++)
      {
    	  if(arm(i)==1)
    		  System.out.println(i+" Armstrong ");
      }
 
	}
	static int arm(int n)
	{
		int a=n,temp=n,count=0,sum=0;
		while(a>0)
		{
			count++;
			a=a/10;
		}
		a=temp;
		while(a>0)
		{
			int rem=a%10;
			int power=(int)Math.pow(rem, count);
			sum=sum+power;
			a=a/10;
		}
		if(sum==temp)
			return 1;
		else
			return 0;
	}

}
