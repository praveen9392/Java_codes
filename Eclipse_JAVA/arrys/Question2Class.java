package arrys;

public class Question2Class 
{
    public static void main(String[] args) 
    {
        int[] a = {10, 20, 30, 40, 50, 60,70};
        int[] arr1 = new int[a.length];
        int b = a.length;
        if (b % 2 == 0)
        {
            int z = a.length / 2;
            int x = a.length - 1;
            int midIndex = z - 1;     // introduce a new variable to keep track of the middle index
            for (int i = 0; i < b; i++)
            {
                if (i < z)
                {
                    arr1[i] = a[midIndex];
                    midIndex--;     // decrement midIndex instead of z
                }
                else 
                {
                    arr1[i] = a[x--];
                }
            }
        }
        else
        {
        	int temp=a[0];
        	a[0]=a[a.length-1];
        	a[a.length-1]=temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}