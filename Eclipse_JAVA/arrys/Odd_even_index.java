package arrys;

public class Odd_even_index
{
    public static void main(String[] args) 
    {

        int[] a=new int[] {10,20,30,40,50,60,70};
		for(int x=0;x<a.length-1;x=x+2)
		{
			int temp=a[x];                             //output: 20 10 40 30 60 50 70 
			a[x]=a[x+1];
			a[x+1]=temp;
		}
		if(true)
		{
			int temp=a[a.length-2];
				a[a.length-2]=a[a.length-1];            //This is used to swap : 70 50
				a[a.length-1]=temp;
		}
		for(int t:a)
			System.out.print(t+" ");                   //output: 20 10 40 30 60 50 70 

        
    }
}