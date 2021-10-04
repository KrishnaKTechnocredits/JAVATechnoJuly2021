package somnath_Assignment_36;
		/*Assignment 36: 22nd Sep 2021
			WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.
			i/n: "good morning"
			o/p : "giod mornong"
			i/n : "amol"
			o/p : "omal"
			i/n : "haorseuih"
			o/p : "hiurseoah"    */


public class Assignment_36 {

	void swapVowels(String str)
	{
		String revVowel = getRevVowelString(str);
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
		System.out.println("\nInput String : "+str+"\nOutput String: "+output);
		}
	String getRevVowelString(String str)
	{
		String revVowels="";


			for(int i=str.length()-1;i>=0;i--)
			{
				if(findVowels(str.charAt(i)))
				{
				revVowels+=str.charAt(i);
		}

		}
		
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
		Assignment_36 as = new Assignment_36();

		as.swapVowels("good morning");
	    as.swapVowels("amol");
		as.swapVowels("haorseuih");
	}
} 
