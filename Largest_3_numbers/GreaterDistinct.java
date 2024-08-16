class GreaterDistinct
{
 public static void main(String args[])
 {
  int a=5,b=6,c=6;
  if(a>b && a>c)
  { 
   System.out.println("a is bigger="+a);
  }
  else if(b>c && b>a)
  {
   System.out.println("b is bigger="+b);
  }
  else if(c>a && c>b)
  {
   System.out.println("C is bigger="+c);
  }
  else 
  {
   System.out.println(" Numbers are not unique ");  // let us say if a=30,b=30,c=10 ,it will print
  }
}
}
  
   