package hello;
public class task1 
{
 public static void main(String args[])
 {
	 int n=5234,rev=0,sum=0,temp=n,rev1=0,rem;
	 
	 while(n>0)
	 {
		 rem=n%10;
		 rev=rev*10+rem;        
		 sum+=rem;
		 n=n/10;
	 }
	 //System.out.println(rev);
	 System.out.println(sum);
	 while(rev>0)
	 {
		 rem=rev%10;
		 rem=sum/rem;
		 rev1=rev1*10+rem;
		 rev=rev/10;
	 }
	 System.out.println(temp);
	 System.out.println(rev1);
	 }
}
