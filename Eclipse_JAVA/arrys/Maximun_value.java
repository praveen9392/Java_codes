package arrys;

public class Maximun_value 
{
    public static void main(String[] args)
    {
        int a[]={10,20,30,40,50,60,13,45,68,79};
        int y=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=1;j<a.length;j++)
            {
                if(a[i]<a[j])
                     y=a[j];
            }
        }
        System.out.print(y);
    }
}


