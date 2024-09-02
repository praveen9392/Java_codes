package hello;

public class task3_count_even_odd 
{
  public static void main(String args[])
  {
	  int n=1234,count=0,temp=n,rem,rev=0,rev1=0,rev2=0,sum=0,c;
	  while(n>0)
	  {
		  count++;
		  n=n/10;
	  }
	  System.out.println(count);
	  n=temp;
	  c=count/2;
	  if(count%2==0)
	  {
//		 while(n>0) 
//		 {
//			rem=n%10;
//			rev=rev*10+rem;
//			n=n/10;
//			count1++;
//			if(count1==c)
//			{
//				break;
//			}
		  rev=n%(int)Math.pow(10, count/2); //34 
		  rev1=n/(int)Math.pow(10, count/2); //12
		  sum=rev+rev1;
		  System.out.println("rev="+sum);
		 }
	  else
	  {
		 while(n>0) 
		 {
			 rem=n%10;
			 rev1=rev1*10+rem+1;
			 n=n/10;
		 }
		 while(rev1>0)
		 {
			 rem=rev1%10;
			 rev2=rev2*10+rem;
			 rev1=rev1/10;
		 }
		 System.out.println(rev2);
	  }
  }
}
