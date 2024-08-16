class UppLow
{
     public static void main(String args[])
     { 
        char ch='O';
        if (ch>='A' && ch<='Z')
        { 
         System.out.println("Uppercase");
         if (ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch=='U')
         { 
             System.out.println("Uppercase Vowel");     
         }
         else
         {
           System.out.println("Uppercase letter Not vowel");
         }
        }
        else
        {
          if (ch>='a' && ch<='z')
          { 
            System.out.println("lowercase");
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u')
            { 
             System.out.println("Uppercase Vowel");     
            }
            else
            {
             System.out.println("Lowercase letter Not vowel");
            }
          }
        }
}
}

