package chapter_IV;
import java.util.Scanner;
public class Question3 
{
	public static void main(String[] args) 
	{
		Question3 Q=new Question3();
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		Q.fibo(a);
	}
	void fibo(int n)
	{
		int a=0,b=1,c;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}
