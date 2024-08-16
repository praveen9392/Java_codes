// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class recu
{
    public static void main(String[] args)
    {
        recu h=new recu();
        System.out.println(h.ab(25,0));
    }
    int ab(int n,int sum)
    {
        if(n==0)
        {
          int rem=n%10;
          sum=sum+rem;
          return ab(rem,sum);
        }
        else
            return  sum;
    }
}