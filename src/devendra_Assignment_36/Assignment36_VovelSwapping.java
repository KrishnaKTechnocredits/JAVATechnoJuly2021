package devendra_Assignment_36;

public class Assignment36_VovelSwapping {
	String getVowels(String input) {
		char ch;
		String vowels = "";
		String vowelsRev = "";
		for(int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vowels += ch;
		}
		for(int index = vowels.length() - 1; index >= 0; index--) {
			vowelsRev += vowels.charAt(index);
		}
		return vowelsRev;
	}
	
	String swapVowel(String input) {
		char ch;
		String output = "";
		String vowels = getVowels(input);
		int vowelsIndex = 0;
		for(int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output += vowels.charAt(vowelsIndex);
				vowelsIndex++;
			}
			else
				output += ch;
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment36_VovelSwapping obj = new Assignment36_VovelSwapping();
		String str1 = "good morning";
		String str2 = "amol";
		String str3 = "haorseuih";
		System.out.println("input: " + str1 + " & output: " + obj.swapVowel(str1));
		System.out.println("input: " + str2 + " & output: " + obj.swapVowel(str2));
		System.out.println("input: " + str3 + " & output: " + obj.swapVowel(str3));
	}
}

/*

WAP to swap vowel in String mean last first vowel should replace
first vowel in String and vice verse.
input : "good morning" output: "giod mornong"
input : "amol" output: "omal"
input : "haorseuih" output: "hiurseoah" 

*/