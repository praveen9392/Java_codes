package oops;

public class Method_Overiding 
{
	public static void main(String[] args)
	{
       over obj =new over1();
       obj.add();
	}
}
class over
{
	void add()
	{
		System.out.println("hello");
	}
}
class over1 extends over
{
	@override
	void add()
	{
		System.out.println(" hello child");
	}
}
