
/*Assignment 36: 22nd Sep 2021

WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.

input : "good morning"
output: "giod mornong"

input : "amol"
output: "omal"

input : "haorseuih"
output: "hiurseoah"*/

package indu;

public class SwapVowels_A36 {

	void swapVowels(String str)
	{
		String revVowel = getReverseVowelString(str);
		int vowelIndex=0;
		String output="";
		
		for(int i=0;i<str.length();i++)
		{
			if(findVowels(str.charAt(i)))
			{
				output+=revVowel.charAt(vowelIndex);
				vowelIndex++;
			}
			else
			{
				output+=str.charAt(i);
			}		
		}
		System.out.println("\nInput String is : "+str+"\nOutput String is : "+output);
		}
	String getReverseVowelString(String str)
	{
		String revVowels="";
		
		
			for(int i=str.length()-1;i>=0;i--)
			{
				if(findVowels(str.charAt(i)))
				{
				revVowels+=str.charAt(i);
		}
				
		}
		//System.out.println(revVowels);
		return revVowels;
	}
	
	boolean findVowels(char str)
	{
			if(str=='a' ||str=='e'||str=='i'||str=='o'||str=='u' )
			{
				return true;
			}	
		return false;
	}
	
	public static void main(String[] args) {
		SwapVowels_A36 a36 = new SwapVowels_A36();
		
		a36.swapVowels("good morning");
		a36.swapVowels("amol");
		a36.swapVowels("haorseuih");
	}
}
