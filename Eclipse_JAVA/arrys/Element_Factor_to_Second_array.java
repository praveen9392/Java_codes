package arrys;

public class Element_Factor_to_Second_array
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        int a[]= {1,3,5,7};
        int b[]=new int[a.length];
        int k=15;
        for(int i=0;i<a.length;i++)
        {    
        	int count=k/a[i];
        	b[i]=count;
        }
        for(int t:b)
        {
        	System.out.print(t+" ");
        }
	}

}
