class SecondLarge
{
 public static void main(String args[])
 {
   int a=30,b=40,c=50,second_largest=0;
   if (a >= b && a >= c)
   {
     if (b >= c)
    	second_largest = b;
     else 
    	second_largest = c;
   } 
  else if (b >= a && b >= c) 
  {
     if (a >= c) 
        second_largest = a;
     else 
    	second_largest = c;
  } 
  else 
  {
     if (a >= b) 
    	second_largest = a;
     else 
        second_largest = b;
  }
 System.out.println(second_largest+"   "+(char)second_largest);
}
}