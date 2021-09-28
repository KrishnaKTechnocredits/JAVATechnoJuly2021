package himanshu_string_assignment;

public class SwappingVowelsInString {

	static void getSwapVowel(String str) {
		String vowel = "";
		String output = "";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel += ch;
			}
		}
		int reverseIndex = vowel.length() - 1;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output += vowel.charAt(reverseIndex);
				reverseIndex--;
			} else {
				output += ch;
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		String str1 = "good morning";
		String str2 = "himanshu";
		String str3 = "haorseuih";

		SwappingVowelsInString.getSwapVowel(str1);
		SwappingVowelsInString.getSwapVowel(str2);
		SwappingVowelsInString.getSwapVowel(str3);
	}
}
