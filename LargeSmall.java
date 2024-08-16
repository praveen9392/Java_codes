class LargeSmall
{
 public static void main(String args[])
 {
   int a=35,b=40,c=50,smallest=0,largest=0,second=0;
   if (a >= b && a >= c)
   {
     if (b >= c)
     {
    	smallest = c;
        largest=a;
        second=b;
     }
     else 
     {
    	smallest = b;
        largest=a;
        second=c;
     }
   } 
  else if (b >= a && b >= c) 
  {
     if (a >= c) 
     {
        smallest = c;
        largest=b;
        second=a;
     }
     else 
     {
    	smallest = a;
	largest=b;
        second=c;
     }
  } 
  else 
  {
     if (a >= b) 
     {
    	smallest = b;
	largest=c;
        second=a;
     }
     else 
     {
        smallest = a;
	largest=c;
        second=b;
     }
  }
 System.out.println(smallest+" = "+(char)smallest);
 System.out.println(largest+" = "+(char)largest);
 System.out.println(second+" = "+(char)second);
 

 
}
}