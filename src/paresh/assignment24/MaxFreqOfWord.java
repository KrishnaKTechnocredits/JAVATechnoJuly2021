package paresh.assignment24;

/*Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/

public class MaxFreqOfWord {
	void MaxRepeatingWord(String input) {
		String[] str = input.split(" ");
		int count = 0;
		String max = "";
		for (int index = 0; index < input.length(); index++) {
			int individualCount = 1;
			for (int j = index + 1; j < str.length; j++) {
				if (str[j].equals(str[index])) {
					individualCount++;
				}
			}
			if (count < individualCount) {
				count = individualCount;
				max = str[index];
			}
		}
		System.out
				.println("Maximum repeated word in a string is '" + max + "', repeated for " + count + " times.");
	}

	public static void main(String[] args) {
		MaxFreqOfWord maxRepeatingWordINaString = new MaxFreqOfWord();
		maxRepeatingWordINaString.MaxRepeatingWord("Hi Hello Hi Techno Hello Hi");
	}

}