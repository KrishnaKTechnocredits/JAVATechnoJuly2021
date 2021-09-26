package neha;

/*WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice versa.
input : "good morning"
output: "giod mornong"
input : "amol"
output: "omal"
input : "haorseuih"
output: "hiurseoah"*/

public class SwapVowelsWithStringBuilderAssignment36 {
	void swapVowels(String str) {
		int swapCnt = 0;
		StringBuilder sb = new StringBuilder(str);
		int rightIndex = str.length() - 1;
		for (int leftIndex = 0; leftIndex < str.length() / 2; leftIndex++) {
			char ch1 = str.charAt(leftIndex);
			while (rightIndex >= leftIndex + 1) {
				char ch2 = str.charAt(rightIndex);
				if ((ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')
						&& (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u')) {
					sb.setCharAt(leftIndex, ch2);
					sb.setCharAt(rightIndex, ch1);
					swapCnt++;
					rightIndex--;
					break;
				}
				rightIndex--;
			}
			if (swapCnt == 0) { // if swap count start search from rightmost end again for next leftmost letter
								// in string
				rightIndex = str.length() - 1;
			}
		}
		// build output string
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		SwapVowelsWithStringBuilderAssignment36 swapVowelsUsingStringBuilder = new SwapVowelsWithStringBuilderAssignment36();
		System.out.println("Swap vowels using string builder");
		String input1 = "good morning";
		swapVowelsUsingStringBuilder.swapVowels(input1);
		String input2 = "amol";
		swapVowelsUsingStringBuilder.swapVowels(input2);
		String input3 = "haorseuih";
		swapVowelsUsingStringBuilder.swapVowels(input3);

	}
}
