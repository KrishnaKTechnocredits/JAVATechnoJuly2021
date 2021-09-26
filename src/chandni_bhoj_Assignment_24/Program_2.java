package chandni_bhoj_Assignment_24;

public class Program_2 {

	int getFrequencyOfWords (String input, String word) {
		int count = 0;
		String [] input1 = input.split(" ");
		for (int index = 0; index < input1.length; index++) {
			if (word.equals(input1[index]))
				count++;
		}
		return count;
	}

	void getMaxFrequencyWord (String input1) {
		int maxCount = 0;
		String maxWord = " ";
		String [] input2 = input1.split(" ");
		for (int index = 0; index < input2.length; index++) {
			if (getFrequencyOfWords(input1, input2[index]) > maxCount) {
				maxCount = getFrequencyOfWords(input1, input2[index]);
				maxWord = input2[index];
			}
		}
		System.out.println ("Frequency of " + maxWord + " is " + maxCount);
	}

	public static void main(String[] args) {
		new Program_2().getMaxFrequencyWord("Hi Hello Hi Techno Hello Hi");
	}
}
