package hello;

class Recurssion {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        palindrome(6556, 0);
    }

    static void palindrome(int x, int rev) {
        if (x == 0) {
            System.out.println(rev);
            if (x == rev) {
                System.out.println("palin");
            } else {
                System.out.println("not");
            }
        } else {
            rev = rev * 10 + x % 10;
            palindrome(x / 10, rev);
        }
    }
}