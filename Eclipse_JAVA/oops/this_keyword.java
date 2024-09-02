package oops;

public class this_keyword 
{
	public static void main(String args[])
	{
		new ab(2,3);

	}
}
class ab
{
	int x,y;
	ab(int x,int y)
	{
		this(10);
		this.x=x;
		this.y=y;
	}
	ab(int x)
	{
		System.out.println("1 agument constructor");
		this.add();
	}
	void add()
	{
		this.x=18;
	    System.out.println(this.x+"   "+this.y);
	}
}

