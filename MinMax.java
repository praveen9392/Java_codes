class M
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 20;
        int c = 5;
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        int z=min;
        System.out.println((char)z);
    }
}