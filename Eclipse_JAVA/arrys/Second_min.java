package arrys;

import java.util.Arrays;

public class Second_min
{
  public static void main(String args[])
  {
	  int a[]= {70,20,30,40,50,50};
	  Arrays.sort(a);
	  System.out.println(Arrays.toString(a));
	  for(int i=1;i<a.length;i++)
	  {
		  if(a[0]!=a[i])
		  {
			  System.out.println("second minimum is="+a[i]);
			  break;
		  }
	  }
	  for(int i=a.length-2;i<a.length;i--)
	  {
		  if(a[a.length-1]!=a[i])
		  {
			  System.out.println("second maximum is="+a[i]);
			  break;
		  }
	  }
	  System.out.println("Maximum element is="+a[a.length-1]);
	  System.out.println("Minimun element is="+a[0]);  
  }
}
