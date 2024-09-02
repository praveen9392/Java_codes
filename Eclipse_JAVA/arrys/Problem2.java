package arrys;
import java.util.Scanner;
public class Problem2 
{
  public static void main(String args[])
  {
	  Scanner s=new Scanner(System.in);
	  System.out.print("Enter array elements:");
	  int arr[]=new int[5];         
	  int arr2[]=new int[5];
	  for(int i=0;i<arr.length;i++)
	  {
		  arr[i]=s.nextInt();
	  }
	  System.out.print("After Operation array elements are:");
	  for(int i=0;i<arr.length;i++)
	  {
		  if(i==0)
			  arr2[i]=arr[i]+arr[i+1];
		  else if(i==arr.length-1)
			  arr2[i]=arr[i]+arr[i-1];
		  else
			  arr2[i]=arr[i-1]+arr[i+1];
	  System.out.print(arr2[i]+" ");
	  }
	  s.close();
  }
}
