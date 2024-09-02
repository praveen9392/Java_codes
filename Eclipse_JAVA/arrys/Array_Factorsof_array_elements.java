package arrys;

import java.util.Scanner;

public class Array_Factorsof_array_elements
{

	public static void main(String[] args) 
	{
//		// TODO Auto-generated method stub
//		int arr[]= {10,20,30,40,50};
//		int arr2[]=new int[5];
//		 for(int i=0;i<arr.length;i++)
//		 {
//			 int count=0;
//			for(int j=1;j<=arr[i];j++)
//			{
//				if(arr[i]%j==0)
//					count++;
//			}
//			arr2[i]=count;                        //input:10 20 30 40 50 
//			System.out.print(arr2[i]+" ");       //output is: 4 6 8 8 6 
//		 }
		  Scanner s=new Scanner(System.in);
		  System.out.print("Enter array elements:");
		  int arr[]=new int[5];         
		  int arr2[]=new int[5];
		  for(int i=0;i<arr.length;i++)
		  {
			  arr[i]=s.nextInt();
		  }
		  System.out.print("Factors of array elements:");
		  for(int i=0;i<arr.length;i++)
		  {
				 int count=0;
				for(int j=1;j<=arr[i];j++)                 
				{                                          //Enter array elements:1 2 3 4 5                                       
					if(arr[i]%j==0)                        //Factors of array elements:1 2 2 3 2 
						count++;
				}
				arr2[i]=count;
				System.out.print(arr2[i]+" ");       
		  }
		  s.close();
	}

}
