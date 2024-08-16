
class patterns1 
{
  public static void main(String args[]) 
   {
     int k=2;  
    for(int i=1;i<=3;i++) 
    {
      for(int j=i;j<3;j++) 
      {
        System.out.print(" ");
      }
      for(int j=0;j<k;j++) 
      { int count=0;
        if(k%2==0)
	{
           count++;
        }
        if(count==2)
        {
          System.out.print(k + " ");
        }  
      }
      System.out.println();
    }
  }
}