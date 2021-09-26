package neha.assignment_24;

/*Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/
public class MaxFreqWord {
	private int findFreqWordsInString(String str, String[] strArr) {
		int wordFreq = 0;
		for (int index = 0; index < strArr.length; index++) {
			if (str.equals(strArr[index]))
				wordFreq++;
		}
		return wordFreq;
	}

	void displayMaxFreqWord(String str) {
		String maxFreqWord = "";
		int maxWordFreq = 0;
		int freq = 0;
		String[] splitStr = str.split(" ");
		for (int index = 0; index < splitStr.length; index++) {
			String word = splitStr[index];
			freq = findFreqWordsInString(word, splitStr);
			if (maxWordFreq < freq) {
				maxWordFreq = freq;
				maxFreqWord = word;
			}
		}
		System.out.println(maxFreqWord + " --> " + maxWordFreq);
	}

	public static void main(String[] args) {
		MaxFreqWord maxFreqWord = new MaxFreqWord();
		String input = "Hi Hello Hi Techno Hello Hi";
		System.out.println("Max frequency word with its count is: ");
		maxFreqWord.displayMaxFreqWord(input);
	}
}
