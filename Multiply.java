class Multiply
{
    public static void main(String args[]) 
    {
        int a = 100, i = 1,sum=0;
        long mul=1;

        while (i <= a)
        {
            if (i%2 == 0) 
	    {
                sum=sum+i;
            }
            else
	    {
             mul=mul*i;
	    }
            i++;
        }
         System.out.println(sum);
         System.out.println(mul);

    }
}