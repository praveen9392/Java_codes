class UppertoLower 
{
    public static void main(String[] args)
     {
        char ch = 'A';
        int Ascii = (int) ch;
        if (Ascii >= 65 && Ascii <= 90) 
        {
            Ascii += 32;
            System.out.print((char) Ascii);
        } 
	else if (Ascii >= 97 && Ascii <= 122) 
	{
            Ascii -= 32;
            System.out.print((char) Ascii);
        }
        else
        {
            System.out.print("Invalid");
        }
    }
}