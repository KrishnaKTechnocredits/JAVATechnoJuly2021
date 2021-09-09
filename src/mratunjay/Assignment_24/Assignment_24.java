package mratunjay.Assignment_24;

public class Assignment_24 {

	void getTheCountOfNumberOfVowels(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {

			char ch = input.charAt(index);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				count++;
			}
		}
		System.out.println("Number of Vowels in given string: " +count);

	}

	void getMaxRepeatingWord(String input) {
		String[] str = input.split(" ");
		int maxcount = 0;
		int count = 0;
		String maxword = "";
		for (int index = 0; index < str.length; index++) {
			count = 0;
			for (int j = 0; j < str.length; j++) {

				if (str[index].equals(str[j])) {
					count++;
				}
				if (maxcount < count) {
					maxword = str[index];
					maxcount = count;

				}
			}
		}
		System.out.println("max repeated word: " + maxword + "  repeated times: " + maxcount);
	}

	public static void main(String[] args) {
		String input = "technocredits";
		Assignment_24 A_24 = new Assignment_24();
		A_24.getTheCountOfNumberOfVowels(input);
		String input1 = "Hi Hello Hi Techno Hi Hello";
		A_24.getMaxRepeatingWord(input1);

	}

}
