package strings;

public class zohoo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		String s="a11b2c3";
//		String[] arr=s.split("");
//		System.out.println(Arrays.toString(arr));
//		repeatedString();
		string1();
//		s();
		

	}
	static void repeatedString()
	{
		String s="a1b2c7";
		for(int i=0;i<s.length();i+=2)
		{
			char c=s.charAt(i+1);
			int b=c-'0';
//			System.out.println(b);
			for(int j=0;j<b;j++)
			{
				System.out.println(s.charAt(i));
			}
			
		}
	}
	static void string()
	{
		String s="a1b12c13";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isAlphabetic(c))
			{
				String s1="";
		       for(int j=i+1;j<s.length();j++)
		       {
		    	   char ch=s.charAt(j);
		    	   if(Character.isDigit(ch))
		    	   {
		    		   s1=s1+ch;
		    	   }
		    	   else
		    		   break;
		       }
		       int x=Integer.parseInt(s1);
		       for(int z=0;z<x;z++)
		       {
		    	   System.out.print(c);
		       }
		       System.out.println();
		       
			}
		}
	}

	static void string1() 
	{
		String s="11b12c13d";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isDigit(c))
			{
				String s1=""+c;
		       for(int j=i+1;j<s.length();j++)
		       {
		    	   char ch=s.charAt(j);
		    	   if(Character.isAlphabetic(ch))
		    	   {
		    		   s1=s1+ch;
		    	   }
		    	   else
		    	   {
		    		   break;
		    	   }
		       }
		       int x=Integer.parseInt(s1);
		       for(int z=0;z<=x;z++)
		       {
		    	   System.out.println();
		       }
		       System.out.println();
			}
		}
	}
}
