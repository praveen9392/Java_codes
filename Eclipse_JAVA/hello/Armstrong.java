package hello;
import java.util.Scanner;
public class Armstrong 
{
	public static void main(String args[])
	{
		 Scanner b=new Scanner(System.in);
		 int num=b.nextInt(),rem,sum=0,count=0,temp=num;
		 while(num>0)
		 {
			 rem=num%10;
			 count++;
			 num=num/10;
		 }
		 System.out.println(count);
		 num=temp;
		 while(num>0)
		 {
			 rem=num%10;
			 int pow=(int)Math.pow(rem, count);
			 sum+=pow;
			 num=num/10;
		 }
		 System.out.println(sum);
		 System.out.println(temp);
		 if(sum==temp)
		 {
			 System.out.println("Armstrong");
		 }
		 else
		 {
			 System.out.println("not");
		 }
	}
	

}
