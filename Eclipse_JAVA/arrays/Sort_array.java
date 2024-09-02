package arrays;

public class Sort_array 
{
    public static void main(String[] args) 
    {
        int a[] = {3, 1, 7, 5, 4, 9,2};
        int count=0;
        for (int i = 0; i < a.length-1; i++)       
        {
            for (int j = 0; j < a.length-1; j++) 
            {
            	count++;
                if (a[j] > a[j + 1]) 
                {   
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int j = 0; j < a.length; j++)
        {
            System.out.println(a[j]);
        }
        System.out.println("count="+count);
    }
}