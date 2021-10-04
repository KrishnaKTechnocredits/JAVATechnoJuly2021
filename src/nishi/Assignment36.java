/*WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.

input : "good morning"
output: "giod mornong"*/


package nishi;

public class Assignment36 {
	
	boolean isVowel(char c)
	{
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			return true;
		else
			return false;
	
	}
	
	String getReplaceVowel(String input)
	{
		char[] c=input.toCharArray();
		String c1="";
		int vowelCnt=0;
		for(int i=0;i<c.length;i++)
		{
			if(isVowel(c[i]))
			{
				vowelCnt++;
				c1+=c[i];
			}			
		}
		for(int j=0;j<c.length;j++)
		{
			if(isVowel(c[j]))
			{
				c[j]=c1.charAt(--vowelCnt);
			}
		}	
		return String.valueOf(c);
	}
	
		public static void main(String[] args)
		{
			String input="good morning";
			System.out.println(new Assignment36().getReplaceVowel(input));
			//String input1="amol";
			//System.out.println(new Assignment36().getReplaceVowel(input1));
			
		}

	}

