package priti.vowelProgramme36;

public class Assingment_36 {
	
	void  swapVowelInString(String input) {
		String vowel="";
		
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if (ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vowel += ch;
		}	
		String reverseVowel="";
			
		for(int index=vowel.length()-1;index>=0;index--) {
			 char ch= vowel.charAt(index);
			 reverseVowel += ch;
		}
		
		String output= "";
		int outputIndex = 0;
		for(int index=0;index<input.length();index++) {
			char ch= input.charAt(index);
			if (ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				output  = output + reverseVowel.charAt(outputIndex);
				outputIndex++;
			}else
				output += ch;
				
		}
		System.out.println("Reverse of String " +input+" is : "+output);
		
		
		
	}
	
	
	public static void main(String[] a) {
		Assingment_36 assingment_36 = new Assingment_36();
		String input = "amol";
		assingment_36.swapVowelInString(input);
		String input1 = "good morning";
		assingment_36.swapVowelInString(input1);
		String input2 = "haorseuih";
		assingment_36.swapVowelInString(input2);
	}

}
/*WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.

input : "good morning"
output: "giod mornong"

input : "amol"
output: "omal"

input : "haorseuih"
output: "hiurseoah"*/
