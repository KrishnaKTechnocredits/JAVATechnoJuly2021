package amol_Pawar.assignment_36;

public class Assignmnet_36 {

	private boolean getVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}

		return false;
	}

	void getSwapVowelFromString(String input) {
		String vowels = "";
		String revVowels = "";
		String swapString = "";
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			boolean flag = getVowel(ch);
			if (flag) {
				vowels = vowels + ch;
			}
		}
		StringBuffer bf = new StringBuffer(vowels);
		revVowels = "" + bf.reverse();

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (getVowel(ch)) {
				swapString = swapString + revVowels.charAt(count);
				count++;
			} else {
				swapString = swapString + input.charAt(index);
			}
		}
		System.out.print(input + " : ");
		System.out.println(swapString);
	}

	public static void main(String[] args) {
		Assignmnet_36 assignmnet_36 = new Assignmnet_36();
		String input = "good morning";
		assignmnet_36.getSwapVowelFromString(input);
		String input1 = "amol";
		assignmnet_36.getSwapVowelFromString(input1);
		String input2 = "haorseuih";
		assignmnet_36.getSwapVowelFromString(input2);

	}

}
