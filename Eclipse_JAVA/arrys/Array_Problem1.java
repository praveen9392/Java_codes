package arrys;

public class Array_Problem1 
{
  public static void main(String args[]) 
  {
    int[] arr = {10, 20, 30, 40, 50};
    int[] arr1 = new int[5];
    for (int x = 0; x < arr.length; x++)
    {
      if (x == 0)
      {
        arr1[x] = arr[x] + arr[x + 1];
      } 
      else if (x == arr.length - 1)
      {
        arr1[x] = arr[x] + arr[x - 1];
      } 
      else
      {
        arr1[x] = arr[x - 1] + arr[x + 1];
      }
      System.out.print(arr1[x]+" ");
      
    }
//    for(int i=0;i<arr1.length;i++)
//    {
//    	System.out.println(arr1[i]);
//    }
  }
}


