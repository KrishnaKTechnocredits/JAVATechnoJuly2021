package riten;

class MinWordLength {

	void minLength(String stg) {

		int countmin = 0;
		String word[] = stg.split(" ");
		for (int index = 0; index < word.length; index++) {
			if (countmin == 0) {
				countmin = word[index].length();
			}
			if (word[index].length() < countmin) {
				countmin = word[index].length();
			}

		}

		for (int i = 0; i < word.length; i++) {
			if (countmin == word[i].length()) {
				System.out.println("Min word is: " + word[i]);
			}
		}
	}

	public static void main(String[] args) {
		MinWordLength minlen = new MinWordLength();
		String input = "good morning technocredits hi hello ";
		minlen.minLength(input);

	}

}