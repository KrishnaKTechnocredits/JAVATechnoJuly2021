/*Assignment 36: 22nd Sep 2021
WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.
input : "good morning"
output: "giod mornong"
input : "amol"
output: "omal"
input : "haorseuih"
output: "hiurseoah"*/

package manaswi;

public class Assignment_36 
{
	static void getSwapVowel(String str) 
	{
		String vowel = "";
		String output = "";
		for (int index = 0; index < str.length(); index++) 
		{
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
			{
				vowel += ch;
			}
		}
		int reverseIndex = vowel.length() - 1;
		for (int index = 0; index < str.length(); index++) 
		{
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
			{
				output += vowel.charAt(reverseIndex);
				reverseIndex--;
			} else {
				output += ch;
			}
		}
		System.out.println(output);

	}

	public static void main(String[] args)
	{
		String str1 = "good morning";
		String str2 = "amol";
		String str3 = "haorseuih";
		System.out.println("String after swapping vowel position: ");
		Assignment_36.getSwapVowel(str1);
		System.out.println("String after swapping vowel position: ");
		Assignment_36.getSwapVowel(str2);
		System.out.println("String after swapping vowel position: ");
		Assignment_36.getSwapVowel(str3);
	}
}