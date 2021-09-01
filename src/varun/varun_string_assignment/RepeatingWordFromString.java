package varun.varun_string_assignment;

public class RepeatingWordFromString {
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
		System.out.println("Count of repetitive word in a given string " + maxcount);
		System.out.println("Word is " + maxWord);
	}

	public static void main(String[] args) {
		RepeatingWordFromString repeatingWordFromString = new RepeatingWordFromString();
		String input = "Hello Hi Hello Hi Techno Hello Hello Hi";
		repeatingWordFromString.countRepeatedWord(input);
	}
}
