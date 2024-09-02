package Rotations;

import java.util.Arrays;

public class RemoveElement 
{
  public static void main(String args[])
  {
	     IndexBasedRemove();
	     ElementBasedRemove();
	     AddElement();
	     AddElementMethod2();
  }
  static void IndexBasedRemove()
  {
	  int a[]= {10,20,30,40,50};
	  int index=2;                          // suppose i want to remove element 30 , set as 0 
      for(int i=index;i<a.length-1;i++)     //output:[10, 20, 40, 50, 0]
      {
    	  a[i]=a[i+1];
      }
      a[a.length-1]=0;
      System.out.println(Arrays.toString(a));
  }
  static void ElementBasedRemove()
  {
	  int a[]= {10,20,30,40,50};
	  int b[]=new int[a.length-1];         // complete remove element from array
	  int element=30,z=0;                  //output:[10, 20, 40, 50]        
      for(int i=0;i<a.length;i++)
      {
    	  if(a[i]!=element)
    		   b[z++]=a[i];
      }
      System.out.println(Arrays.toString(b));
  }
  static void AddElement()
  {
	  int a[]= {1,2,3,4,6,7,8,9,0};          // add element at index 4  
	  int index=4,element=5,i;               //output:[1, 2, 3, 4, 5, 6, 7, 8, 9]
	  for(i=a.length-1;i>index;i--)
	  {
		  a[i]=a[i-1];
	  }
	  a[i]=element;
	  System.out.println(Arrays.toString(a));
  }
  static void AddElementMethod2()
  {
	  int a[]= {1,2,3,4,6,7,8,9,0};          // add element at index 4  
	  int b[]=new int[a.length];             //output:[1, 2, 3, 4, 55, 6, 7, 8, 9]
	  int z=0,element=55;
	  for(int i=0;i<a.length-1;i++)
	  {
		  if(i==4)  //4
		  {
			  b[z++]=element;  //b[4]=55
			  b[z++]=a[i];     //b[5]=6	 
		  }
		  else
		  {
			  b[z++]=a[i];  //0 1 2 3 5 6 7 
		  }  
	  }
	  System.out.println(Arrays.toString(b));
  }
}
