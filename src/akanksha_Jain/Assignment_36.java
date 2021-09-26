/* Assignment 36: 22nd Sep 2021
WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.
input : "good morning"
output: "giod mornong"
input : "amol"
output: "omal"
input : "haorseuih"
output: "hiurseoah" */

package akanksha_Jain;

public class Assignment_36 {
	
	void swapVowel(String input) {
		int count = 0;
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index)=='a' || input.charAt(index)=='e' || input.charAt(index)=='i' || input.charAt(index)=='o' || input.charAt(index)=='u') {
				count++;
			}
		}
		int[] arr = new int[count];
		int temp = 0;
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index)=='a' || input.charAt(index)=='e' || input.charAt(index)=='i' || input.charAt(index)=='o' || input.charAt(index)=='u') {
				arr[temp] = index;
				temp++;
			}
		}
		char[] ch = input.toCharArray();
		char swapVowel='\0';
		for(int index=0; index<arr.length/2; index++) {
			swapVowel = ch[arr[index]];
			ch[arr[index]] = ch[arr[arr.length-1-index]];
			ch[arr[arr.length-1-index]] = swapVowel;
		}
		System.out.println("Input- " + input + "\nOutput- " + new String(ch));
	}
	
	public static void main(String[] args) {
		String input1 = "good morning";
		String input2 = "amol";
		String input3 = "haorseuih";
		Assignment_36 assignment_36 = new Assignment_36();
		assignment_36.swapVowel(input1);
		assignment_36.swapVowel(input2);
		assignment_36.swapVowel(input3);
	}
}