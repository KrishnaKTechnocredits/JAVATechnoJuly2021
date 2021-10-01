
/*Assignment 36: 22nd Sep 2021

WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.

input : "good morning"
output: "giod mornong"

input : "amol"
output: "omal"

input : "haorseuih"
output: "hiurseoah"
*/
package santosh_Assignment36;

public class Assignment_36 {

	void swapVowel(String input) {
		String vowels="";
		String reverseVowels="";
		
	    System.out.println("\n----------------------- :: ");
		System.out.println("\ninput :: " + input);

        for(int index=0;index<input.length();index++) {
			char ch =input.charAt(index);
			if(ch =='a'|| ch=='e' || ch=='i' || ch=='o'|| ch=='u') {
				vowels=vowels+ch;

			}
		}

		StringBuilder temp=new StringBuilder(vowels);
		reverseVowels=temp.reverse().toString();		
		char[] chars = input.toCharArray();
		int start=0;
		for(int index=0;index<chars.length;index++) {
			char ch =input.charAt(index);
			if(ch =='a'|| ch=='e' || ch=='i' || ch=='o'|| ch=='u') {
				chars[index]=reverseVowels.charAt(start++);
			}
		}

		dispayOutput(chars);
	}

	void dispayOutput(char[] chars) {
		String output="";
		for(int index=0;index<chars.length;index++) {
			output=output+chars[index];
		}
		System.out.println("Output: "+output);
	}

	public static void main(String[] a) {
		Assignment_36 assignment_36= new Assignment_36();
		assignment_36.swapVowel("good morning");
		assignment_36.swapVowel("amol");
		assignment_36.swapVowel("haorseuih");
	    System.out.println("\n----------------------- :: ");


	}
}
