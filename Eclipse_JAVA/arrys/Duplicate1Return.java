package arrys;

public class Duplicate1Return {

    public static void main(String[] args) {
        System.out.println(duplicate());
    }

    static int duplicate()
    {
        int a[] = {1, 2, 3, 4}; // Array for testing

        // Iterate through each element
        for (int i=0; i < a.length; i++) 
        {
            int count = 1;
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[i] == a[j] && a[j] != 0) 
                {
                    a[j] = 0; // Mark duplicates as zero
                    count++;
                    
                }
            }
            if (count > 1 && a[i] != 0) {
                return a[i];
            }
        }
         return -1; // No duplicates found
       
    }

}
