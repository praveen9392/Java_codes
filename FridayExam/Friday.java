class Friday
{
 public static void main(String args[])
 {
   // question1();
   // question2();
   // question3();
   // question4();
      question5();

 }

// All questions written in single program using methods


static void question1()
{
  String s="a1b2c3",s2="";
  for(int i=0;i<s.length();i++)
  {
    char c=s.charAt(i);
    if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z'))
    {
       s2=s2+c;
       for(int j=0;j<=i;j++)
       { 
         System.out.print(c);
       }
    }
  }
  s2=s2+"6";
  System.out.println();
  System.out.print(s2);

}

static void question2()
{
  String s="hello",s2="hello";
  
  int b=s.compareTo(s2);
  System.out.print(b);
  if(b>=0)
    System.out.print("Palindrome"); 
  else
    System.out.print("Not palindrome");
}


static void question3()
{
  String s="<< >>" ,s2="Hello",s3="";
  int b=s.length()/2;
  for(int i=0;i<2;i++)
  {
    s3=s3+s.charAt(i);
  }
  for(int i=0;i<s2.length()-1;i++)
  {
    s3=s3+s2.charAt(i);
  } 
  for(int i=b+1;i<s.length();i++)
  {
    s3=s3+s.charAt(i);
  }
  System.out.print(s3); 
}


static void question4()
{
  String s="hello",s2="";
  for(char c='a';c<='z';c++) 
  {
    String sb=String.valueOf(c);
    for(int i=0;i<s.length();i++)
    {
       char ch=s.charAt(i);
       String st=String.valueOf(ch); 
       if(sb.equals(st)) 
           System.out.println(st);
    } 
  }
    int[] count = new int[26];
    for (int i = 0; i < s.length(); i++) 
    {
        char ch = s.charAt(i);
        int index = ch - 'a';
        count[index]++;
    }
    int max = 0;
    int maxIndex = 0;
    for (int i = 0; i < 26; i++)
    {
        if (count[i] > max) {
            max = count[i];
            maxIndex = i;
        }
    }
    char maxChar = (char) (maxIndex + 'a');
    System.out.println("Maximum repeated element = " + maxChar + " with count " + max);
}


static void question5() 
{
    String s = "ara are arora";
   String arr[]=s.split(" ");
   for(int i=0;i<arr.length;i++)
   {
     String s2=arr[i];
     String s3="";
     for(int j=s2.length()-1;j>=0;j--)
     {
        s3=s3+s2.charAt(j);
     }
     if(s2.equals(s3))
         System.out.println(s2+" Palindrome");
    }
}
}


/*  outputs

   question1:
   abbbccccc    
   abc6

   Question2:
   Palindrome

   Question3:
   <<Hell>>
  
   Question4:
e
h
l
l
o
Maximum repeated element = l with count 2
 
Question5:
ara Palindrome
arora Palindrome

*/
