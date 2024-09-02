package competative_Questions;



public class Zoho {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		   q1();
		printPattern(6);
	}
	static void q1()
	{
		String s="HelloGoodMorningSir";   //"123456789" it works in all cases
		int a=0,b=s.length()-1;
		for(int i=1;i<=s.length();i++)
		{
			for(int j=1;j<=s.length();j++)
			{
				if(i==j)
					System.out.print(s.charAt(a++));
				else if(i+j==s.length()+1)
					System.out.print(s.charAt(b--));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	static void q2()
	{
		String s="(abc)((b))";
		//String a[]=s.split("");
		for(int i=0;i<s.length();i++)
		{
			
			
		}
				
	}

	static void printPattern(int n) 
	{
        // Loop for each starting point in the pattern
        for (int start = 1; start <= n; start++)
        {
            int number = start;  // Initialize the starting number for each line
            int increment = n;   // Set initial increment to n

            // Loop to print numbers in the current line
            for (int i = start; i <= n; i++) 
            {
                System.out.print(number + " ");  // Print the current number
                number += increment;  // Update the number by adding the current increment
                increment--;  // Decrease the increment for the next step
            }
            System.out.println();  // Move to the next line after finishing one line
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

}
