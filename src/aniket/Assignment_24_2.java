package aniket;

public class Assignment_24_2 {
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

		System.out.println("Maxfrequency of word in string is " + maxFreqCount);
		System.out.println("Max repeated word in the string is " + repeatedWord);

	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Hello Hi";
		Assignment_24_2 assignment_24_2 = new Assignment_24_2();
		assignment_24_2.getMaxfreq(input);
	}
}
