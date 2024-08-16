class LargeSmall
{
 public static void main(String args[])
 {
   int a=30,b=40,c=50,smallest=0,largest=0;
   if (a >= b && a >= c)
   {
     if (b >= c)
    	smallest = c;
        largest=a;
     else 
    	smallest = b;
        largest=a;
   } 
  else if (b >= a && b >= c) 
  {
     if (a >= c) 
        smallest = c;
        largest=b;
     else 
    	smallest = a;
	largest=b;
  } 
  else 
  {
     if (a >= b) 
    	smallest = b;
	largest=c;
     else 
        smallest = a;
	largest=c;
  }
 System.out.println(smallest+"   "+(char)smallest);
}
}