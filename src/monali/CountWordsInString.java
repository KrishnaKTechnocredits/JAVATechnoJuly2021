package monali;


public class CountWordsInString {
	/*program 1: Find how many words in a given statement.
	input = "Hi Techno Credits Hello"
	output : 4*/

	void getWordFrequency(String input) {
		String arr[] = input.split(" ");
		System.out.println("Number of words in given string are : " +arr.length);
	}

	public static void main(String[] args) {
		String input = "Hi Techno Credits Hello";
		CountWordsInString wordFreq = new CountWordsInString();
		wordFreq.getWordFrequency(input);
	}
}
