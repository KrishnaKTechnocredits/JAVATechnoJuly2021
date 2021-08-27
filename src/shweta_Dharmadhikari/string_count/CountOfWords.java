package shweta_Dharmadhikari.string_count;

public class CountOfWords {

	int getNumberOfWords(String input) {
		String[] str = input.split(" ");
		return str.length;
	}

	public static void main(String[] args) {

		CountOfWords countOfWords = new CountOfWords();
		String input = "Hi Techno Credits Hello";
		System.out.println("Count of words in String is : " + countOfWords.getNumberOfWords(input));
	}
}
