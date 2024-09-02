package strings;

import java.util.Arrays;

public class Exam {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//         q1();
//         q2();
//		 q3();
//		 q4();
		 q5();
//		 q31();
         
	}
	static void q1()
	{
		String s="hello 12 all34 good 76",s2="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='1' && s.charAt(i)<='9')
			{
				s2=s2+s.charAt(i);
			}	
		}
		System.out.println(s2);
		StringBuffer sb= new StringBuffer(s2);
		sb.reverse();
		if(sb.toString().contentEquals(s2))
		       System.out.println("Palindrome");
	    else 
		   System.out.println("not Palindrome");
		System.out.println();
		    	   
	}
	static void q2()
	{
		String s="Step1 on2& no pets#",s2="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				s2=s2+s.charAt(i);
			}
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				s2=s2+s.charAt(i);
			}
			
		}
		System.out.println(s2);
		StringBuffer sb= new StringBuffer(s2);
		sb.reverse();
		int  sc=sb.toString().compareToIgnoreCase(s2);
		if(sc==0)
			System.out.println("palindrome");
		else
			System.out.println("not");
		System.out.println();
		
	}
	static void q3() 
	{
		String s="Mu",s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
		}
		if(s.contentEquals(s2))
		       System.out.println("Both are same");
	    else 
		   System.out.println("Both are not Same");
		System.out.println("Input string="+s);
		System.out.println("output string="+s2);
		System.out.println();
	}
	static void q4()
	{
		int a[]= {6,17,4,3,5,2};
		String s2="";
		for(int i=0;i<a.length-1;i++)
		{
			int count=0;
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]==a[j])
					count++;
			}
			if(count==0)
				s2=s2+a[i];
		}
		String[] b=s2.split("");
		Arrays.sort(b);
		int k=2;
		System.out.println(Arrays.toString(b));
		System.out.println(k+"rd largest element="+b[b.length-k]);
		System.out.println();
	}
	static void q5() 
	{
		int a[]= {4,3,5,6,2};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-1)
			{
				b[i]=a[i]*a[0];
			}
			else
				b[i]=a[i]*a[i+1];
		}
		System.out.println("Input array="+Arrays.toString(a));
		System.out.println("Output Arrays="+Arrays.toString(b));
	}
	static void q31() 
	{
		String s="mug";  //ugm gmu mug 
		String s1="gum";  
		s=s+s;      //mugmug
		if(s.indexOf(s1)!=-1) 
		{
			System.out.println("rotation");
		}
		else 
		{
			System.out.println("not rotation");
		}
		int a[]= {4,3,5,6,2};
		int b[]=Arrays.copyOf(a,a.length);
		System.out.println(Arrays.toString(b));
		
	}
}
