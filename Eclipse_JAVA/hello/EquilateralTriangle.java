package hello;

public class EquilateralTriangle
{
    public static void main(String[] args) 
    {
        int rows = 7;

        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= rows - i; j++) //i=1 ,i=2  i=3  i=4 i=5 6 7
            {
                System.out.print("  ");  //6 spaces  ,5   4  3  2 1 
            }
            for (int j = 1; j <= 2 * i - 1; j++)     //
            {
                if (j == 1 || j == 2 * i - 1 || i == rows) 
                {
                    System.out.print("* ");
                } else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
/*
 * i = 1: 6 spaces, 1 star
i = 2: 5 spaces, 3 stars
i = 3: 4 spaces, 5 stars
i = 4: 3 spaces, 7 stars
i = 5: 2 spaces, 9 stars
i = 6: 1 space, 11 stars
i = 7: 0 spaces, 13 stars
 */
