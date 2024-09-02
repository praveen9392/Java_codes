package hello;
import java.util.Scanner;
public class ArmsrongRange {
public static void main(String args[])
{
	          Scanner s = new Scanner(System.in);
		      System.out.print("Enter the start of the range: ");
		      int start = s.nextInt();
		      System.out.print("Enter the end of the range: ");
		     int end = s.nextInt();
			 while(start<=end)
			 {
			 int num=start,rem,sum=0,count=0,temp=num;
			 while(num>0)
			 {
				 rem=num%10;
				 count++;
				 num=num/10;
			 }
			 num=temp;
			 while(num>0)
			 {
				 rem=num%10;
				 int pow=(int)Math.pow(rem, count);
				 sum+=pow;
				 num=num/10;
			 }
			 if(sum==temp)
			 {
				 System.out.println(temp+"Armstrong");
			 }
			 start++;
		}
		

	}

}
