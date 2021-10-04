package swati.Assignment36;

/*Assignment 36: 22nd Sep 2021
WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.
input : "good morning"
output: "giod mornong"
input : "amol"
output: "omal"
input : "haorseuih"
output: "hiurseoah"*/

public class Assignment36 {
	
	void returnVowel(String input) {
		String vowels="";
		String reverseVowels="";
		
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
		
		//System.out.print(Arrays.toString(chars));
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
		Assignment36 a1= new Assignment36();
		a1.returnVowel("good morning");
		a1.returnVowel("amol");
		a1.returnVowel("haorseuih");
	}
}
