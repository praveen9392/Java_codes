class Twodigit
{
 public static void main(String args[])
 {
  int a=2024,b=2523 ;
  double c=a/100;
  double d=b%100;
  if(c%2==0 && d%2==0)
  {
   System.out.println("c + d is="+(c+d));
  }
  else if(c%2!=0 && c!=0)
  {
    System.out.println("c + d is="+(c*d));
  }
 else
 {
   System.out.print("c-d is ="+(c-d));
 }
}
}

  