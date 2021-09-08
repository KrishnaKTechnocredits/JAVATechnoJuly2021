package siddharth;

public class Assignment24_2 {
	void countRepeatedWord(String str) {
		String[] input = str.split(" ");
		int maxcount = 0;
		String maxWord = "";
		for (int index = 0; index < input.length; index++) {
			int count = 1;
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index].equalsIgnoreCase(input[innerIndex])) {
					count++;
				}
				if (count > maxcount) {
					maxcount = count;
					maxWord = input[innerIndex];
				}
			}
		}
		System.out.println("Count of repetitive word in a given string :  " + maxWord + " " + maxcount + "times");
	}

	public static void main(String[] args) {

		String input = "Hello Hi Hello Hi Techno Hello Hello Hi";

		Assignment24_2 ass24_2 = new Assignment24_2();
		ass24_2.countRepeatedWord(input);
	}
}
