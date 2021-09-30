package himanshu_string_assignment;

public class SecondLargestWord {

	void secondLargestWord(String str) {
		String[] input = str.split(" ");
		String maxWordLength = "";
		String maxSecondWordLength = "";
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() > maxWordLength.length()) {
				maxSecondWordLength = maxWordLength;
				maxWordLength = input[index];
			} else if (input[index].length() > maxSecondWordLength.length()) {
				maxSecondWordLength = input[index];
			}
		}
		System.out.println("Second Largest word : " + maxSecondWordLength);
	}

	public static void main(String[] args) {
		String input = "Welcome to the family";
		SecondLargestWord ex = new SecondLargestWord();
		ex.secondLargestWord(input);
	}
}
