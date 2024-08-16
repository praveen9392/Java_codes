class fibo
{
 public static void main(String args[])
 {
  int a=0,b=1,c,i=1;
  while(i<=10)  //1<=10 2<=10  3<=10
  { 
   System.out.println(a+" "); //0 1 1
   c=a+b;    //0+1=1  1+1=2
   a=b;      //1     1
   b=c;     //1     2
   i++;     
  }

}
}
    
 