package arrys;

public class Second_largest_factor
{
	   public static void main(String[] args)
	    {
	        System.out.println("Input elements are :10,20,30,40,50,60,13,45,68,7");
	    	int a[]={10,20,30,40,50,60,13,45,68,7};
	        int b[]=new int[a.length],y=0;
	        System.out.print("Second Highest factor : ");
	        for(int i=0;i<a.length;i++)
	        {
	            for(int j=1;j<a[i];j++)
	            {
	                if(a[i]%j==0)
	                     y=j;
	            }
	            b[i]=y;
	            System.out.print(b[i]+" ");
	        }
	    }
}
