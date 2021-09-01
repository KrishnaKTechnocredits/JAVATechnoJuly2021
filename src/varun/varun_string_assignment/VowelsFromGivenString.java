package varun.varun_string_assignment;

public class VowelsFromGivenString {
	String vowel(String str) {
		String input = str.toLowerCase();
		String output = "";
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i'
					|| str.charAt(index) == 'o' || str.charAt(index) == 'u') {
				output += input.charAt(index);
				count++;
			}
		}
		System.out.println("Total " + count + " vowels are there in a string");
		return output;

	}

	public static void main(String[] args) {
		VowelsFromGivenString vowelsFromGivenString = new VowelsFromGivenString();
		String input = "VarunJoshi";
		System.out.println("Vowels from given string are " + vowelsFromGivenString.vowel(input));
	}
}
