package competative_Questions;

import java.util.Arrays;

public class accenture {

	public static void main(String[] args) 
	{
//		accenture.peak_value();
//		accenture.ksmallest();
//		prime_miss();
//		contigious();
//		anagram();
//		substring();
//		binary();
//		subarray();
//		Binarycode();
		Binary1();
		
	}
	static void str()
	{
		String s="apple";         //  output as  : paale     replace a <--> p
		s=s.replaceAll("a", "e");
		s=s.replaceAll("p", "a");
		s=s.replaceAll("e", "p");
		System.out.println(s);
	}
	static void peak_value()
	{
		int a[]= {10,20,30,40,50,30};          //pick a element which is not smaller than its neighbours
		for(int i=0;i<a.length;i++)            //  {5,10,20,15}     --->20 is peak value
		{
			if(i==a.length-1)
			{
				if(a[i-1]<a[i]&&a[i]>a[0])
					System.out.println("peak value="+a[i]);
			}
			else if(i==0)
			{
				if(a[i+1]<a[i] && a[i]>a[a.length-1])
					System.out.println("Peak value="+a[i]);
			}
			else if(a[i-1]<a[i] && a[i]>a[i+1])
			{
				System.out.println("peak value="+a[i]);	
			}
		}
	}
	static void ksmallest()
	{
		int a[]= {1,2,3,7,9,4,5,8,4,7},k=5;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		String s="";
		for(int i=0;i<a.length;i++)
		{
			if(i<a.length-1) 
			{
				if(a[i]!=a[i+1])
			         s=s+a[i];
			}
			else
				s=s+a[i];
		}
	    System.out.println(s);
	    System.out.println("K Smallest value is="+s.charAt(k-1));
	    System.out.println("k largest value is="+s.charAt(s.length()-k));		
	}
	static void prime_miss()
	{
		int a[]= {2,8,7,11,2,1,7};
		int b[]=Arrays.copyOf(a, a.length);
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[i]=0;
					a[j]=0;
				}
			}	
		}
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			if(a[i]==0)
				continue;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}	
			}
			if(count==2)
				System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	static void contigious()
	{
		int a[]= {1,2,3,5,7,4},z=1;
		for( int i=0;i<a.length;i++)
		{
			if(a[i]<a[i+1])
			{
				z++;  //1
				System.out.println(a[i]+"    "+z);
			}
			else if(a[i]==a[i+1])
			{    
				break;
			}
			else
			{
				break;
			}
		}
		System.out.println(z);
		
	}
	static void anagram()
	{
		String s1="bcajk",s2="abc";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			for(int j=0;j<s2.length();j++)
			{
				char ch=s2.charAt(j);
				if(c==ch)
					count++;
			}
		}
		if(count>=s2.length())
		{
			System.out.println("Anagram");
			System.out.println(s1.length()-s2.length());
		}
		
	}
	static void substring()
	{
		String s="abc";
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i;j<=s.length();j++)
			{
				System.out.println(s.substring(i,j));
			}
		}
	}
	static void binary()
	{
		int a=10;
		String s="";
		char[] b=Integer.toString(a).toCharArray();
		for(int i=0;i<b.length;i++)
		{
			int c=Character.getNumericValue(b[i]);
			if(c==1)
				s=s+0;
			else
				s=s+1;
		}
		System.out.println(s);
	}
	static void copy()
	{
		int a[]= {1,2,3};
		int b[]= {5,6,7};
		int c[]=new int[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println(Arrays.toString(c));
	}
	static void Binarycode()
	{
		int a=10100,sum=0,z=0;
		int b[]= {1,2,4,8,16,32,64,128,256,512,1024,2048,4096};
		String s=Integer.toString(a);
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			if(Character.getNumericValue(c)==1)
				sum+=b[z];
			z++;
		}
		System.out.println(sum);
		
	}
	static void Binary1()
	{    int a = 10100; 
    int sum = 0; 
    int power = 1; // Start with power of 2^0 (1)

    while (a > 0) {
        int rem = a % 10;
        if (rem == 1) {
            sum += power; // Add the current power of 2
        }
        power *= 2; // Multiply power by 2 for the next position
        a = a / 10; 
    }

    System.out.println(sum); 

	}	
}
