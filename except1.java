import java.util.Scanner;
import java.util.InputMismatchException;

public class Except1
 {
    public static void main(String args[])
	 {
        try 
	{
            Scanner s = new Scanner(System.in);
            int b = s.nextInt();
            int password = 1234;
            if (b != password)
	    {
                throw new IncorrectException("Incorrect password");
            } 
            else 
            {
                System.out.println("Correct password");
            }
        } 
        catch (IncorrectException e) 
       {
            System.out.println("Exception message: " + e.getMessage());
        } 
        finally 
         {
            System.out.println("hello");
        }
    }
}

class IncorrectException extends RuntimeException
 {
    public IncorrectException(String st) 
     {
        super(st);
    }
}