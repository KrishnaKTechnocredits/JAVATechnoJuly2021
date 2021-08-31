package shantanu.numberOfVowels_repeatingWord_assignment24;

public class NumberOfVowelsInString {
	boolean isVowel(char ch) {
		if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u') {	
			return true;
		}
		else
			return false;
	}
	void displayNumberOfVowelsInString(String input) {
		int count = 0;
		String str = input.toLowerCase();
		System.out.println("Vowels in the string are: ");
		for(int index = 0; index < str.length(); index++) {
			if(index == str.indexOf(str.charAt(index)))
				if(isVowel(str.charAt(index))) {
					count++;
					System.out.println(str.charAt(index));
				}
		}
		System.out.println("Total vowels in the string: "+count);
	}
	public static void main(String[] args) {
		NumberOfVowelsInString numberOfVowelsInString = new NumberOfVowelsInString();
		String input = "technocredits";
		numberOfVowelsInString.displayNumberOfVowelsInString(input);
	}
}
