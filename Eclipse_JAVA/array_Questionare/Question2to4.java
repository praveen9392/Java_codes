package array_Questionare;

public class Question2to4 
{
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6};
		System.out.println("length of array="+a.length);
		Question4();
		Question3();
	}
	static void Question4()
	{
		int a[]= {1,2,3,4,5,6};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			count++;
		}
		System.out.println("array length without using len Method ="+count);
	}
	static void Question3()
	{
		int a[]= {1,2,3,4,5,6};
		for(int t:a)
		{
			System.out.println(t);
		}
	}
	
}
