class GreaterTery
{
 public static void main(String args[])
 {
  int a=5,b=6,c=7;
 
 String d=((a>b && a>c )?("a is larger"):(b>a && b>c)?("b is greater "):("c is greater"));

 System.out.println("Largest of three numbers="+d);
    
}
}

