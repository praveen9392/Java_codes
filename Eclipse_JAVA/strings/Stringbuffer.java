package strings;

public class Stringbuffer {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 StringBuffer s=new StringBuffer("hello");
		 s.append("hii");
		 s.insert(1,"bye");
		 s.replace(1,2,"world");
		 s.delete(1,3);            // delete sequenece of characters 
		 s.deleteCharAt(0);       // delete a single character
		 System.out.println(s);

	}

}
