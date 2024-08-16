class month
{
    public static void main(String args[])
    {
        String a="January";
        if(a=="January" || a=="March" || a=="May" || a=="July" || a=="August" ||a=="October" || a=="December")
	{
	 System.out.println("It has 31 days");
	}
        else if(a=="April" || a=="June" || a=="September" ||a=="November")
	{
	 System.out.println(a+"= has 30 days");
         }
        else
        {
         System.out.println(a+"=has 28 days");
 	}
    }
}