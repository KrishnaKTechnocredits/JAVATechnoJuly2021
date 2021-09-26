package neha;

/*WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice versa.
input : "good morning"
output: "giod mornong"
input : "amol"
output: "omal"
input : "haorseuih"
output: "hiurseoah"*/

public class SwapVowelsAssignment36 {
	void swapVowels(String str) {
		char[] out = str.toCharArray();
		int swapCnt = 0;
		String output = "";
		int rightIndex = str.length() - 1;
		for (int leftIndex = 0; leftIndex < str.length() / 2; leftIndex++) {
			char ch1 = str.charAt(leftIndex);
			while (rightIndex >= leftIndex + 1) {
				char ch2 = str.charAt(rightIndex);
				if ((ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')
						&& (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u')) {
					out[leftIndex] = ch2;
					out[rightIndex] = ch1;
					swapCnt++;
					rightIndex--;
					break;
				}
				rightIndex--;
			}
			if (swapCnt == 0) {
				rightIndex = str.length() - 1;
			}
		}
		// build output string
		for (int i = 0; i < out.length; i++) {
			output += out[i];
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		SwapVowelsAssignment36 swapVowels = new SwapVowelsAssignment36();
		System.out.println("Swap vowels using char array");
		String input1 = "good morning";
		swapVowels.swapVowels(input1);
		String input2 = "amol";
		swapVowels.swapVowels(input2);
		String input3 = "haorseuih";
		swapVowels.swapVowels(input3);

	}
}
