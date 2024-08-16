class Rectangle
{
 public static void main(String args[])
 {
  int w=4,l=5;
  double area=l*w;
  double perimeter=2*(l+w);
  System.out.println("area of rectangle ="+area);
  System.out.println("perimeter of rectabgle ="+perimeter);
  if(area>perimeter)
  {
    System.out.println("area is greater than perimeter");
  }
  else
  {
   System.out.println("not");
  }
}
}
