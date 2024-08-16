class student
{
 public static void main(String args[])
 {
  int marks=450,scholarship,fee=50000,donation;
  if(marks>470)
  {
   scholarship=10000;donation=0;
  }
  else
  {
   scholarship=0;donation=10000;
  }
  fee=fee+donation-scholarship;
  System.out.println("Payable ammount="+fee);
}
}
