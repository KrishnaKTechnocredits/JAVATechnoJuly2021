/*Assignment 36: 22nd Sep 2021

WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.

input : "good morning"
output: "giod mornong"

input : "amol"
output: "omal"

input : "haorseuih"
output: "hiurseoah"*/

package shreya_assignment_36_swap_vowel;

public class SwapVowel {
	
	static void getSwapVowel(String str) {
		String vowel="";
		String output="";
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowel+=ch;
			}
		}
		int reverseIndex=vowel.length()-1;
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				output+=vowel.charAt(reverseIndex);
				reverseIndex--;
			}
			else {
				output+=ch;
			}
		}
		System.out.println(output);
		
		
	}
	public static void main(String[] args) {
		SwapVowel swapVowel=new SwapVowel();
		String str1="good morning";
		String str2="amol";
		String str3="haorseuih";
		System.out.println("String after swapping vowel position: ");
		swapVowel.getSwapVowel(str1);
		swapVowel.getSwapVowel(str2);
		swapVowel.getSwapVowel(str3);
		
	}

}
