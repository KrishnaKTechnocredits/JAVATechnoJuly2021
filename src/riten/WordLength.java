package riten;

class WordLength {

	void maxWordLen(String input) {
		String word[] = input.split(" ");
		int cnt = 0;
		for (int index = 0; index < word.length; index++) {

			if (cnt < word[index].length()) {
				cnt = word[index].length();

			}

		}

		for (int i = 0; i < word.length; i++) {
			if (cnt == word[i].length()) {
				System.out.println("max word is: " + word[i]);
			}
		}

	}

	public static void main(String[] args) {
		WordLength wordlen = new WordLength();
		String wordname = "good morning technocredits hi hello";
		wordlen.maxWordLen(wordname);

	}

}