package hello;

import java.util.Scanner;

public class Srong_range {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = s.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = s.nextInt();

        for (int i = start; i <= end; i++) {
            int sum = 0;
            int temp = i;
            while (temp != 0) {
                int digit = temp % 10;
                int factorial = 1;
                for (int j = 1; j <= digit; j++) {
                    factorial *= j;
                }
                sum += factorial;
                temp /= 10;
            }
            if (sum == i) {
                System.out.println(i + " is a strong number");
            }
        }
    }
}