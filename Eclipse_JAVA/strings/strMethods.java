package strings;

import java.util.Arrays;

public class strMethods
{
	public static void main(String[] args)
	{
//		strMethods sr=new strMethods();
//		sr.split();
//		immutable();
//		compareto();
//		concordination();
//		substr();
//		split1();
//		splitCharacters();
//		reverse();
//		rev();
//		replace();
//		extract();
//		vowels();
//		intern();
//		Maxrepeated();
//		extract1();
//		substring();
		zoho();
//		String S="i,like,this.program.very.much";
//		strMethods s=new strMethods();
//		System.out.println(s.reverseWords(S));
//		rev1();
//		 array();

	}
	
	 void split()
	{
		String s="Hello hii Good Morning";
		char ctr[]=s.toCharArray();
		
		System.out.println(Arrays.toString(ctr));
		
		String s1[]	=s.split(" ");
		System.out.println(Arrays.toString(s1));
		for(int i=0;i<s1.length;i++)
		{
			String str=s1[i];
			char c[]=str.toCharArray();
			System.out.println(Arrays.toString(c));	
		}
		
		
	}
	static void immutable()
	{
		String st= new String("hii");
		String sv= new String("hii");
		String sj= new String("hii");
		String sn="hii";
		System.out.println(st.hashCode());
		System.out.println(sv.hashCode());
		System.out.println(sj.hashCode());
		System.out.println(sn.hashCode());
	}
	static void compareto()
	{
//		String s1="hello",s2="Hello";
//		System.out.println(s1.compareTo(s2));      // o/p: +ve value so ,s1 is greater
		
//		String s1="Hello",s2="Hello";
//		System.out.println(s1.compareTo(s2));      // o/p: 0 equal
		
		String s1="HellO",s2="Hello";
		System.out.println(s1.compareTo(s2));      //o/p: -ve so s2 is greater
	}
	static void concordination()
	{
		String s1="hello";
		s1=s1.concat("hooooo");
		System.out.println(s1);
	}
	static void substr()
	{
		String s="abc";
		for(int i=0;i<s.length();i++) 
		{
		    System.out.println(s.charAt(i));
		}
		for(int i=0;i<s.length();i++)
		{
		    System.out.println(s.substring(i));
		}
	}
	static void split1()
	{
		String s="hello all good morning",s2="";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			String word=s1[i];
			if(i%2==0)
				s2=s2+word.toUpperCase()+" ";
			else
				s2=s2+word.toLowerCase()+" ";
			
		}
		System.out.println(s2);
		
	}
	static void splitCharacters()
	{
		String s="hello all good morning",s2="";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			String word=s1[i];
			for(int j=0;j<word.length();j++)
			{
				if(j==0 || j==word.length()-1)
				{
					if(word.charAt(j)>='A' && word.charAt(j)<='Z')
						s2=s2+word.charAt(j);
					else
						s2=s2+(char)(word.charAt(j)-32);
				}
				else
				{
					if(word.charAt(j)>='a' && word.charAt(j)<='z')
						s2=s2+word.charAt(j);
					else
						s2=s2+(char)(word.charAt(j)-32);
				}
			}
			s2=s2+" ";
		}
		System.out.println(s2);
	}
	static void reverse()
	{
		String s="hello all good morning",s2="";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			String word=s1[i];
			StringBuffer sb=new StringBuffer(word);
			s2=s2+sb.reverse()+" ";
		}
		System.out.println(s2);
	}
	static void rev()
	{
		String s="hello all good Morning",s2="";
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			String b=a[i];
			char c[]=b.toCharArray();
			Arrays.sort(c);
			for(int j=0;j<c.length;j++)
			{
				s2=s2+c[j];
			}
			s2=s2+" ";	      
		}
		System.out.println(s2);
	}
	static void replace()
	{
		String s="hello all good Morning",s2="";
		s2=s.replaceAll("hello","Hii");
		System.out.println(s2);
		
	}
	static void extract()
	{
		String s="Vital information renew update size",s2="";
		String st[]=s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			String word=st[i];
//			char c[]=word.toCharArray();
			s2=s2+word.charAt(0);
		}
		System.out.println(s2);
	}
	static void vowels()
	{
		String s="Vital information renew update size",s2="";
		String st[]=s.split(" ");
		int z[]=new int[st.length];
		for(int i=0;i<st.length;i++)
		{
			String word=st[i];
			int count=0;
			for(int j=0;j<word.length();j++)
			{
				char c=word.charAt(j);
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' ||c=='I' || c=='O' ||c=='U')
				{
					System.out.println(word+" vowel letter is="+c);
					count++;
				}
			}
			z[i]=count;
		}
		int max=0, b=0;
		for(int i=0;i<z.length;i++)
		{
			if(z[i]>max)
			{
				max=z[i];
				b=i;
			}    
		}
		System.out.println();
		System.out.println(st[b]+" Contains the maximum vowels count="+max);
	}
	static void intern()
	{

		String s=new String("hellooo").intern();
		System.out.println(s.hashCode());
		String s1="hello";
		System.out.println(s1.hashCode());
		StringBuffer sb=new StringBuffer("hello");
		int b=sb.indexOf("l");
		System.out.println(sb.deleteCharAt(b));
		System.out.println(sb.indexOf(s,b));
	}
	static void Maxrepeated()
	{
		String s="hello",str="";
		int b=s.length();
		int a[]=new int[b];
		for(char i='A';i<='Z';i++)
		{
			String sb=String.valueOf(i);
			for(int j=0;j<s.length();j++)
			{
				char c=s.charAt(j);
				String st=String.valueOf(c);
				if(sb.equalsIgnoreCase(st))
					 str=str +st;
			}
		}
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			String s1=String.valueOf(c);
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				char ch=s.charAt(j);
				String s2=String.valueOf(ch);
				if(s1.equals(s2))
					count++;
			}
			a[i]=count;
		}
		int max=0,index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				index=i;
			}
		}
		System.out.println(str);
		System.out.println(s.charAt(index)+" maximum repeated lement with count="+max);
		System.out.println(Arrays.toString(a));
	}
	static void extract1()
	{
		String s="a1b2c3",s2="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='A' && c<='Z' || c>='a' && c<='z')
			{
				s2=s2+c;
			}
		}
		for(int i=0;i<s2.length();i++)
		{
			char c=s2.charAt(i);
			for(int j=0;j<=i;j++)
			{
				System.out.print(c);
			}
		}
		char c=s.charAt(s.length()-1);
		int b=c-'0';
		System.out.println(b*2);
		
	}
	static void substring()
	{
		String s = "abc";
		for (int i = 0; i < s.length(); i++)
		{
		    System.out.println(s.substring(i));
		}
		for (int i = 0; i < s.length()-1; i++) 
		{
			for(int j=0;j<s.length();j++)
			{
		     System.out.println(s.substring(i,i+1));
			}
		}
		
	}
	static void zoho()
	{
		String s="a1b2c3";
		for(int i=0;i<s.length();i+=2)
		{
			char c=s.charAt(i+1);
			int a=c-'0';             //(or) int a=Integer.parseInt(String.valueof(c));
			for(int j=0;j<a;j++)
			{
				System.out.println(s.charAt(i));
			}
		
		}
	}
	String reverseWords(String S)
    {
        String b=S,s2="";
        String a[]=b.split("\\.");
        for(int i=a.length-1;i>=0;i--)
        {
        	if(i!=0)
               s2=s2+a[i]+".";
        	else
        		s2=s2+a[i];
        }
        return s2;
    }
	static void rev1()
	{

        String b="i.like.this.program.very.much",s2="";
        String a[]=b.split("\\.");
        System.out.println(Arrays.toString(a));
	}
	static void array() 
	{
		int arr[]= {1,2,3,5};
		Arrays.sort(arr);
		int b=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(b==arr[i])
				b++;
			else
				break;
		}
		System.out.println(b);
	}
}
