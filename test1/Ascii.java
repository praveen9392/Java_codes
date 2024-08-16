class Ascii
{
 public static void main(String args[])
 {
  int a=160;
  if(a>=65 && a<=90)
  { 
   System.out.println("Upper case");
  }
  else if(a>=96 && a<=122)
  { 
   System.out.println("Lower case");
  }
   else if(a>=48 && a<=57)
   { 
    System.out.println("Number");
   }
   else 
   {
   System.out.println("special numbers");
   }
}
}