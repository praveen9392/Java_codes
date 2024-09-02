package oops;

public class Method_Overloading
{
	public static void main(String[] args) 
	{
		method obj=new method1();
		obj.add();
		
	}
}
class method
{
    void add()
	{
		System.out.println("A value is =hhhh");
	}
    static void add(int a ,int b)
	{
		System.out.println("A and B value is="+a+" "+b);
	}
	static void add(char c) 
	{
		System.out.println("Character value is ="+c);
	}
}
class method1 extends method
{
	final void add()
	{
		System.out.println("A value is =");
	}
	static void add(int a ,int b)
	{
		System.out.println("A and B value is="+a+" "+b);
	}
	static void add(char c) 
	{
		System.out.println("Character value is ="+c);
	}
}
