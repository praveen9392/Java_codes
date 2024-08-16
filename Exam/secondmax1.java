import java.util.Scanner;

class secondmax1
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < a.length; i++) 
        {
            a[i] = s.nextInt();
        }
        for(int i=0;i<=a.length-1;i++)
	{
 		for(int j=i;j<a.length-1;j++)
		{
		  if(a[j]>a[j+1])
		   {
  		     int temp=a[j];
		         a[j]=a[j+1]; 
			 a[j+1]=temp;
	           }
                }
        }  
         System.out.println();
        for (int j = 0; j < a.length; j++) 
        {
            System.out.print(a[j]+" ");
        }
        System.out.println("Second maximum element is: " + a[a.length - 2]);
    }
}