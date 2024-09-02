package strings;

import java.util.Arrays;

public class Basic_codes 
{
	public static void main(String[] args) 
	{
		
//	    Vowel_to_capital();
//		Vowel_count();
//		Vowel_count_EachWord();
//		palindrome();
//		palindrome1();
//		buffer1();
//		replace();
//		UniqueElements();
//		int a[]= {1,2,3,4,5};
//		int b[]=Arrays.copyOf(a, a.length);
//		System.out.println(Arrays.toString(b));
		String s="hello";
		String st=new String("hello");
         
		System.out.println(s.hashCode());
		System.out.println(st.hashCode());
		System.out.println(s==st);
	}
	static void Vowel_to_capital()
	{
		String s="hello all",s2="";
//		System.out.println(s.length());
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='i' || c=='o' || c=='u' ) 
			{
				int b=(int)c-32;
				s2=s2+(char)b;
			}
			else if(c=='A' || c=='E' ||c=='I' || c=='O' ||c=='U' )
			{
				
				s2=s2+c;
			}
			else if(c==' ')
			{
				s2=s2+"_";
			}
			else
			{
				if((int)c>=65 && (int)c<=90)
				{
					int b=(int)c+32;
					s2=s2+(char)b;
				}
				else if((int)c>=97 && (int)c<=122)
				{
					
					s2=s2+c;
				}
			}
			    
		}
		System.out.println(s2);
	}
	static void Vowel_count()
	{
		String s="hello Bye Good Night";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' ||c=='I' || c=='O' ||c=='U')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
	static void Vowel_count_EachWord()
	{
		String s="hello Bye Good Night";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' ||c=='I' || c=='O' ||c=='U')
			{
				count++;
			}
			else if(c==' ' || i==s.length()-1)
			{
				System.out.println(count);
				count=0;
			}
		}
	}
	static void palindrome()
	{
		String s="hello";
		String s1="Hello";
		if(s.equalsIgnoreCase(s1))
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");	
	}
	static void palindrome1()
	{
		String s="hello";
		StringBuffer s1=new StringBuffer("Hello");
		if(s.equals(s1))
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
	}
	static void buffer()
	{
		Integer a=121;
		String s1=a.toString();
		StringBuffer s=new StringBuffer(s1);
		s.reverse();
		if(s1.contentEquals(s))
				System.out.println("True");
		else
			System.out.println("False");
	}
	static void buffer1()
	{
		Integer a=121;
		String s1=a.toString(),s2;
		StringBuffer s=new StringBuffer(s1);
		s.reverse();
		s2=s.toString();
		if(s1.equals(s2))
				System.out.println("True");
		else
			System.out.println("False");
	}
	static void replace()
	{
		String s="Hello all",s2="";
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				if(s.charAt(i)>='a' && s.charAt(i)<='z')
				{
					char b=(char) (s.charAt(i)-32);
					s2=s2+b;
				}
				else 
				{
					s2=s2+s.charAt(i);
				}		
			}
			else
			{
				if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				{
					char b=(char) (s.charAt(i)+32);
					s2=s2+b;
				}
				else 
				{
					s2=s2+s.charAt(i);
				}
			}
			
		}
		System.out.println(s2);	
	}
	static void UniqueElements()
	{
		String s="hello all Good Morning",s2="";
		System.out.println("Unique elements are:");
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(s.indexOf(c)==s.lastIndexOf(c))
				System.out.println(c);
			if(s.indexOf(c)!=s.lastIndexOf(c) && s2.indexOf(c)==-1)
				s2=s2+c;
		}
		System.out.println("Repeated Strings are="+s2);
	}
}
