package oops;

public class Constructors 
{
	public static void main(String[] args) 
	{
		new child1(2,3);	
	}
}
class parent
{
	int x,y;
	parent(int x,int y)
	{
		this(10);
		this.x=x;
		this.y=y;
	}
	parent(int x)
	{
		this(2,3,5);
		System.out.println("Prameterized constroctor");
	}
	parent(int x,int y,int z)
	{
		display();
		System.out.println("Parameterized");
	}
	void display()
	{
		x=5;
		System.out.println(this.x+" "+this.y);
	}
}
class child1 extends parent
{
	child1(int x,int y) 
	{
		super(x,y);
		// TODO Auto-generated constructor stub
	}
	
}