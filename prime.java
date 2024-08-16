class prime
{
 public static void main(String args[])
 {
  int num=22,start=2;
  String status="prime";
  while(start<23)
  {
   if (num%start==0)
   {
    status="Not prime";
    break;
   }
   start++;
  }
  System.out.println(status);
}
}