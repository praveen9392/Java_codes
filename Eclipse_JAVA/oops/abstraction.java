package oops;

public class abstraction {

	public static void main(String[] args)
	{
	
	}
	abstract class ravi
	{
	    abstract void sum();
		final static void display()
		{
			System.out.println("hello");
		}
	}
	class ram extends ravi
	{
		@Override
		void sum() 
		{
			System.out.println("good night");
			
		}
	}

}
