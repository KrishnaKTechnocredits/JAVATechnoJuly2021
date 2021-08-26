package riten;

class MinWordLength {

	void minLength(String stg) {
		int cnt = 0;
		int countMin = 0;
		String word[] = stg.split(" ");
		for (int index = 0; index < word.length; index++) {
			if (word[index].length() < word[index].length() + 1 || word[index].length() == word[index].length() + 1) {
				cnt = word[index].length();
				if (countMin == 0)
					countMin = cnt;
			}
			if (cnt <= countMin) {
				countMin = cnt;
			}

		}

		for (int i = 0; i < word.length; i++) {
			if (countMin == word[i].length()) {
				System.out.println("Min word is: " + word[i]);
			}
		}
	}

	public static void main(String[] args) {
		MinWordLength minlen = new MinWordLength();
		String input = "good morning technocredits hi hello";
		minlen.minLength(input);

	}

}