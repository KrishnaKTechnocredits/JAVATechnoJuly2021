package himanshu_string_assignment;

public class MaximumRepeatingWord {

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

		MaximumRepeatingWord ass24_2 = new MaximumRepeatingWord();
		ass24_2.countRepeatedWord(input);
	}

}
