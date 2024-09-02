package strings;

public class Question11To20 
{
	public static void main(String[] args) 
	{
//		StringVowCon();	
		duplicateCharacter();

	}
	static void StringVowCon()
	{
		String h="Hii Bye Good Night";
		int vowels=0,consonat=0;
		for(int i=0;i<h.length();i++)
		{
			char c=h.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' ||c=='I' || c=='O' ||c=='U')
			{
				vowels++;
			}
			else if((c>'A' && c<='Z') || (c>'a' && c<='z') )
			{
				consonat++;
			}
		}
		System.out.println("Vowels count is="+vowels);
		System.out.println("Consonant count is="+consonat);
	}
	static void duplicateCharacter()
	{
		String s="1234567121122",s2="";
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			char c=s.charAt(i);
			for(int j=i+1;j<s.length();j++)
			{
				char d=s.charAt(j);
				if(c==d)
				{
					count++;
				}
			}
			if(count>1 && s2.indexOf(c)==-1)
				s2=s2+c;
				System.out.println(c+" count is="+count);
		}
	}

}
