package akshay;

public class MaxRepeatingWordFrequency {
	int maxFreqCount = 0;

	void getMaxfreq(String input) {
		String str[] = input.split(" ");
		int maxFreqCount = 0;
		String repeatedWord = "";
		String temp = "";
		for (int index = 0; index < str.length; index++) {
			temp += str[index];

			int frqCount = 0;
			for (int i = 0; i < str.length; i++) {
				if (str[i].equals(temp)) {
					frqCount++;

				}

				if (maxFreqCount < frqCount) {
					maxFreqCount = frqCount;
					repeatedWord = str[index];

				}
			}
		}

		System.out.println("Max repeating word is '" +repeatedWord+ "' and frequecy is " + maxFreqCount);

	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Hello Hi";
		MaxRepeatingWordFrequency wordFrequecy = new MaxRepeatingWordFrequency();
		wordFrequecy.getMaxfreq(input);
	}
}
