package arrys;

public class ArrayHalfHalf
{

    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5, 6,7};
        int[] arr2 = new int[arr.length / 2];
        int[] arr3 = new int[arr.length - arr2.length];

        int b = arr.length, c = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            if (i < b / 2)
            {
                arr2[i] = arr[i];
            } 
            else {
                arr3[c] = arr[i];
                c++;
            }
        }

        for (int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++)
        {
            System.out.print(arr3[i]+" ");
        }
    }
}