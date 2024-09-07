public class except
 {
    public static void main(String args[])
    {
        try
        {
            try
	    {
                String s = "hello";
                System.out.println(s.charAt(6));
            } 
            catch (StringIndexOutOfBoundsException e) 
            {
                System.out.println("Error: Index out of bounds. The string only has 5 characters.");
                System.out.println("Exception message: " + e.getMessage());
            }
        } 
        finally 
        {
            System.out.println("hello");
        }
    }
}