package arrys;

public class Duplicate_return
{

    public static void main(String[] args) 
    {
        System.out.println(duplicate(0));
    }

    static int duplicate(int i) 
    {
        int a[] = {1, 2, 3, 4, 4, 3}; // Array for testing

        if (i >= a.length) 
        {
            return -1; // End of array, no more elements to check
        }

        int count = 1;
        for (int j = i + 1; j < a.length; j++)
        {
            if (a[i] == a[j] && a[j] != 0) 
            {
                a[j] = 0; // Mark duplicates as zero
                count++;
            }
        }

        if (count > 1 && a[i] != 0) 
        {
            System.out.println(a[i]); // Print the duplicate element
        }

        return duplicate(i + 1); // Move to the next element in the array
    }
}
