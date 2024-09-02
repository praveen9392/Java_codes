package resurssion;

public class factorial {

	public static void main(String[] args) 
	{
		System.out.println(fact(5));
	}
	static int fact(int num)
	{
		if(num<1)
			return 1;
		else 
			return num*fact(num-1);
	}

}
