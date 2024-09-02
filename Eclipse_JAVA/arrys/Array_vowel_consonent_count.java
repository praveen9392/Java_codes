package arrys;

public class Array_vowel_consonent_count
{
    public static void main(String[] args) 
    {
        char c[] = {'a', 'b', 'e', 'o', 'i', 'x','i'};
        int Count = 0, Count1 = 0;
        for (int i = 0; i < c.length; i++) 
        {
            if (c[i]== 'a'|| c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' || c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U')
            {
                Count++;
            } 
            else
            {
                Count1++;
            }
        }
        System.out.println("Vowel count: " + Count);
        System.out.println("Consonant count: " + Count1);
    }
}