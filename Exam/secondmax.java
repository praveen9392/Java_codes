class secondmax
{
    public static void main(String[] args) 
    {
        int a[] = {5,7,1,3,9};
        for (int i = 0; i < a.length - 1; i++) 
        {
            for (int j = 0; j < a.length - i - 1; j++) 
            {
                if (a[j] > a[j + 1]) 
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int j = 0; j < a.length; j++) 
        {
            System.out.println(a[j]);
        }
       System.out.println("Second maximum element is: " + a[a.length - 2]);
    }
}