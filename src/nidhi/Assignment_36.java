package nidhi;

/**Assignment 36: 22nd Sep 2021

WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.

input : "good morning"
output: "giod mornong"

input : "amol"
output: "omal"

input : "haorseuih"
output: "hiurseoah"
**/
import java.util.Arrays;
class Assignment_36{
	
	boolean checkVowel(char c){
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
		else
			return false;
	}
	
	String switchVowel(String input){
		
		int firstVal=0;
		int lastVal=0;
		for (int i=0;i<input.length();i++){
			if (checkVowel(input.charAt(i))){
				firstVal = i;
				break;
			}
		}
		
		for (int i=input.length()-1;i>=0;i--){
			if (checkVowel(input.charAt(i))){
				lastVal = i;
				break;
			}
		}
		String result = input.substring(0,firstVal) + input.charAt(lastVal) + input.substring(firstVal+1,lastVal) + input.charAt(firstVal) + input.substring(lastVal+1);
		
		return result;
	}
	
	public static void main(String[] arg){
		Assignment_36 assignment= new Assignment_36();
		String input1 = "good morning";
		String input2 =  "amol";
		String input3 =  "haorseuih";
		System.out.println(assignment.switchVowel(input1));
		System.out.println(assignment.switchVowel(input2));
		System.out.println(assignment.switchVowel(input3));
	}
}