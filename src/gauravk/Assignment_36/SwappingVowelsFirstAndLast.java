package gauravk.Assignment_36;
/*
 * Assignment 36: 22nd Sep 2021

WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.

input : "good morning"
output: "giod mornong"

input : "amol"
output: "omal"

input : "haorseuih"
output: "hiurseoah"
 */
public class SwappingVowelsFirstAndLast {
	
	String swapFirstAndLastVowel(String input) {
		String output = "";
		int minIndex=0;
		int maxIndex=0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)=='a'|| input.charAt(i)=='e'|| input.charAt(i)=='i'|| input.charAt(i)=='o'||input.charAt(i)=='u') {
				minIndex = i;
				break;
			}
		}
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)=='a'|| input.charAt(i)=='e'|| input.charAt(i)=='i'|| input.charAt(i)=='o'||input.charAt(i)=='u') {
				maxIndex = i;
			}
		}
		char firstVowel= input.charAt(minIndex);
		char lastVowel=input.charAt(maxIndex);
		for(int i=0; i<input.length(); i++) {
			if(i==minIndex)
				output += lastVowel;
			else if (i==maxIndex)
				output += firstVowel;
			else output += input.charAt(i);
		}
		return output;
	}
	
	public static void main(String[] args) {
		String s1 = "good morning";
		String s2 = "amol";
		String s3 = "haorseuih";
		SwappingVowelsFirstAndLast vowelSwap = new SwappingVowelsFirstAndLast();
		System.out.println("Swap of ["+s1+"] is output: ["+vowelSwap.swapFirstAndLastVowel(s1)+"]");
		System.out.println("Swap of ["+s2+"] is output: ["+vowelSwap.swapFirstAndLastVowel(s2)+"]");
		System.out.println("Swap of ["+s2+"] is output: ["+vowelSwap.swapFirstAndLastVowel(s2)+"]");
	}
}
