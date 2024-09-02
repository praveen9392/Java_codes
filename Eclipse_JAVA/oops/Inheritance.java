package oops;

public class Inheritance 
{
    public static void main(String[] args) 
    {
       child obj =new child();
       obj.sum();
       obj.p1();
  
    }
}
class parent1
{
	int x=0;
	int y=0;
	parent1()
	{   
		this(5);
		System.out.println("default constructor");
	}
	parent1(int x)
	{
		System.out.println("one argement");
	}
    void p1()
    {
    	System.out.println("parent class");
    }
   
}
class child extends parent1
{
	child()
	{
		super();
		System.out.println("Child calss defult");
	}
    void sum()
    {
    	System.out.println("child class");	
    } 
}
