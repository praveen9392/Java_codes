package arrys;

public class Character {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		char c[]= {'a','b','e','o','i','x','y'};
		int count=0,count1=0;
		for(int i=0;i<c.length;i++)
		{
			if (c[i]== 'a'|| c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' || c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U')
            {
                count++;
            } 
            else
            {
                count1++;
            }
		}
		System.out.println("vowel count are ="+count);
		System.out.println("Consonent count is="+count1);
	}

}
