package methods;

public class Basic_method 
{
	public static void main(String args[])
	{
	  	hello obj=new hello();
		obj.add();
	  	obj.sum();
	}

}
class hello
{
	 void add()
	{
		//hello obj1=new hello();
		//obj1.sum();
		System.out.println("hello");
	}
	void sum()
	{
		add();
		System.out.println("Bye Goodnight");
	}
	
}
