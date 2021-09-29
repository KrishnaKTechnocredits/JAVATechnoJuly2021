/*Assignment 36: 22nd Sep 2021

WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.

input : "good morning"
output: "giod mornong"

input : "amol"
output: "omal"

input : "haorseuih"
output: "hiurseoah"*/

package shraddha.Assignment36;

public class SwapVowelsInString {
	public static void main(String[] args) {
		String input1 = "good morning";
		String input2 = "amol";
		String input3 = "haorseuih";
		SwapVowelsInString newObj = new SwapVowelsInString();
		newObj.swapVowel(input1);
		newObj.swapVowel(input2);
		newObj.swapVowel(input3);
	}
	
	void swapVowel(String s) {
		String revVowel = getReverseVowelString(s);
		int vowelIndex=0;
		String output="";

		for(int i=0;i<s.length();i++)
		{
			if(findVowels(s.charAt(i)))
			{
				output+=revVowel.charAt(vowelIndex);
				vowelIndex++;
			}
			else
			{
				output+=s.charAt(i);
			}		
		}
		System.out.println("\nInput String is : "+s+"\nOutput String is : "+output);
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


}
