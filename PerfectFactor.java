class PerfectFactor 
{
    public static void main(String args[]) 
    {
        int number = 28, i = 1, sum = 0;
        while (i < number)
        {
            if (number % i == 0)
            {
                sum += i;
            }
            i++;
        }
        System.out.println(number+"  ");
        System.out.print(sum == number); // prints true if the number is perfect, false otherwise
    }
}