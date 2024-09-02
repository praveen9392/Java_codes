package array_Questionare;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 
{
    public static void main(String[] args) 
    {
      // character();
      // stringinput();
       boolinput();
    }
    static void character()
    {
    	Scanner s = new Scanner(System.in);

        char[] inputChars = new char[5];

        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Enter a character: ");
            inputChars[i] = s.next().charAt(0);
        }
        System.out.println("You entered: ");
        for (char c : inputChars) 
        {
            System.out.print(c);
        }
        s.close();
    }
    static void stringinput()
    {
    	Scanner s=new Scanner(System.in);
    	String  st[]=new String[5];
    	for(int i=0;i<st.length;i++)
    	{
    		System.out.print("Enter a String: ");
            st[i] = s.next();	
    	}
    	System.out.println(Arrays.toString(st));
    	s.close();
    }
    static void boolinput()
    {
    	boolean bo[]= {true,false,true,false};
    	Scanner s=new Scanner(System.in);
    	boolean b[]=new boolean[5];
    	for(int i=0;i<b.length;i++)
    	{
    		System.out.print("Enter a boolean: ");
            b[i] = s.nextBoolean();	
    	}
    	System.out.println(Arrays.toString(b));
    	System.out.println(Arrays.toString(bo));
    	s.close();
    }
 
}