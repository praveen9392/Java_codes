package resurssion;

public class PrimeCheck {

    public static void main(String[] args) {
        int number = 27; // Number to check
        if (prime(number, 2)) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }

    static boolean prime(int n, int i) {
        // Base case: if 'n' is less than or equal to 1, it's not prime
        if (n <= 1) {
            return false;
        }
        // Base case: if 'i' exceeds the square root of 'n', it's prime
        if (i >= n) {
            return true;
        }
        // Base case: if 'n' is divisible by 'i', it's not prime
        if (n % i == 0) {
            return false;
        }
        // Recursive case: check the next number
        return prime(n, i + 1);
    }
}
