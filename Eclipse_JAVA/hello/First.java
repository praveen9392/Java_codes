package hello;
import java.util.Scanner;
public class First
{
    public static void main(String args[]) 
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a number=");
        int a = S.nextInt(), b = a % 100;
        int lastDigit = b % 10;
        int secondLastDigit = (b / 10) % 10;
        if (lastDigit % 2 == 0 && secondLastDigit % 2 == 0)
            System.out.println("last 2 values are even");
        else
            System.out.println("last 2 values are not even");
    }
}