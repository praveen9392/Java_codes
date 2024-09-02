package strings;
import java.util.Scanner;
public class Questionare
{
	public static void main(String[] args) 
	{
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter a string=");
//		String b=s.next();
//		System.out.println(reverse(b));
//		s.close();
//		System.out.println(mutable());
//		System.out.println(doubleEquals());
//		System.out.println(concardinate());
//		length();
//		countUpperLowerSymbols();
		numberCharacters();

	}
	static String reverse(String h)
	{
		String h1="";
		for(int i=h.length()-1;i>=0;i--)
		{
			h1=h1+h.charAt(i);
		}
		if(h1==h)
			return "Palindrome";
		else
			return "Not palindrome";
	}
	static String mutable()
	{
		String s=new String("hello");       //stored in heap
		String b="hello";                  //String constant pool
		if(s.equals(b))         //here this is checking data of object s and variable b "data may be same but address is different"
			return "Equal";
		else
			return "Not equal";
	}
	static String doubleEquals()
	{
		String s=new String("Hello");
		String b="Hello";
		if(s==b)               //checking with address of each object 
			return "equal";    //output:Not Equal
		else
			return "Not Equal";
	
	}
	static String concardinate()
	{
		String b="Hello";
		b=b+" Bye Good Night";
		b=b.concat(" hii");
		return b;	
	}
    static void length()
    {
    	String h="hello";
    	int count=0;
    	for(int i=0;i<h.length();i++)
    	{
    		count++;
    	}
    	System.out.println(count);
    }
    static void  countUpperLowerSymbols()
    {
    	String s="Hello Hii Bye Good Night01@!";
    	int upper=0,lower=0,symbol=0,number=0;
    	for(int i=0;i<s.length();i++)
    	{
    		char c=s.charAt(i);
    		int b=(int)c;
    		if(b>= 65 && b<=90)
    			upper++;
    		else if(b>=97 && b<=122)
    			lower++;
    		else if(b>=48 && b<=57)
    			number++;
    		else
    			symbol++;
    	}
    	System.out.println("Upper case count is="+upper);
    	System.out.println("Lower case count is="+lower);
    	System.out.println("Number count is ="+number);
    	System.out.println("Symbols count is="+symbol);
    }
    static void  numberCharacters()
    {
    	String s="Hello Hii Bye \nGood Night";
    	int charact=0,words=0,lines=1;
    	for(int i=0;i<s.length();i++)
    	{
    		charact++;
    		char c=s.charAt(i);
    		if(c==' ' || i==s.length()-1)
    		{
    			words++;
    		}
    		else if(c=='\n')
    			lines++;
    	}
    	System.out.println("Number of Characters="+charact);
    	System.out.println("Number of words="+words);
    	System.out.println("Numb of lines="+lines);
    }
}
