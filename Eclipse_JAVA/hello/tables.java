package hello;

public class tables 
{
  public static void main(String args[])
  {
      for(int x=1;x<=20;x++)
      {
    	  System.out.println(x+"table");
    	  for(int y=1;y<=10;y++)
    	  {
    		  System.out.println(x+"*"+y+"="+x*y);
    	  }
    	  System.out.println();  
      }
  }
}
