class patterns 
{
  public static void main(String args[]) 
   {
    int a[]={2,3,5,7,11,13,17,19,23};
    int k = 0;
    for(int i=1;i<=3;i++) 
    {
      for(int j=i;j<3;j++) 

      {
        System.out.print("  ");
      }
      for(int j=0;j<(2*i-1);j++) 
      { 
        System.out.print(a[k] + " ");
        k++;
      }
      System.out.println();
    }
  }
}