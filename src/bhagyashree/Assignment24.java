/*
 Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i 

Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3

*/

package bhagyashree;

public class Assignment24 {
	String vowels = "";

	void getVowels(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
					|| ch == 'U' || ch == 'u') {
				vowels = String.valueOf(ch);
				System.out.println("Vowels in a given string: " + vowels);
			}
			// System.out.println("Vowels in a given string: "+vowels);

		}

	}

	int getCountofRepeatWordsinString(String input) {
		int cnt = 0;
		String temp = "";
		int maxcnt = 0;
		String[] data = input.split(" ");
		// System.out.println(data);
		for (int i = 0; i < data.length; i++) {
			cnt = 0;
			temp = data[i];
			for (int j = 0; j < data.length; j++) {
				if (temp.equals(data[j])) {
					cnt++;
				}
				if (maxcnt < cnt)
					maxcnt = cnt;

			}
		}
		return maxcnt;

	}

	public static void main(String[] args) {
		Assignment24 assignment24 = new Assignment24();
		String input = "Technocredits";
		assignment24.getVowels(input);

		System.out.println("Total count of repeating words in string is: "
				+ assignment24.getCountofRepeatWordsinString("Hi Hello Hi Techno Hello Hi Hi Hi Hi"));

	}
}
