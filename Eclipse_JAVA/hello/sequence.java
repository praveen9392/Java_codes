package hello;
import java.util.Scanner;
public class sequence 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter how many number you wnat to check:");
		int b=s.nextInt(),count=0,count1=0,count2=0,count3=0,count4=0,start=0;
		while(start<b)
		{
			Scanner c=new Scanner(System.in);
			System.out.println("enter the number you want to check:");
			int a=c.nextInt();
			start++;
		if(a==0)
		{
			count++;
		}
		else if(a<0)
		{
			count1++;
			if(a%2==0)
			{
				count3++;
			}
			else
			{
				count4++;
			}
		}
		else if(a>0)
		{
			count2++;
		}
		}
		System.out.println("zeros="+count);
		System.out.println("positive="+count2);
		System.out.println("negitive="+count1);
		System.out.println("even="+count3);
		System.out.println("odd="+count4);
	}
	

}
