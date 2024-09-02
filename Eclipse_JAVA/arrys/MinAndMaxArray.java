package arrys;

public class MinAndMaxArray {
    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, -4};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                second_max = max;
                max = a[i];
            } 
            else if (a[i] < min)
            {
                min = a[i];
            } 
            else if (a[i] > second_max && a[i] != max)
            {
                second_max = a[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Second Max: " + second_max);
       
    }
}