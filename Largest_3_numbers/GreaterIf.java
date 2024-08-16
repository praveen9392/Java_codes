class GreaterIf
{
 public static void main(String args[])
 {
  int a=0,b=9,c=7;
  if (a>b)
  { 
    if(a>c)
    { 
     System.out.println("a is bigger="+a);
    }
    else
    {
     System.out.println("c is bigger="+c);
    }
  }
  else
  {
   if(b>c)
   {
    System.out.println("b is bigger");
   }
   else
   {
    System.out.println("c is bigger");
   }
  }
}
}